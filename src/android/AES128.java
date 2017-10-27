package com.cheweifei.wehard;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES128 {
  public static final String CIPHER_ALGORITHM = "AES/CBC/PKCS7Padding";

  private static AlgorithmParameters generateIV(byte[] key)
    throws Exception {
    AlgorithmParameters localAlgorithmParameters = AlgorithmParameters
      .getInstance("AES");
    localAlgorithmParameters.init(new IvParameterSpec(key));
    return localAlgorithmParameters;
  }

  private static Key convertToKey(byte[] paramArrayOfByte) throws Exception {
    return new SecretKeySpec(paramArrayOfByte, "AES");
  }

  public static byte[] decrypt(byte[] data,
                               byte[] key) throws Exception {
//    Security.addProvider(new BouncyCastleProvider());
    AlgorithmParameters localAlgorithmParameters = generateIV(key);
    Key keyObj = convertToKey(key);
    Cipher localCipher = Cipher.getInstance(CIPHER_ALGORITHM);
    localCipher.init(2, keyObj, localAlgorithmParameters);
    return localCipher.doFinal(data);
  }

  public static byte[] encrypt(byte[] data,
                               byte[] key) throws Exception {
    //    Security.addProvider(new BouncyCastleProvider());
    AlgorithmParameters localAlgorithmParameters = generateIV(key);
    Key keyObj = convertToKey(key);
    Cipher localCipher = Cipher.getInstance(CIPHER_ALGORITHM);
    localCipher.init(1, keyObj, localAlgorithmParameters);
    return localCipher.doFinal(data);
  }
  /**
   * 将二进制转换成16进制
   *
   * @param buf
   * @return
   */
  public static String parseByte2HexStr(byte buf[]) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < buf.length; i++) {
      String hex = Integer.toHexString(buf[i] & 0xFF);
      if (hex.length() == 1) {
        hex = '0' + hex;
      }
      sb.append(hex.toUpperCase());
    }
    return sb.toString();
  }

  /**
   * 将16进制转换为二进制
   *
   * @param hexStr
   * @return
   */
  public static byte[] parseHexStr2Byte(String hexStr) {
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

  public static int getCmdId(byte[] paramArrayOfByte) {
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

  public static byte[] getFixHeadBuf(int len, int command, int seq) {
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
}
