package com.cheweifei.wehard;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.zip.CRC32;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Base64;

import com.cheweifei.cordova.AES128;
import com.cheweifei.wehard.MmBp.EmInitScence;
import com.cheweifei.wehard.MmBp.EmPlatformType;
import com.google.protobuf.ByteString;

public class WeHardPlugin extends CordovaPlugin {
  private static final String TAG = "WeHardPlugin";
  private static final String RECV_DATA = "receiveData";
  private static final String SEND_DATA = "sendData";
  private static byte[] SESSION_KEY = new byte[16];
  private static final int HEAD_LEN = 8;
  private static final int SEND_DATA_HEAD_LEN = 12;

  @Override
  public boolean execute(String action, CordovaArgs args,
                         CallbackContext callbackContext) throws JSONException {
    boolean validAction = true;
    LOG.e(TAG, "action = ========================" + action);
    try {

      if (action.equals(RECV_DATA)) {
        byte[] arrayByte = args.getArrayBuffer(0);
        String sessionKey = args.getString(1);
        String aes = args.getString(2);
        byte[] commandHead = Arrays.copyOfRange(arrayByte, 0, HEAD_LEN);
        byte[] body = Arrays.copyOfRange(arrayByte, HEAD_LEN,
          arrayByte.length);
        int command = getCmdId(commandHead);
        analyComand(command, body, sessionKey, aes, callbackContext);

      } else if (action.equals(SEND_DATA)) {
        String byteStr = args.getString(0);
        String sessionKey = args.getString(1);
        sendData(byteStr, sessionKey, callbackContext);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return validAction;
  }

  private int getCmdId(byte[] paramArrayOfByte) {
    int j = -1;
    int i = j;
    if (paramArrayOfByte[0] == -2) {
      i = j;
      if (paramArrayOfByte[1] == 1) {
        i = (paramArrayOfByte[4] << 8) + paramArrayOfByte[5];
      }
    }
    return i;
  }

  private byte[] getFixHeadBuf(int len, int command, int seq) {
    byte[] arrayOfByte = new byte[len];
    arrayOfByte[0] = -2;
    arrayOfByte[1] = 1;
    arrayOfByte[2] = ((byte) (len >> 8 & 0xFF));
    arrayOfByte[3] = ((byte) (len & 0xFF));
    arrayOfByte[4] = ((byte) (command >> 8 & 0xFF));
    arrayOfByte[5] = ((byte) (command & 0xFF));
    arrayOfByte[6] = ((byte) (seq >> 8 & 0xFF));
    arrayOfByte[7] = ((byte) (seq & 0xFF));
    return arrayOfByte;
  }

  private byte[] parseHexStr2Byte(String hexStr) {
    if (hexStr.length() < 1)
      return null;
    byte[] result = new byte[hexStr.length() / 2];
    for (int i = 0; i < hexStr.length() / 2; i++) {
      int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
      int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
        16);
      result[i] = (byte) (high * 16 + low);
    }
    return result;
  }

  private void analyComand(int command, byte[] body, String sessionKey,
                           String aes, CallbackContext callbackContex) {

    switch (command) {
      case 0:
        break;
      case 10001:
        authReq(command, body, sessionKey, aes, callbackContex);
        break;
      case 10002:
        initDataReq(command, body, sessionKey, callbackContex);
        break;
      case 10003:
        initReq(command, body, sessionKey, callbackContex);
        break;
      // case 20001: return ECI_resp_auth;
      // case 20002: return ECI_resp_sendData;
      // case 20003: return ECI_resp_init;
      // case 30001: return ECI_push_recvData;
      // case 30002: return ECI_push_switchView;
      // case 30003: return ECI_push_switchBackgroud;
      // case 29999: return ECI_err_decode;
      default:
        break;
    }
  }

  private static String byteArrayToBase64(byte[] bytes) {
    return Base64.encodeToString(bytes, Base64.NO_WRAP);
  }

  private void randomSessionKey() {
    StringBuffer sb = new StringBuffer();
    String keyStr = "ABCDEF0123456789";
    Random random = new Random();
    for (int i = 0; i < 16; i++) {
      int index = random.nextInt(16);
      sb.append("0").append(keyStr.charAt(index));
    }
    SESSION_KEY = parseHexStr2Byte(sb.toString());
  }

  private void authReq(int command, byte[] arrayByte, String sessionKey,
                       String aes, CallbackContext callbackContext) {

    try {
      // ByteArrayInputStream authReqinput = new ByteArrayInputStream(
      // arrayByte);
      // MmBp.AuthRequest authRequest = MmBp.AuthRequest
      // .parseFrom(authReqinput);
      randomSessionKey();
      MmBp.AuthResponse.Builder resp = MmBp.AuthResponse.newBuilder();
      byte[] AES_KEY = parseHexStr2Byte(aes);
      byte[] encryptSessionKey = AES128.encrypt(SESSION_KEY, AES_KEY);
      resp.setAesSessionKey(ByteString.copyFrom(encryptSessionKey));
      resp.setBaseResponse(MmBp.BaseResponse.newBuilder().setErrCode(0));

      byte[] outData = resp.build().toByteArray();
      byte[] respHead = getAllData(outData,
        MmBp.EmCmdId.ECI_resp_auth_VALUE, 1);
      JSONObject json = new JSONObject();
      try {
        json.put("cmd", command);
        json.put("respData", byteArrayToBase64(respHead));
        json.put("recvData", "");
      } catch (JSONException e1) {
        e1.printStackTrace();
      }
      PluginResult result = new PluginResult(PluginResult.Status.OK, json);
      callbackContext.sendPluginResult(result);

    } catch (Exception e) {
      callbackContext.error(e.getMessage());
    }
  }

  private void initDataReq(int command, byte[] arrayByte, String sessionKey,
                           CallbackContext callbackContext) {

    try {
      ByteArrayInputStream initReqinput = new ByteArrayInputStream(
        AES128.decrypt(arrayByte, SESSION_KEY));
      MmBp.SendDataRequest sendRequest = MmBp.SendDataRequest
        .parseFrom(initReqinput);
      MmBp.SendDataResponse.Builder resp = MmBp.SendDataResponse
        .newBuilder();
      resp.setBaseResponse(MmBp.BaseResponse.newBuilder().setErrCode(0));
      String recvData = sendRequest.getData()
        .substring(SEND_DATA_HEAD_LEN).toStringUtf8();
      if ("verifyID".equals(recvData)) {
        resp.setData(ByteString.copyFrom(sessionKey.getBytes("utf-8")));
      } else {
        resp.setData(ByteString.copyFrom(parseHexStr2Byte("01")));
      }
      byte[] outData = AES128.encrypt(resp.build().toByteArray(),
        SESSION_KEY);
      byte[] respHead = getAllData(outData,
        MmBp.EmCmdId.ECI_resp_sendData_VALUE, 0);

      JSONObject json = new JSONObject();
      try {
        json.put("cmd", command);
        json.put("respData", byteArrayToBase64(respHead));
        json.put("recvData", recvData);
      } catch (JSONException e1) {
        e1.printStackTrace();
      }
      callbackContext.success(json);

    } catch (Exception e) {
      callbackContext.error(e.getMessage());
    }
  }

  private void initReq(int command, byte[] arrayByte, String sessionKey,
                       CallbackContext callbackContext) {

    try {

      ByteArrayInputStream initReqinput = new ByteArrayInputStream(
        AES128.decrypt(arrayByte, SESSION_KEY));
      MmBp.InitRequest initRequest = MmBp.InitRequest
        .parseFrom(initReqinput);

      MmBp.InitResponse.Builder resp = MmBp.InitResponse.newBuilder();
      CRC32 localCRC32 = new CRC32();
      localCRC32.update(initRequest.getChallenge().toByteArray());
      resp.setChalleangeAnswer((int) localCRC32.getValue());
      resp.setUserIdHigh(4660);
      resp.setUserIdLow(22136);
      resp.setTime(0);
      resp.setTimeZone(0);
      resp.setAutoSyncMaxDurationSecond(0);
      resp.setPlatformType(EmPlatformType.EPT_andriod);
      resp.setInitScence(EmInitScence.EIS_deviceChat);
      resp.setBaseResponse(MmBp.BaseResponse.newBuilder().setErrCode(0));
      byte[] outData = AES128.encrypt(resp.build().toByteArray(),
        SESSION_KEY);
      byte[] respHead = getAllData(outData,
        MmBp.EmCmdId.ECI_resp_init_VALUE, 2);
      JSONObject json = new JSONObject();
      try {
        json.put("cmd", command);
        json.put("respData", byteArrayToBase64(respHead));
        json.put("recvData", "");
      } catch (JSONException e1) {
        e1.printStackTrace();
      }
      callbackContext.success(json);

    } catch (Exception e) {
      callbackContext.error(e.getMessage());
    }
  }

  private byte[] getAllData(byte[] bodyData, int command, int seq) {
    int len = bodyData.length + HEAD_LEN;
    byte[] respHead = getFixHeadBuf(len, command, seq);
    System.arraycopy(bodyData, 0, respHead, HEAD_LEN, len - HEAD_LEN);
    return respHead;
  }

  private void sendData(String byteStr, String sessionKey,
                        CallbackContext callbackContext) {

    try {
      MmBp.RecvDataPush.Builder recvBuild = MmBp.RecvDataPush
        .newBuilder();
      recvBuild.setBasePush(MmBp.BasePush.newBuilder());
      // byte[] sendDataByte = AES128.parseHexStr2Byte(byteStr);
      byte[] sendDataByte = byteStr.getBytes("utf-8");
      recvBuild.setData(ByteString.copyFrom(sendDataByte));
      recvBuild.setType(MmBp.EmDeviceDataType.EDDT_manufatureSvr);
      byte[] outData = AES128.encrypt(recvBuild.build().toByteArray(),
        SESSION_KEY);
      byte[] respHead = getAllData(outData,
        MmBp.EmCmdId.ECI_push_recvData_VALUE, 0);
      callbackContext.success(respHead);

    } catch (Exception e) {
      callbackContext.error(e.getMessage());
    }
  }
}
