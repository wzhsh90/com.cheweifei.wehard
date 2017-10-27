package com.cheweifei.wehard;

public final class MmBp {
  private MmBp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code MmBp.EmCmdId}
   */
  public enum EmCmdId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ECI_none = 0;</code>
     */
    ECI_none(0, 0),
    /**
     * <code>ECI_req_auth = 10001;</code>
     *
     * <pre>
     * req： 蓝牙设备 -&gt; 微信/厂商服务器
     * </pre>
     */
    ECI_req_auth(1, 10001),
    /**
     * <code>ECI_req_sendData = 10002;</code>
     *
     * <pre>
     * 蓝牙设备发送数据给微信或厂商
     * </pre>
     */
    ECI_req_sendData(2, 10002),
    /**
     * <code>ECI_req_init = 10003;</code>
     *
     * <pre>
     * 初始化
     * </pre>
     */
    ECI_req_init(3, 10003),
    /**
     * <code>ECI_resp_auth = 20001;</code>
     *
     * <pre>
     * resp：微信/厂商服务器 -&gt; 蓝牙设备
     * </pre>
     */
    ECI_resp_auth(4, 20001),
    /**
     * <code>ECI_resp_sendData = 20002;</code>
     */
    ECI_resp_sendData(5, 20002),
    /**
     * <code>ECI_resp_init = 20003;</code>
     */
    ECI_resp_init(6, 20003),
    /**
     * <code>ECI_push_recvData = 30001;</code>
     *
     * <pre>
     * push：微信/厂商服务器 -&gt; 蓝牙设备
     * </pre>
     */
    ECI_push_recvData(7, 30001),
    /**
     * <code>ECI_push_switchView = 30002;</code>
     *
     * <pre>
     * 进入/退出界面
     * </pre>
     */
    ECI_push_switchView(8, 30002),
    /**
     * <code>ECI_push_switchBackgroud = 30003;</code>
     *
     * <pre>
     * 切换后台
     * </pre>
     */
    ECI_push_switchBackgroud(9, 30003),
    /**
     * <code>ECI_err_decode = 29999;</code>
     *
     * <pre>
     * 解密失败的错误码。注意：这不是 cmdid。为节省固定包头大小，这种特殊的错误码放在包头的 cmdid 字段。
     * </pre>
     */
    ECI_err_decode(10, 29999),
    ;

    /**
     * <code>ECI_none = 0;</code>
     */
    public static final int ECI_none_VALUE = 0;
    /**
     * <code>ECI_req_auth = 10001;</code>
     *
     * <pre>
     * req： 蓝牙设备 -&gt; 微信/厂商服务器
     * </pre>
     */
    public static final int ECI_req_auth_VALUE = 10001;
    /**
     * <code>ECI_req_sendData = 10002;</code>
     *
     * <pre>
     * 蓝牙设备发送数据给微信或厂商
     * </pre>
     */
    public static final int ECI_req_sendData_VALUE = 10002;
    /**
     * <code>ECI_req_init = 10003;</code>
     *
     * <pre>
     * 初始化
     * </pre>
     */
    public static final int ECI_req_init_VALUE = 10003;
    /**
     * <code>ECI_resp_auth = 20001;</code>
     *
     * <pre>
     * resp：微信/厂商服务器 -&gt; 蓝牙设备
     * </pre>
     */
    public static final int ECI_resp_auth_VALUE = 20001;
    /**
     * <code>ECI_resp_sendData = 20002;</code>
     */
    public static final int ECI_resp_sendData_VALUE = 20002;
    /**
     * <code>ECI_resp_init = 20003;</code>
     */
    public static final int ECI_resp_init_VALUE = 20003;
    /**
     * <code>ECI_push_recvData = 30001;</code>
     *
     * <pre>
     * push：微信/厂商服务器 -&gt; 蓝牙设备
     * </pre>
     */
    public static final int ECI_push_recvData_VALUE = 30001;
    /**
     * <code>ECI_push_switchView = 30002;</code>
     *
     * <pre>
     * 进入/退出界面
     * </pre>
     */
    public static final int ECI_push_switchView_VALUE = 30002;
    /**
     * <code>ECI_push_switchBackgroud = 30003;</code>
     *
     * <pre>
     * 切换后台
     * </pre>
     */
    public static final int ECI_push_switchBackgroud_VALUE = 30003;
    /**
     * <code>ECI_err_decode = 29999;</code>
     *
     * <pre>
     * 解密失败的错误码。注意：这不是 cmdid。为节省固定包头大小，这种特殊的错误码放在包头的 cmdid 字段。
     * </pre>
     */
    public static final int ECI_err_decode_VALUE = 29999;


    public final int getNumber() { return value; }

    public static EmCmdId valueOf(int value) {
      switch (value) {
        case 0: return ECI_none;
        case 10001: return ECI_req_auth;
        case 10002: return ECI_req_sendData;
        case 10003: return ECI_req_init;
        case 20001: return ECI_resp_auth;
        case 20002: return ECI_resp_sendData;
        case 20003: return ECI_resp_init;
        case 30001: return ECI_push_recvData;
        case 30002: return ECI_push_switchView;
        case 30003: return ECI_push_switchBackgroud;
        case 29999: return ECI_err_decode;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmCmdId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmCmdId>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmCmdId>() {
            public EmCmdId findValueByNumber(int number) {
              return EmCmdId.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(0);
    }

    private static final EmCmdId[] VALUES = values();

    public static EmCmdId valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmCmdId(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmCmdId)
  }

  /**
   * Protobuf enum {@code MmBp.EmErrorCode}
   */
  public enum EmErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EEC_system = -1;</code>
     *
     * <pre>
     * 通用的错误
     * </pre>
     */
    EEC_system(0, -1),
    /**
     * <code>EEC_needAuth = -2;</code>
     *
     * <pre>
     * 设备未登录
     * </pre>
     */
    EEC_needAuth(1, -2),
    /**
     * <code>EEC_sessionTimeout = -3;</code>
     *
     * <pre>
     * session 超时，需要重新登录
     * </pre>
     */
    EEC_sessionTimeout(2, -3),
    /**
     * <code>EEC_decode = -4;</code>
     *
     * <pre>
     * proto 解码失败
     * </pre>
     */
    EEC_decode(3, -4),
    /**
     * <code>EEC_deviceIsBlock = -5;</code>
     *
     * <pre>
     * 设备出现异常，导致被微信临时性禁止登录
     * </pre>
     */
    EEC_deviceIsBlock(4, -5),
    /**
     * <code>EEC_serviceUnAvalibleInBackground = -6;</code>
     *
     * <pre>
     * ios 处于后台模式，无法正常服务
     * </pre>
     */
    EEC_serviceUnAvalibleInBackground(5, -6),
    /**
     * <code>EEC_deviceProtoVersionNeedUpdate = -7;</code>
     *
     * <pre>
     * 设备的 proto 版本过老，需要更新
     * </pre>
     */
    EEC_deviceProtoVersionNeedUpdate(6, -7),
    /**
     * <code>EEC_phoneProtoVersionNeedUpdate = -8;</code>
     *
     * <pre>
     * 微信客户端的 proto 版本过老，需要更新
     * </pre>
     */
    EEC_phoneProtoVersionNeedUpdate(7, -8),
    /**
     * <code>EEC_maxReqInQueue = -9;</code>
     *
     * <pre>
     * 设备发送了多个请求，并且没有收到回包。微信客户端请求队列拥塞。
     * </pre>
     */
    EEC_maxReqInQueue(8, -9),
    /**
     * <code>EEC_userExitWxAccount = -10;</code>
     *
     * <pre>
     * 用户退出微信帐号。
     * </pre>
     */
    EEC_userExitWxAccount(9, -10),
    ;

    /**
     * <code>EEC_system = -1;</code>
     *
     * <pre>
     * 通用的错误
     * </pre>
     */
    public static final int EEC_system_VALUE = -1;
    /**
     * <code>EEC_needAuth = -2;</code>
     *
     * <pre>
     * 设备未登录
     * </pre>
     */
    public static final int EEC_needAuth_VALUE = -2;
    /**
     * <code>EEC_sessionTimeout = -3;</code>
     *
     * <pre>
     * session 超时，需要重新登录
     * </pre>
     */
    public static final int EEC_sessionTimeout_VALUE = -3;
    /**
     * <code>EEC_decode = -4;</code>
     *
     * <pre>
     * proto 解码失败
     * </pre>
     */
    public static final int EEC_decode_VALUE = -4;
    /**
     * <code>EEC_deviceIsBlock = -5;</code>
     *
     * <pre>
     * 设备出现异常，导致被微信临时性禁止登录
     * </pre>
     */
    public static final int EEC_deviceIsBlock_VALUE = -5;
    /**
     * <code>EEC_serviceUnAvalibleInBackground = -6;</code>
     *
     * <pre>
     * ios 处于后台模式，无法正常服务
     * </pre>
     */
    public static final int EEC_serviceUnAvalibleInBackground_VALUE = -6;
    /**
     * <code>EEC_deviceProtoVersionNeedUpdate = -7;</code>
     *
     * <pre>
     * 设备的 proto 版本过老，需要更新
     * </pre>
     */
    public static final int EEC_deviceProtoVersionNeedUpdate_VALUE = -7;
    /**
     * <code>EEC_phoneProtoVersionNeedUpdate = -8;</code>
     *
     * <pre>
     * 微信客户端的 proto 版本过老，需要更新
     * </pre>
     */
    public static final int EEC_phoneProtoVersionNeedUpdate_VALUE = -8;
    /**
     * <code>EEC_maxReqInQueue = -9;</code>
     *
     * <pre>
     * 设备发送了多个请求，并且没有收到回包。微信客户端请求队列拥塞。
     * </pre>
     */
    public static final int EEC_maxReqInQueue_VALUE = -9;
    /**
     * <code>EEC_userExitWxAccount = -10;</code>
     *
     * <pre>
     * 用户退出微信帐号。
     * </pre>
     */
    public static final int EEC_userExitWxAccount_VALUE = -10;


    public final int getNumber() { return value; }

    public static EmErrorCode valueOf(int value) {
      switch (value) {
        case -1: return EEC_system;
        case -2: return EEC_needAuth;
        case -3: return EEC_sessionTimeout;
        case -4: return EEC_decode;
        case -5: return EEC_deviceIsBlock;
        case -6: return EEC_serviceUnAvalibleInBackground;
        case -7: return EEC_deviceProtoVersionNeedUpdate;
        case -8: return EEC_phoneProtoVersionNeedUpdate;
        case -9: return EEC_maxReqInQueue;
        case -10: return EEC_userExitWxAccount;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmErrorCode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmErrorCode>() {
            public EmErrorCode findValueByNumber(int number) {
              return EmErrorCode.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(1);
    }

    private static final EmErrorCode[] VALUES = values();

    public static EmErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmErrorCode(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmErrorCode)
  }

  /**
   * Protobuf enum {@code MmBp.EmAuthMethod}
   *
   * <pre>
   * req, resp ========================================
   * </pre>
   */
  public enum EmAuthMethod
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EAM_md5 = 1;</code>
     *
     * <pre>
     * 设备通过 Md5DeviceTypeAndDeviceId，来通过微信 app 的认证。1如果是用 aes 加密，注意设置 AesSign 有值。
     * </pre>
     */
    EAM_md5(0, 1),
    /**
     * <code>EAM_macNoEncrypt = 2;</code>
     *
     * <pre>
     *2. 如果是没有加密，注意设置 AesSign为空或者长度为零。
     * </pre>
     */
    EAM_macNoEncrypt(1, 2),
    ;

    /**
     * <code>EAM_md5 = 1;</code>
     *
     * <pre>
     * 设备通过 Md5DeviceTypeAndDeviceId，来通过微信 app 的认证。1如果是用 aes 加密，注意设置 AesSign 有值。
     * </pre>
     */
    public static final int EAM_md5_VALUE = 1;
    /**
     * <code>EAM_macNoEncrypt = 2;</code>
     *
     * <pre>
     *2. 如果是没有加密，注意设置 AesSign为空或者长度为零。
     * </pre>
     */
    public static final int EAM_macNoEncrypt_VALUE = 2;


    public final int getNumber() { return value; }

    public static EmAuthMethod valueOf(int value) {
      switch (value) {
        case 1: return EAM_md5;
        case 2: return EAM_macNoEncrypt;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmAuthMethod>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmAuthMethod>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmAuthMethod>() {
            public EmAuthMethod findValueByNumber(int number) {
              return EmAuthMethod.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(2);
    }

    private static final EmAuthMethod[] VALUES = values();

    public static EmAuthMethod valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmAuthMethod(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmAuthMethod)
  }

  /**
   * Protobuf enum {@code MmBp.EmInitRespFieldFilter}
   *
   * <pre>
   * 初始化 --------------------------------------------
   * </pre>
   */
  public enum EmInitRespFieldFilter
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EIRFF_userNickName = 1;</code>
     */
    EIRFF_userNickName(0, 1),
    /**
     * <code>EIRFF_platformType = 2;</code>
     */
    EIRFF_platformType(1, 2),
    /**
     * <code>EIRFF_model = 4;</code>
     */
    EIRFF_model(2, 4),
    /**
     * <code>EIRFF_os = 8;</code>
     */
    EIRFF_os(3, 8),
    /**
     * <code>EIRFF_time = 16;</code>
     */
    EIRFF_time(4, 16),
    /**
     * <code>EIRFF_timeZone = 32;</code>
     */
    EIRFF_timeZone(5, 32),
    /**
     * <code>EIRFF_timeString = 64;</code>
     */
    EIRFF_timeString(6, 64),
    ;

    /**
     * <code>EIRFF_userNickName = 1;</code>
     */
    public static final int EIRFF_userNickName_VALUE = 1;
    /**
     * <code>EIRFF_platformType = 2;</code>
     */
    public static final int EIRFF_platformType_VALUE = 2;
    /**
     * <code>EIRFF_model = 4;</code>
     */
    public static final int EIRFF_model_VALUE = 4;
    /**
     * <code>EIRFF_os = 8;</code>
     */
    public static final int EIRFF_os_VALUE = 8;
    /**
     * <code>EIRFF_time = 16;</code>
     */
    public static final int EIRFF_time_VALUE = 16;
    /**
     * <code>EIRFF_timeZone = 32;</code>
     */
    public static final int EIRFF_timeZone_VALUE = 32;
    /**
     * <code>EIRFF_timeString = 64;</code>
     */
    public static final int EIRFF_timeString_VALUE = 64;


    public final int getNumber() { return value; }

    public static EmInitRespFieldFilter valueOf(int value) {
      switch (value) {
        case 1: return EIRFF_userNickName;
        case 2: return EIRFF_platformType;
        case 4: return EIRFF_model;
        case 8: return EIRFF_os;
        case 16: return EIRFF_time;
        case 32: return EIRFF_timeZone;
        case 64: return EIRFF_timeString;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmInitRespFieldFilter>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmInitRespFieldFilter>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmInitRespFieldFilter>() {
            public EmInitRespFieldFilter findValueByNumber(int number) {
              return EmInitRespFieldFilter.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(3);
    }

    private static final EmInitRespFieldFilter[] VALUES = values();

    public static EmInitRespFieldFilter valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmInitRespFieldFilter(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmInitRespFieldFilter)
  }

  /**
   * Protobuf enum {@code MmBp.EmInitScence}
   *
   * <pre>
   * 微信连接上设备时，处于什么情景
   * </pre>
   */
  public enum EmInitScence
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EIS_deviceChat = 1;</code>
     *
     * <pre>
     * 聊天
     * </pre>
     */
    EIS_deviceChat(0, 1),
    /**
     * <code>EIS_autoSync = 2;</code>
     *
     * <pre>
     * 自动同步
     * </pre>
     */
    EIS_autoSync(1, 2),
    ;

    /**
     * <code>EIS_deviceChat = 1;</code>
     *
     * <pre>
     * 聊天
     * </pre>
     */
    public static final int EIS_deviceChat_VALUE = 1;
    /**
     * <code>EIS_autoSync = 2;</code>
     *
     * <pre>
     * 自动同步
     * </pre>
     */
    public static final int EIS_autoSync_VALUE = 2;


    public final int getNumber() { return value; }

    public static EmInitScence valueOf(int value) {
      switch (value) {
        case 1: return EIS_deviceChat;
        case 2: return EIS_autoSync;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmInitScence>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmInitScence>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmInitScence>() {
            public EmInitScence findValueByNumber(int number) {
              return EmInitScence.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(4);
    }

    private static final EmInitScence[] VALUES = values();

    public static EmInitScence valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmInitScence(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmInitScence)
  }

  /**
   * Protobuf enum {@code MmBp.EmPlatformType}
   */
  public enum EmPlatformType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EPT_ios = 1;</code>
     */
    EPT_ios(0, 1),
    /**
     * <code>EPT_andriod = 2;</code>
     */
    EPT_andriod(1, 2),
    /**
     * <code>EPT_wp = 3;</code>
     */
    EPT_wp(2, 3),
    /**
     * <code>EPT_s60v3 = 4;</code>
     */
    EPT_s60v3(3, 4),
    /**
     * <code>EPT_s60v5 = 5;</code>
     */
    EPT_s60v5(4, 5),
    /**
     * <code>EPT_s40 = 6;</code>
     */
    EPT_s40(5, 6),
    /**
     * <code>EPT_bb = 7;</code>
     */
    EPT_bb(6, 7),
    ;

    /**
     * <code>EPT_ios = 1;</code>
     */
    public static final int EPT_ios_VALUE = 1;
    /**
     * <code>EPT_andriod = 2;</code>
     */
    public static final int EPT_andriod_VALUE = 2;
    /**
     * <code>EPT_wp = 3;</code>
     */
    public static final int EPT_wp_VALUE = 3;
    /**
     * <code>EPT_s60v3 = 4;</code>
     */
    public static final int EPT_s60v3_VALUE = 4;
    /**
     * <code>EPT_s60v5 = 5;</code>
     */
    public static final int EPT_s60v5_VALUE = 5;
    /**
     * <code>EPT_s40 = 6;</code>
     */
    public static final int EPT_s40_VALUE = 6;
    /**
     * <code>EPT_bb = 7;</code>
     */
    public static final int EPT_bb_VALUE = 7;


    public final int getNumber() { return value; }

    public static EmPlatformType valueOf(int value) {
      switch (value) {
        case 1: return EPT_ios;
        case 2: return EPT_andriod;
        case 3: return EPT_wp;
        case 4: return EPT_s60v3;
        case 5: return EPT_s60v5;
        case 6: return EPT_s40;
        case 7: return EPT_bb;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmPlatformType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmPlatformType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmPlatformType>() {
            public EmPlatformType findValueByNumber(int number) {
              return EmPlatformType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(5);
    }

    private static final EmPlatformType[] VALUES = values();

    public static EmPlatformType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmPlatformType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmPlatformType)
  }

  /**
   * Protobuf enum {@code MmBp.EmDeviceDataType}
   *
   * <pre>
   * 设备发送数据给微信或厂商 ----------------------------
   * 设备数据类型
   * </pre>
   */
  public enum EmDeviceDataType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EDDT_manufatureSvr = 0;</code>
     *
     * <pre>
     * 厂商自定义数据
     * </pre>
     */
    EDDT_manufatureSvr(0, 0),
    /**
     * <code>EDDT_wxWristBand = 1;</code>
     *
     * <pre>
     * 微信公众平台手环数据
     * </pre>
     */
    EDDT_wxWristBand(1, 1),
    /**
     * <code>EDDT_wxDeviceHtmlChatView = 10001;</code>
     *
     * <pre>
     * 微信客户端设备 html5 会话界面数据
     * </pre>
     */
    EDDT_wxDeviceHtmlChatView(2, 10001),
    ;

    /**
     * <code>EDDT_manufatureSvr = 0;</code>
     *
     * <pre>
     * 厂商自定义数据
     * </pre>
     */
    public static final int EDDT_manufatureSvr_VALUE = 0;
    /**
     * <code>EDDT_wxWristBand = 1;</code>
     *
     * <pre>
     * 微信公众平台手环数据
     * </pre>
     */
    public static final int EDDT_wxWristBand_VALUE = 1;
    /**
     * <code>EDDT_wxDeviceHtmlChatView = 10001;</code>
     *
     * <pre>
     * 微信客户端设备 html5 会话界面数据
     * </pre>
     */
    public static final int EDDT_wxDeviceHtmlChatView_VALUE = 10001;


    public final int getNumber() { return value; }

    public static EmDeviceDataType valueOf(int value) {
      switch (value) {
        case 0: return EDDT_manufatureSvr;
        case 1: return EDDT_wxWristBand;
        case 10001: return EDDT_wxDeviceHtmlChatView;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmDeviceDataType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmDeviceDataType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmDeviceDataType>() {
            public EmDeviceDataType findValueByNumber(int number) {
              return EmDeviceDataType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(6);
    }

    private static final EmDeviceDataType[] VALUES = values();

    public static EmDeviceDataType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmDeviceDataType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmDeviceDataType)
  }

  /**
   * Protobuf enum {@code MmBp.EmSwitchViewOp}
   *
   * <pre>
   * 微信客户端进入退出界面的通知 ---------------------------
   * </pre>
   */
  public enum EmSwitchViewOp
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ESVO_enter = 1;</code>
     */
    ESVO_enter(0, 1),
    /**
     * <code>ESVO_exit = 2;</code>
     */
    ESVO_exit(1, 2),
    ;

    /**
     * <code>ESVO_enter = 1;</code>
     */
    public static final int ESVO_enter_VALUE = 1;
    /**
     * <code>ESVO_exit = 2;</code>
     */
    public static final int ESVO_exit_VALUE = 2;


    public final int getNumber() { return value; }

    public static EmSwitchViewOp valueOf(int value) {
      switch (value) {
        case 1: return ESVO_enter;
        case 2: return ESVO_exit;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmSwitchViewOp>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmSwitchViewOp>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmSwitchViewOp>() {
            public EmSwitchViewOp findValueByNumber(int number) {
              return EmSwitchViewOp.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(7);
    }

    private static final EmSwitchViewOp[] VALUES = values();

    public static EmSwitchViewOp valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmSwitchViewOp(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmSwitchViewOp)
  }

  /**
   * Protobuf enum {@code MmBp.EmViewId}
   */
  public enum EmViewId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EVI_deviceChatView = 1;</code>
     *
     * <pre>
     * 微信客户端设备号会话界面
     * </pre>
     */
    EVI_deviceChatView(0, 1),
    /**
     * <code>EVI_deviceChatHtmlView = 2;</code>
     *
     * <pre>
     * 微信客户端设备号 Html5 会话界面。注意：只有当 H5 界面主动和
     * </pre>
     */
    EVI_deviceChatHtmlView(1, 2),
    ;

    /**
     * <code>EVI_deviceChatView = 1;</code>
     *
     * <pre>
     * 微信客户端设备号会话界面
     * </pre>
     */
    public static final int EVI_deviceChatView_VALUE = 1;
    /**
     * <code>EVI_deviceChatHtmlView = 2;</code>
     *
     * <pre>
     * 微信客户端设备号 Html5 会话界面。注意：只有当 H5 界面主动和
     * </pre>
     */
    public static final int EVI_deviceChatHtmlView_VALUE = 2;


    public final int getNumber() { return value; }

    public static EmViewId valueOf(int value) {
      switch (value) {
        case 1: return EVI_deviceChatView;
        case 2: return EVI_deviceChatHtmlView;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmViewId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmViewId>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmViewId>() {
            public EmViewId findValueByNumber(int number) {
              return EmViewId.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(8);
    }

    private static final EmViewId[] VALUES = values();

    public static EmViewId valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmViewId(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmViewId)
  }

  /**
   * Protobuf enum {@code MmBp.EmSwitchBackgroundOp}
   */
  public enum EmSwitchBackgroundOp
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ESBO_enterBackground = 1;</code>
     *
     * <pre>
     * 进入后台
     * </pre>
     */
    ESBO_enterBackground(0, 1),
    /**
     * <code>ESBO_enterForground = 2;</code>
     *
     * <pre>
     * 进入前台
     * </pre>
     */
    ESBO_enterForground(1, 2),
    /**
     * <code>ESBO_sleep = 3;</code>
     *
     * <pre>
     * 后台休眠
     * </pre>
     */
    ESBO_sleep(2, 3),
    ;

    /**
     * <code>ESBO_enterBackground = 1;</code>
     *
     * <pre>
     * 进入后台
     * </pre>
     */
    public static final int ESBO_enterBackground_VALUE = 1;
    /**
     * <code>ESBO_enterForground = 2;</code>
     *
     * <pre>
     * 进入前台
     * </pre>
     */
    public static final int ESBO_enterForground_VALUE = 2;
    /**
     * <code>ESBO_sleep = 3;</code>
     *
     * <pre>
     * 后台休眠
     * </pre>
     */
    public static final int ESBO_sleep_VALUE = 3;


    public final int getNumber() { return value; }

    public static EmSwitchBackgroundOp valueOf(int value) {
      switch (value) {
        case 1: return ESBO_enterBackground;
        case 2: return ESBO_enterForground;
        case 3: return ESBO_sleep;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmSwitchBackgroundOp>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<EmSwitchBackgroundOp>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EmSwitchBackgroundOp>() {
            public EmSwitchBackgroundOp findValueByNumber(int number) {
              return EmSwitchBackgroundOp.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return MmBp.getDescriptor().getEnumTypes().get(9);
    }

    private static final EmSwitchBackgroundOp[] VALUES = values();

    public static EmSwitchBackgroundOp valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private EmSwitchBackgroundOp(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MmBp.EmSwitchBackgroundOp)
  }

  public interface BaseRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code MmBp.BaseRequest}
   */
  public static final class BaseRequest extends
      com.google.protobuf.GeneratedMessage
      implements BaseRequestOrBuilder {
    // Use BaseRequest.newBuilder() to construct.
    private BaseRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BaseRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BaseRequest defaultInstance;
    public static BaseRequest getDefaultInstance() {
      return defaultInstance;
    }

    public BaseRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BaseRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_BaseRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_BaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.BaseRequest.class, MmBp.BaseRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<BaseRequest> PARSER =
        new com.google.protobuf.AbstractParser<BaseRequest>() {
      public BaseRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BaseRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BaseRequest> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.BaseRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.BaseRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.BaseRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.BaseRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.BaseRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.BaseRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.BaseRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.BaseRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.BaseRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.BaseRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.BaseRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.BaseRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.BaseRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_BaseRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_BaseRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.BaseRequest.class, MmBp.BaseRequest.Builder.class);
      }

      // Construct using MmBp.BaseRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_BaseRequest_descriptor;
      }

      public MmBp.BaseRequest getDefaultInstanceForType() {
        return MmBp.BaseRequest.getDefaultInstance();
      }

      public MmBp.BaseRequest build() {
        MmBp.BaseRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.BaseRequest buildPartial() {
        MmBp.BaseRequest result = new MmBp.BaseRequest(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.BaseRequest) {
          return mergeFrom((MmBp.BaseRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.BaseRequest other) {
        if (other == MmBp.BaseRequest.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.BaseRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.BaseRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.BaseRequest)
    }

    static {
      defaultInstance = new BaseRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.BaseRequest)
  }

  public interface BaseResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 ErrCode = 1;
    /**
     * <code>required int32 ErrCode = 1;</code>
     */
    boolean hasErrCode();
    /**
     * <code>required int32 ErrCode = 1;</code>
     */
    int getErrCode();

    // optional string ErrMsg = 2;
    /**
     * <code>optional string ErrMsg = 2;</code>
     */
    boolean hasErrMsg();
    /**
     * <code>optional string ErrMsg = 2;</code>
     */
    java.lang.String getErrMsg();
    /**
     * <code>optional string ErrMsg = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrMsgBytes();
  }
  /**
   * Protobuf type {@code MmBp.BaseResponse}
   */
  public static final class BaseResponse extends
      com.google.protobuf.GeneratedMessage
      implements BaseResponseOrBuilder {
    // Use BaseResponse.newBuilder() to construct.
    private BaseResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BaseResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BaseResponse defaultInstance;
    public static BaseResponse getDefaultInstance() {
      return defaultInstance;
    }

    public BaseResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BaseResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              errCode_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              errMsg_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_BaseResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_BaseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.BaseResponse.class, MmBp.BaseResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<BaseResponse> PARSER =
        new com.google.protobuf.AbstractParser<BaseResponse>() {
      public BaseResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BaseResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BaseResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 ErrCode = 1;
    public static final int ERRCODE_FIELD_NUMBER = 1;
    private int errCode_;
    /**
     * <code>required int32 ErrCode = 1;</code>
     */
    public boolean hasErrCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 ErrCode = 1;</code>
     */
    public int getErrCode() {
      return errCode_;
    }

    // optional string ErrMsg = 2;
    public static final int ERRMSG_FIELD_NUMBER = 2;
    private java.lang.Object errMsg_;
    /**
     * <code>optional string ErrMsg = 2;</code>
     */
    public boolean hasErrMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string ErrMsg = 2;</code>
     */
    public java.lang.String getErrMsg() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ErrMsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrMsgBytes() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      errCode_ = 0;
      errMsg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasErrCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, errCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getErrMsgBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, errCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getErrMsgBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.BaseResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.BaseResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.BaseResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.BaseResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.BaseResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.BaseResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.BaseResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.BaseResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.BaseResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.BaseResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.BaseResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.BaseResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.BaseResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_BaseResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_BaseResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.BaseResponse.class, MmBp.BaseResponse.Builder.class);
      }

      // Construct using MmBp.BaseResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        errCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        errMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_BaseResponse_descriptor;
      }

      public MmBp.BaseResponse getDefaultInstanceForType() {
        return MmBp.BaseResponse.getDefaultInstance();
      }

      public MmBp.BaseResponse build() {
        MmBp.BaseResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.BaseResponse buildPartial() {
        MmBp.BaseResponse result = new MmBp.BaseResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.errCode_ = errCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errMsg_ = errMsg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.BaseResponse) {
          return mergeFrom((MmBp.BaseResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.BaseResponse other) {
        if (other == MmBp.BaseResponse.getDefaultInstance()) return this;
        if (other.hasErrCode()) {
          setErrCode(other.getErrCode());
        }
        if (other.hasErrMsg()) {
          bitField0_ |= 0x00000002;
          errMsg_ = other.errMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasErrCode()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.BaseResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.BaseResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 ErrCode = 1;
      private int errCode_ ;
      /**
       * <code>required int32 ErrCode = 1;</code>
       */
      public boolean hasErrCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 ErrCode = 1;</code>
       */
      public int getErrCode() {
        return errCode_;
      }
      /**
       * <code>required int32 ErrCode = 1;</code>
       */
      public Builder setErrCode(int value) {
        bitField0_ |= 0x00000001;
        errCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ErrCode = 1;</code>
       */
      public Builder clearErrCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        errCode_ = 0;
        onChanged();
        return this;
      }

      // optional string ErrMsg = 2;
      private java.lang.Object errMsg_ = "";
      /**
       * <code>optional string ErrMsg = 2;</code>
       */
      public boolean hasErrMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string ErrMsg = 2;</code>
       */
      public java.lang.String getErrMsg() {
        java.lang.Object ref = errMsg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          errMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ErrMsg = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrMsgBytes() {
        java.lang.Object ref = errMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ErrMsg = 2;</code>
       */
      public Builder setErrMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ErrMsg = 2;</code>
       */
      public Builder clearErrMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errMsg_ = getDefaultInstance().getErrMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ErrMsg = 2;</code>
       */
      public Builder setErrMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errMsg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.BaseResponse)
    }

    static {
      defaultInstance = new BaseResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.BaseResponse)
  }

  public interface BasePushOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code MmBp.BasePush}
   */
  public static final class BasePush extends
      com.google.protobuf.GeneratedMessage
      implements BasePushOrBuilder {
    // Use BasePush.newBuilder() to construct.
    private BasePush(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BasePush(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BasePush defaultInstance;
    public static BasePush getDefaultInstance() {
      return defaultInstance;
    }

    public BasePush getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BasePush(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_BasePush_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_BasePush_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.BasePush.class, MmBp.BasePush.Builder.class);
    }

    public static com.google.protobuf.Parser<BasePush> PARSER =
        new com.google.protobuf.AbstractParser<BasePush>() {
      public BasePush parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BasePush(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BasePush> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.BasePush parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.BasePush parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.BasePush parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.BasePush parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.BasePush parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.BasePush parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.BasePush parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.BasePush parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.BasePush parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.BasePush parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.BasePush prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.BasePush}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.BasePushOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_BasePush_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_BasePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.BasePush.class, MmBp.BasePush.Builder.class);
      }

      // Construct using MmBp.BasePush.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_BasePush_descriptor;
      }

      public MmBp.BasePush getDefaultInstanceForType() {
        return MmBp.BasePush.getDefaultInstance();
      }

      public MmBp.BasePush build() {
        MmBp.BasePush result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.BasePush buildPartial() {
        MmBp.BasePush result = new MmBp.BasePush(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.BasePush) {
          return mergeFrom((MmBp.BasePush)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.BasePush other) {
        if (other == MmBp.BasePush.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.BasePush parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.BasePush) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.BasePush)
    }

    static {
      defaultInstance = new BasePush(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.BasePush)
  }

  public interface AuthRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BaseRequest BaseRequest = 1;
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    boolean hasBaseRequest();
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    MmBp.BaseRequest getBaseRequest();
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder();

    // optional bytes Md5DeviceTypeAndDeviceId = 2;
    /**
     * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
     *
     * <pre>
     * deviceType 加 deviceId 的 md5，16 字节二进制数据
     * </pre>
     */
    boolean hasMd5DeviceTypeAndDeviceId();
    /**
     * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
     *
     * <pre>
     * deviceType 加 deviceId 的 md5，16 字节二进制数据
     * </pre>
     */
    com.google.protobuf.ByteString getMd5DeviceTypeAndDeviceId();

    // required int32 ProtoVersion = 3;
    /**
     * <code>required int32 ProtoVersion = 3;</code>
     *
     * <pre>
     * 设备支持的本 proto 文件的版本号，第一个
     * </pre>
     */
    boolean hasProtoVersion();
    /**
     * <code>required int32 ProtoVersion = 3;</code>
     *
     * <pre>
     * 设备支持的本 proto 文件的版本号，第一个
     * </pre>
     */
    int getProtoVersion();

    // required int32 AuthProto = 4;
    /**
     * <code>required int32 AuthProto = 4;</code>
     *
     * <pre>
     *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
     * </pre>
     */
    boolean hasAuthProto();
    /**
     * <code>required int32 AuthProto = 4;</code>
     *
     * <pre>
     *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
     * </pre>
     */
    int getAuthProto();

    // required .MmBp.EmAuthMethod AuthMethod = 5;
    /**
     * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
     *
     * <pre>
     * 验证和加密的方法，见 EmAuthMethod
     * </pre>
     */
    boolean hasAuthMethod();
    /**
     * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
     *
     * <pre>
     * 验证和加密的方法，见 EmAuthMethod
     * </pre>
     */
    MmBp.EmAuthMethod getAuthMethod();

    // optional bytes AesSign = 6;
    /**
     * <code>optional bytes AesSign = 6;</code>
     *
     * <pre>
     * 具体生成方法见文档
     * </pre>
     */
    boolean hasAesSign();
    /**
     * <code>optional bytes AesSign = 6;</code>
     *
     * <pre>
     * 具体生成方法见文档
     * </pre>
     */
    com.google.protobuf.ByteString getAesSign();

    // optional bytes MacAddress = 7;
    /**
     * <code>optional bytes MacAddress = 7;</code>
     *
     * <pre>
     * mac 地址，6 位。当设备没有烧 deviceId 的
     * </pre>
     */
    boolean hasMacAddress();
    /**
     * <code>optional bytes MacAddress = 7;</code>
     *
     * <pre>
     * mac 地址，6 位。当设备没有烧 deviceId 的
     * </pre>
     */
    com.google.protobuf.ByteString getMacAddress();

    // optional string TimeZone = 10;
    /**
     * <code>optional string TimeZone = 10;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    boolean hasTimeZone();
    /**
     * <code>optional string TimeZone = 10;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    java.lang.String getTimeZone();
    /**
     * <code>optional string TimeZone = 10;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    com.google.protobuf.ByteString
        getTimeZoneBytes();

    // optional string Language = 11;
    /**
     * <code>optional string Language = 11;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    boolean hasLanguage();
    /**
     * <code>optional string Language = 11;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    java.lang.String getLanguage();
    /**
     * <code>optional string Language = 11;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    com.google.protobuf.ByteString
        getLanguageBytes();

    // optional string DeviceName = 12;
    /**
     * <code>optional string DeviceName = 12;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    boolean hasDeviceName();
    /**
     * <code>optional string DeviceName = 12;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    java.lang.String getDeviceName();
    /**
     * <code>optional string DeviceName = 12;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    com.google.protobuf.ByteString
        getDeviceNameBytes();
  }
  /**
   * Protobuf type {@code MmBp.AuthRequest}
   *
   * <pre>
   * 登录 ---------------------------------------------
   * </pre>
   */
  public static final class AuthRequest extends
      com.google.protobuf.GeneratedMessage
      implements AuthRequestOrBuilder {
    // Use AuthRequest.newBuilder() to construct.
    private AuthRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AuthRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AuthRequest defaultInstance;
    public static AuthRequest getDefaultInstance() {
      return defaultInstance;
    }

    public AuthRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AuthRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BaseRequest.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseRequest_.toBuilder();
              }
              baseRequest_ = input.readMessage(MmBp.BaseRequest.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseRequest_);
                baseRequest_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              md5DeviceTypeAndDeviceId_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              protoVersion_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              authProto_ = input.readInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              MmBp.EmAuthMethod value = MmBp.EmAuthMethod.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                authMethod_ = value;
              }
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              aesSign_ = input.readBytes();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              macAddress_ = input.readBytes();
              break;
            }
            case 82: {
              bitField0_ |= 0x00000080;
              timeZone_ = input.readBytes();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000100;
              language_ = input.readBytes();
              break;
            }
            case 98: {
              bitField0_ |= 0x00000200;
              deviceName_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_AuthRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_AuthRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.AuthRequest.class, MmBp.AuthRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<AuthRequest> PARSER =
        new com.google.protobuf.AbstractParser<AuthRequest>() {
      public AuthRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AuthRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BaseRequest BaseRequest = 1;
    public static final int BASEREQUEST_FIELD_NUMBER = 1;
    private MmBp.BaseRequest baseRequest_;
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public boolean hasBaseRequest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public MmBp.BaseRequest getBaseRequest() {
      return baseRequest_;
    }
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder() {
      return baseRequest_;
    }

    // optional bytes Md5DeviceTypeAndDeviceId = 2;
    public static final int MD5DEVICETYPEANDDEVICEID_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString md5DeviceTypeAndDeviceId_;
    /**
     * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
     *
     * <pre>
     * deviceType 加 deviceId 的 md5，16 字节二进制数据
     * </pre>
     */
    public boolean hasMd5DeviceTypeAndDeviceId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
     *
     * <pre>
     * deviceType 加 deviceId 的 md5，16 字节二进制数据
     * </pre>
     */
    public com.google.protobuf.ByteString getMd5DeviceTypeAndDeviceId() {
      return md5DeviceTypeAndDeviceId_;
    }

    // required int32 ProtoVersion = 3;
    public static final int PROTOVERSION_FIELD_NUMBER = 3;
    private int protoVersion_;
    /**
     * <code>required int32 ProtoVersion = 3;</code>
     *
     * <pre>
     * 设备支持的本 proto 文件的版本号，第一个
     * </pre>
     */
    public boolean hasProtoVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 ProtoVersion = 3;</code>
     *
     * <pre>
     * 设备支持的本 proto 文件的版本号，第一个
     * </pre>
     */
    public int getProtoVersion() {
      return protoVersion_;
    }

    // required int32 AuthProto = 4;
    public static final int AUTHPROTO_FIELD_NUMBER = 4;
    private int authProto_;
    /**
     * <code>required int32 AuthProto = 4;</code>
     *
     * <pre>
     *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
     * </pre>
     */
    public boolean hasAuthProto() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 AuthProto = 4;</code>
     *
     * <pre>
     *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
     * </pre>
     */
    public int getAuthProto() {
      return authProto_;
    }

    // required .MmBp.EmAuthMethod AuthMethod = 5;
    public static final int AUTHMETHOD_FIELD_NUMBER = 5;
    private MmBp.EmAuthMethod authMethod_;
    /**
     * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
     *
     * <pre>
     * 验证和加密的方法，见 EmAuthMethod
     * </pre>
     */
    public boolean hasAuthMethod() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
     *
     * <pre>
     * 验证和加密的方法，见 EmAuthMethod
     * </pre>
     */
    public MmBp.EmAuthMethod getAuthMethod() {
      return authMethod_;
    }

    // optional bytes AesSign = 6;
    public static final int AESSIGN_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString aesSign_;
    /**
     * <code>optional bytes AesSign = 6;</code>
     *
     * <pre>
     * 具体生成方法见文档
     * </pre>
     */
    public boolean hasAesSign() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bytes AesSign = 6;</code>
     *
     * <pre>
     * 具体生成方法见文档
     * </pre>
     */
    public com.google.protobuf.ByteString getAesSign() {
      return aesSign_;
    }

    // optional bytes MacAddress = 7;
    public static final int MACADDRESS_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString macAddress_;
    /**
     * <code>optional bytes MacAddress = 7;</code>
     *
     * <pre>
     * mac 地址，6 位。当设备没有烧 deviceId 的
     * </pre>
     */
    public boolean hasMacAddress() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bytes MacAddress = 7;</code>
     *
     * <pre>
     * mac 地址，6 位。当设备没有烧 deviceId 的
     * </pre>
     */
    public com.google.protobuf.ByteString getMacAddress() {
      return macAddress_;
    }

    // optional string TimeZone = 10;
    public static final int TIMEZONE_FIELD_NUMBER = 10;
    private java.lang.Object timeZone_;
    /**
     * <code>optional string TimeZone = 10;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public boolean hasTimeZone() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string TimeZone = 10;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public java.lang.String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          timeZone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string TimeZone = 10;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string Language = 11;
    public static final int LANGUAGE_FIELD_NUMBER = 11;
    private java.lang.Object language_;
    /**
     * <code>optional string Language = 11;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public boolean hasLanguage() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string Language = 11;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          language_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Language = 11;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string DeviceName = 12;
    public static final int DEVICENAME_FIELD_NUMBER = 12;
    private java.lang.Object deviceName_;
    /**
     * <code>optional string DeviceName = 12;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public boolean hasDeviceName() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string DeviceName = 12;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public java.lang.String getDeviceName() {
      java.lang.Object ref = deviceName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string DeviceName = 12;</code>
     *
     * <pre>
     * 废弃
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDeviceNameBytes() {
      java.lang.Object ref = deviceName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
      md5DeviceTypeAndDeviceId_ = com.google.protobuf.ByteString.EMPTY;
      protoVersion_ = 0;
      authProto_ = 0;
      authMethod_ = MmBp.EmAuthMethod.EAM_md5;
      aesSign_ = com.google.protobuf.ByteString.EMPTY;
      macAddress_ = com.google.protobuf.ByteString.EMPTY;
      timeZone_ = "";
      language_ = "";
      deviceName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseRequest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasProtoVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAuthProto()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAuthMethod()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, md5DeviceTypeAndDeviceId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, protoVersion_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, authProto_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, authMethod_.getNumber());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, aesSign_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, macAddress_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(10, getTimeZoneBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(11, getLanguageBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBytes(12, getDeviceNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, md5DeviceTypeAndDeviceId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, protoVersion_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, authProto_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, authMethod_.getNumber());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, aesSign_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, macAddress_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(10, getTimeZoneBytes());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getLanguageBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(12, getDeviceNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.AuthRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.AuthRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.AuthRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.AuthRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.AuthRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.AuthRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.AuthRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.AuthRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.AuthRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.AuthRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.AuthRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.AuthRequest}
     *
     * <pre>
     * 登录 ---------------------------------------------
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.AuthRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_AuthRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_AuthRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.AuthRequest.class, MmBp.AuthRequest.Builder.class);
      }

      // Construct using MmBp.AuthRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseRequestFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseRequestBuilder_ == null) {
          baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        md5DeviceTypeAndDeviceId_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        protoVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        authProto_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        authMethod_ = MmBp.EmAuthMethod.EAM_md5;
        bitField0_ = (bitField0_ & ~0x00000010);
        aesSign_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        macAddress_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        timeZone_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        language_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        deviceName_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_AuthRequest_descriptor;
      }

      public MmBp.AuthRequest getDefaultInstanceForType() {
        return MmBp.AuthRequest.getDefaultInstance();
      }

      public MmBp.AuthRequest build() {
        MmBp.AuthRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.AuthRequest buildPartial() {
        MmBp.AuthRequest result = new MmBp.AuthRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseRequestBuilder_ == null) {
          result.baseRequest_ = baseRequest_;
        } else {
          result.baseRequest_ = baseRequestBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.md5DeviceTypeAndDeviceId_ = md5DeviceTypeAndDeviceId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.protoVersion_ = protoVersion_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.authProto_ = authProto_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.authMethod_ = authMethod_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.aesSign_ = aesSign_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.macAddress_ = macAddress_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.timeZone_ = timeZone_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.language_ = language_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.deviceName_ = deviceName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.AuthRequest) {
          return mergeFrom((MmBp.AuthRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.AuthRequest other) {
        if (other == MmBp.AuthRequest.getDefaultInstance()) return this;
        if (other.hasBaseRequest()) {
          mergeBaseRequest(other.getBaseRequest());
        }
        if (other.hasMd5DeviceTypeAndDeviceId()) {
          setMd5DeviceTypeAndDeviceId(other.getMd5DeviceTypeAndDeviceId());
        }
        if (other.hasProtoVersion()) {
          setProtoVersion(other.getProtoVersion());
        }
        if (other.hasAuthProto()) {
          setAuthProto(other.getAuthProto());
        }
        if (other.hasAuthMethod()) {
          setAuthMethod(other.getAuthMethod());
        }
        if (other.hasAesSign()) {
          setAesSign(other.getAesSign());
        }
        if (other.hasMacAddress()) {
          setMacAddress(other.getMacAddress());
        }
        if (other.hasTimeZone()) {
          bitField0_ |= 0x00000080;
          timeZone_ = other.timeZone_;
          onChanged();
        }
        if (other.hasLanguage()) {
          bitField0_ |= 0x00000100;
          language_ = other.language_;
          onChanged();
        }
        if (other.hasDeviceName()) {
          bitField0_ |= 0x00000200;
          deviceName_ = other.deviceName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseRequest()) {

          return false;
        }
        if (!hasProtoVersion()) {

          return false;
        }
        if (!hasAuthProto()) {

          return false;
        }
        if (!hasAuthMethod()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.AuthRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.AuthRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BaseRequest BaseRequest = 1;
      private MmBp.BaseRequest baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder> baseRequestBuilder_;
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public boolean hasBaseRequest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequest getBaseRequest() {
        if (baseRequestBuilder_ == null) {
          return baseRequest_;
        } else {
          return baseRequestBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(MmBp.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseRequest_ = value;
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(
          MmBp.BaseRequest.Builder builderForValue) {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = builderForValue.build();
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder mergeBaseRequest(MmBp.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseRequest_ != MmBp.BaseRequest.getDefaultInstance()) {
            baseRequest_ =
              MmBp.BaseRequest.newBuilder(baseRequest_).mergeFrom(value).buildPartial();
          } else {
            baseRequest_ = value;
          }
          onChanged();
        } else {
          baseRequestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder clearBaseRequest() {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
          onChanged();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequest.Builder getBaseRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder() {
        if (baseRequestBuilder_ != null) {
          return baseRequestBuilder_.getMessageOrBuilder();
        } else {
          return baseRequest_;
        }
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder>
          getBaseRequestFieldBuilder() {
        if (baseRequestBuilder_ == null) {
          baseRequestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder>(
                  baseRequest_,
                  getParentForChildren(),
                  isClean());
          baseRequest_ = null;
        }
        return baseRequestBuilder_;
      }

      // optional bytes Md5DeviceTypeAndDeviceId = 2;
      private com.google.protobuf.ByteString md5DeviceTypeAndDeviceId_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
       *
       * <pre>
       * deviceType 加 deviceId 的 md5，16 字节二进制数据
       * </pre>
       */
      public boolean hasMd5DeviceTypeAndDeviceId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
       *
       * <pre>
       * deviceType 加 deviceId 的 md5，16 字节二进制数据
       * </pre>
       */
      public com.google.protobuf.ByteString getMd5DeviceTypeAndDeviceId() {
        return md5DeviceTypeAndDeviceId_;
      }
      /**
       * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
       *
       * <pre>
       * deviceType 加 deviceId 的 md5，16 字节二进制数据
       * </pre>
       */
      public Builder setMd5DeviceTypeAndDeviceId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        md5DeviceTypeAndDeviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes Md5DeviceTypeAndDeviceId = 2;</code>
       *
       * <pre>
       * deviceType 加 deviceId 的 md5，16 字节二进制数据
       * </pre>
       */
      public Builder clearMd5DeviceTypeAndDeviceId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        md5DeviceTypeAndDeviceId_ = getDefaultInstance().getMd5DeviceTypeAndDeviceId();
        onChanged();
        return this;
      }

      // required int32 ProtoVersion = 3;
      private int protoVersion_ ;
      /**
       * <code>required int32 ProtoVersion = 3;</code>
       *
       * <pre>
       * 设备支持的本 proto 文件的版本号，第一个
       * </pre>
       */
      public boolean hasProtoVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 ProtoVersion = 3;</code>
       *
       * <pre>
       * 设备支持的本 proto 文件的版本号，第一个
       * </pre>
       */
      public int getProtoVersion() {
        return protoVersion_;
      }
      /**
       * <code>required int32 ProtoVersion = 3;</code>
       *
       * <pre>
       * 设备支持的本 proto 文件的版本号，第一个
       * </pre>
       */
      public Builder setProtoVersion(int value) {
        bitField0_ |= 0x00000004;
        protoVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 ProtoVersion = 3;</code>
       *
       * <pre>
       * 设备支持的本 proto 文件的版本号，第一个
       * </pre>
       */
      public Builder clearProtoVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        protoVersion_ = 0;
        onChanged();
        return this;
      }

      // required int32 AuthProto = 4;
      private int authProto_ ;
      /**
       * <code>required int32 AuthProto = 4;</code>
       *
       * <pre>
       *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
       * </pre>
       */
      public boolean hasAuthProto() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 AuthProto = 4;</code>
       *
       * <pre>
       *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
       * </pre>
       */
      public int getAuthProto() {
        return authProto_;
      }
      /**
       * <code>required int32 AuthProto = 4;</code>
       *
       * <pre>
       *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
       * </pre>
       */
      public Builder setAuthProto(int value) {
        bitField0_ |= 0x00000008;
        authProto_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 AuthProto = 4;</code>
       *
       * <pre>
       *字节表示最小版本，第二个字节表示小版本，第三字节表示大版本。版本号为 1.0.0 的话，应该填：0x010000；
       * </pre>
       */
      public Builder clearAuthProto() {
        bitField0_ = (bitField0_ & ~0x00000008);
        authProto_ = 0;
        onChanged();
        return this;
      }

      // required .MmBp.EmAuthMethod AuthMethod = 5;
      private MmBp.EmAuthMethod authMethod_ = MmBp.EmAuthMethod.EAM_md5;
      /**
       * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
       *
       * <pre>
       * 验证和加密的方法，见 EmAuthMethod
       * </pre>
       */
      public boolean hasAuthMethod() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
       *
       * <pre>
       * 验证和加密的方法，见 EmAuthMethod
       * </pre>
       */
      public MmBp.EmAuthMethod getAuthMethod() {
        return authMethod_;
      }
      /**
       * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
       *
       * <pre>
       * 验证和加密的方法，见 EmAuthMethod
       * </pre>
       */
      public Builder setAuthMethod(MmBp.EmAuthMethod value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        authMethod_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .MmBp.EmAuthMethod AuthMethod = 5;</code>
       *
       * <pre>
       * 验证和加密的方法，见 EmAuthMethod
       * </pre>
       */
      public Builder clearAuthMethod() {
        bitField0_ = (bitField0_ & ~0x00000010);
        authMethod_ = MmBp.EmAuthMethod.EAM_md5;
        onChanged();
        return this;
      }

      // optional bytes AesSign = 6;
      private com.google.protobuf.ByteString aesSign_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes AesSign = 6;</code>
       *
       * <pre>
       * 具体生成方法见文档
       * </pre>
       */
      public boolean hasAesSign() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bytes AesSign = 6;</code>
       *
       * <pre>
       * 具体生成方法见文档
       * </pre>
       */
      public com.google.protobuf.ByteString getAesSign() {
        return aesSign_;
      }
      /**
       * <code>optional bytes AesSign = 6;</code>
       *
       * <pre>
       * 具体生成方法见文档
       * </pre>
       */
      public Builder setAesSign(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        aesSign_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes AesSign = 6;</code>
       *
       * <pre>
       * 具体生成方法见文档
       * </pre>
       */
      public Builder clearAesSign() {
        bitField0_ = (bitField0_ & ~0x00000020);
        aesSign_ = getDefaultInstance().getAesSign();
        onChanged();
        return this;
      }

      // optional bytes MacAddress = 7;
      private com.google.protobuf.ByteString macAddress_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes MacAddress = 7;</code>
       *
       * <pre>
       * mac 地址，6 位。当设备没有烧 deviceId 的
       * </pre>
       */
      public boolean hasMacAddress() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bytes MacAddress = 7;</code>
       *
       * <pre>
       * mac 地址，6 位。当设备没有烧 deviceId 的
       * </pre>
       */
      public com.google.protobuf.ByteString getMacAddress() {
        return macAddress_;
      }
      /**
       * <code>optional bytes MacAddress = 7;</code>
       *
       * <pre>
       * mac 地址，6 位。当设备没有烧 deviceId 的
       * </pre>
       */
      public Builder setMacAddress(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        macAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes MacAddress = 7;</code>
       *
       * <pre>
       * mac 地址，6 位。当设备没有烧 deviceId 的
       * </pre>
       */
      public Builder clearMacAddress() {
        bitField0_ = (bitField0_ & ~0x00000040);
        macAddress_ = getDefaultInstance().getMacAddress();
        onChanged();
        return this;
      }

      // optional string TimeZone = 10;
      private java.lang.Object timeZone_ = "";
      /**
       * <code>optional string TimeZone = 10;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public boolean hasTimeZone() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string TimeZone = 10;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public java.lang.String getTimeZone() {
        java.lang.Object ref = timeZone_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          timeZone_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string TimeZone = 10;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTimeZoneBytes() {
        java.lang.Object ref = timeZone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timeZone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string TimeZone = 10;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder setTimeZone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        timeZone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string TimeZone = 10;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder clearTimeZone() {
        bitField0_ = (bitField0_ & ~0x00000080);
        timeZone_ = getDefaultInstance().getTimeZone();
        onChanged();
        return this;
      }
      /**
       * <code>optional string TimeZone = 10;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder setTimeZoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        timeZone_ = value;
        onChanged();
        return this;
      }

      // optional string Language = 11;
      private java.lang.Object language_ = "";
      /**
       * <code>optional string Language = 11;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public boolean hasLanguage() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string Language = 11;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public java.lang.String getLanguage() {
        java.lang.Object ref = language_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          language_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Language = 11;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public com.google.protobuf.ByteString
          getLanguageBytes() {
        java.lang.Object ref = language_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          language_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Language = 11;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder setLanguage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        language_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Language = 11;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder clearLanguage() {
        bitField0_ = (bitField0_ & ~0x00000100);
        language_ = getDefaultInstance().getLanguage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Language = 11;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder setLanguageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        language_ = value;
        onChanged();
        return this;
      }

      // optional string DeviceName = 12;
      private java.lang.Object deviceName_ = "";
      /**
       * <code>optional string DeviceName = 12;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public boolean hasDeviceName() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string DeviceName = 12;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public java.lang.String getDeviceName() {
        java.lang.Object ref = deviceName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          deviceName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string DeviceName = 12;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDeviceNameBytes() {
        java.lang.Object ref = deviceName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string DeviceName = 12;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder setDeviceName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        deviceName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string DeviceName = 12;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder clearDeviceName() {
        bitField0_ = (bitField0_ & ~0x00000200);
        deviceName_ = getDefaultInstance().getDeviceName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string DeviceName = 12;</code>
       *
       * <pre>
       * 废弃
       * </pre>
       */
      public Builder setDeviceNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        deviceName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.AuthRequest)
    }

    static {
      defaultInstance = new AuthRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.AuthRequest)
  }

  public interface AuthResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BaseResponse BaseResponse = 1;
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    boolean hasBaseResponse();
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    MmBp.BaseResponse getBaseResponse();
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder();

    // required bytes AesSessionKey = 2;
    /**
     * <code>required bytes AesSessionKey = 2;</code>
     */
    boolean hasAesSessionKey();
    /**
     * <code>required bytes AesSessionKey = 2;</code>
     */
    com.google.protobuf.ByteString getAesSessionKey();
  }
  /**
   * Protobuf type {@code MmBp.AuthResponse}
   */
  public static final class AuthResponse extends
      com.google.protobuf.GeneratedMessage
      implements AuthResponseOrBuilder {
    // Use AuthResponse.newBuilder() to construct.
    private AuthResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AuthResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AuthResponse defaultInstance;
    public static AuthResponse getDefaultInstance() {
      return defaultInstance;
    }

    public AuthResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AuthResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BaseResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseResponse_.toBuilder();
              }
              baseResponse_ = input.readMessage(MmBp.BaseResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseResponse_);
                baseResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              aesSessionKey_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_AuthResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_AuthResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.AuthResponse.class, MmBp.AuthResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<AuthResponse> PARSER =
        new com.google.protobuf.AbstractParser<AuthResponse>() {
      public AuthResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AuthResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BaseResponse BaseResponse = 1;
    public static final int BASERESPONSE_FIELD_NUMBER = 1;
    private MmBp.BaseResponse baseResponse_;
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public MmBp.BaseResponse getBaseResponse() {
      return baseResponse_;
    }
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder() {
      return baseResponse_;
    }

    // required bytes AesSessionKey = 2;
    public static final int AESSESSIONKEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString aesSessionKey_;
    /**
     * <code>required bytes AesSessionKey = 2;</code>
     */
    public boolean hasAesSessionKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bytes AesSessionKey = 2;</code>
     */
    public com.google.protobuf.ByteString getAesSessionKey() {
      return aesSessionKey_;
    }

    private void initFields() {
      baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
      aesSessionKey_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAesSessionKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBaseResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, aesSessionKey_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, aesSessionKey_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.AuthResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.AuthResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.AuthResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.AuthResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.AuthResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.AuthResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.AuthResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.AuthResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.AuthResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.AuthResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.AuthResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.AuthResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.AuthResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_AuthResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_AuthResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.AuthResponse.class, MmBp.AuthResponse.Builder.class);
      }

      // Construct using MmBp.AuthResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseResponseBuilder_ == null) {
          baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        aesSessionKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_AuthResponse_descriptor;
      }

      public MmBp.AuthResponse getDefaultInstanceForType() {
        return MmBp.AuthResponse.getDefaultInstance();
      }

      public MmBp.AuthResponse build() {
        MmBp.AuthResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.AuthResponse buildPartial() {
        MmBp.AuthResponse result = new MmBp.AuthResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.aesSessionKey_ = aesSessionKey_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.AuthResponse) {
          return mergeFrom((MmBp.AuthResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.AuthResponse other) {
        if (other == MmBp.AuthResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.hasAesSessionKey()) {
          setAesSessionKey(other.getAesSessionKey());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseResponse()) {

          return false;
        }
        if (!hasAesSessionKey()) {

          return false;
        }
        if (!getBaseResponse().isInitialized()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.AuthResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.AuthResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BaseResponse BaseResponse = 1;
      private MmBp.BaseResponse baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder> baseResponseBuilder_;
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public boolean hasBaseResponse() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponse getBaseResponse() {
        if (baseResponseBuilder_ == null) {
          return baseResponse_;
        } else {
          return baseResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(MmBp.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseResponse_ = value;
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(
          MmBp.BaseResponse.Builder builderForValue) {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = builderForValue.build();
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder mergeBaseResponse(MmBp.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseResponse_ != MmBp.BaseResponse.getDefaultInstance()) {
            baseResponse_ =
              MmBp.BaseResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
          } else {
            baseResponse_ = value;
          }
          onChanged();
        } else {
          baseResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder clearBaseResponse() {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
          onChanged();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponse.Builder getBaseResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder() {
        if (baseResponseBuilder_ != null) {
          return baseResponseBuilder_.getMessageOrBuilder();
        } else {
          return baseResponse_;
        }
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder>
          getBaseResponseFieldBuilder() {
        if (baseResponseBuilder_ == null) {
          baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder>(
                  baseResponse_,
                  getParentForChildren(),
                  isClean());
          baseResponse_ = null;
        }
        return baseResponseBuilder_;
      }

      // required bytes AesSessionKey = 2;
      private com.google.protobuf.ByteString aesSessionKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes AesSessionKey = 2;</code>
       */
      public boolean hasAesSessionKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bytes AesSessionKey = 2;</code>
       */
      public com.google.protobuf.ByteString getAesSessionKey() {
        return aesSessionKey_;
      }
      /**
       * <code>required bytes AesSessionKey = 2;</code>
       */
      public Builder setAesSessionKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        aesSessionKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes AesSessionKey = 2;</code>
       */
      public Builder clearAesSessionKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        aesSessionKey_ = getDefaultInstance().getAesSessionKey();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.AuthResponse)
    }

    static {
      defaultInstance = new AuthResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.AuthResponse)
  }

  public interface InitRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BaseRequest BaseRequest = 1;
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    boolean hasBaseRequest();
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    MmBp.BaseRequest getBaseRequest();
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder();

    // optional bytes RespFieldFilter = 2;
    /**
     * <code>optional bytes RespFieldFilter = 2;</code>
     *
     * <pre>
     * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
     * </pre>
     */
    boolean hasRespFieldFilter();
    /**
     * <code>optional bytes RespFieldFilter = 2;</code>
     *
     * <pre>
     * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
     * </pre>
     */
    com.google.protobuf.ByteString getRespFieldFilter();

    // optional bytes Challenge = 3;
    /**
     * <code>optional bytes Challenge = 3;</code>
     *
     * <pre>
     * 设备用来验证手机是否安全。为设备随机生成的四个字节。
     * </pre>
     */
    boolean hasChallenge();
    /**
     * <code>optional bytes Challenge = 3;</code>
     *
     * <pre>
     * 设备用来验证手机是否安全。为设备随机生成的四个字节。
     * </pre>
     */
    com.google.protobuf.ByteString getChallenge();
  }
  /**
   * Protobuf type {@code MmBp.InitRequest}
   */
  public static final class InitRequest extends
      com.google.protobuf.GeneratedMessage
      implements InitRequestOrBuilder {
    // Use InitRequest.newBuilder() to construct.
    private InitRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InitRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InitRequest defaultInstance;
    public static InitRequest getDefaultInstance() {
      return defaultInstance;
    }

    public InitRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InitRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BaseRequest.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseRequest_.toBuilder();
              }
              baseRequest_ = input.readMessage(MmBp.BaseRequest.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseRequest_);
                baseRequest_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              respFieldFilter_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              challenge_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_InitRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_InitRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.InitRequest.class, MmBp.InitRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<InitRequest> PARSER =
        new com.google.protobuf.AbstractParser<InitRequest>() {
      public InitRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InitRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BaseRequest BaseRequest = 1;
    public static final int BASEREQUEST_FIELD_NUMBER = 1;
    private MmBp.BaseRequest baseRequest_;
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public boolean hasBaseRequest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public MmBp.BaseRequest getBaseRequest() {
      return baseRequest_;
    }
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder() {
      return baseRequest_;
    }

    // optional bytes RespFieldFilter = 2;
    public static final int RESPFIELDFILTER_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString respFieldFilter_;
    /**
     * <code>optional bytes RespFieldFilter = 2;</code>
     *
     * <pre>
     * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
     * </pre>
     */
    public boolean hasRespFieldFilter() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes RespFieldFilter = 2;</code>
     *
     * <pre>
     * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
     * </pre>
     */
    public com.google.protobuf.ByteString getRespFieldFilter() {
      return respFieldFilter_;
    }

    // optional bytes Challenge = 3;
    public static final int CHALLENGE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString challenge_;
    /**
     * <code>optional bytes Challenge = 3;</code>
     *
     * <pre>
     * 设备用来验证手机是否安全。为设备随机生成的四个字节。
     * </pre>
     */
    public boolean hasChallenge() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes Challenge = 3;</code>
     *
     * <pre>
     * 设备用来验证手机是否安全。为设备随机生成的四个字节。
     * </pre>
     */
    public com.google.protobuf.ByteString getChallenge() {
      return challenge_;
    }

    private void initFields() {
      baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
      respFieldFilter_ = com.google.protobuf.ByteString.EMPTY;
      challenge_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseRequest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, respFieldFilter_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, challenge_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, respFieldFilter_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, challenge_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.InitRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.InitRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.InitRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.InitRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.InitRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.InitRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.InitRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.InitRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.InitRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.InitRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.InitRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.InitRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.InitRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_InitRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_InitRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.InitRequest.class, MmBp.InitRequest.Builder.class);
      }

      // Construct using MmBp.InitRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseRequestFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseRequestBuilder_ == null) {
          baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        respFieldFilter_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        challenge_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_InitRequest_descriptor;
      }

      public MmBp.InitRequest getDefaultInstanceForType() {
        return MmBp.InitRequest.getDefaultInstance();
      }

      public MmBp.InitRequest build() {
        MmBp.InitRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.InitRequest buildPartial() {
        MmBp.InitRequest result = new MmBp.InitRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseRequestBuilder_ == null) {
          result.baseRequest_ = baseRequest_;
        } else {
          result.baseRequest_ = baseRequestBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.respFieldFilter_ = respFieldFilter_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.challenge_ = challenge_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.InitRequest) {
          return mergeFrom((MmBp.InitRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.InitRequest other) {
        if (other == MmBp.InitRequest.getDefaultInstance()) return this;
        if (other.hasBaseRequest()) {
          mergeBaseRequest(other.getBaseRequest());
        }
        if (other.hasRespFieldFilter()) {
          setRespFieldFilter(other.getRespFieldFilter());
        }
        if (other.hasChallenge()) {
          setChallenge(other.getChallenge());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseRequest()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.InitRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.InitRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BaseRequest BaseRequest = 1;
      private MmBp.BaseRequest baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder> baseRequestBuilder_;
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public boolean hasBaseRequest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequest getBaseRequest() {
        if (baseRequestBuilder_ == null) {
          return baseRequest_;
        } else {
          return baseRequestBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(MmBp.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseRequest_ = value;
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(
          MmBp.BaseRequest.Builder builderForValue) {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = builderForValue.build();
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder mergeBaseRequest(MmBp.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseRequest_ != MmBp.BaseRequest.getDefaultInstance()) {
            baseRequest_ =
              MmBp.BaseRequest.newBuilder(baseRequest_).mergeFrom(value).buildPartial();
          } else {
            baseRequest_ = value;
          }
          onChanged();
        } else {
          baseRequestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder clearBaseRequest() {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
          onChanged();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequest.Builder getBaseRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder() {
        if (baseRequestBuilder_ != null) {
          return baseRequestBuilder_.getMessageOrBuilder();
        } else {
          return baseRequest_;
        }
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder>
          getBaseRequestFieldBuilder() {
        if (baseRequestBuilder_ == null) {
          baseRequestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder>(
                  baseRequest_,
                  getParentForChildren(),
                  isClean());
          baseRequest_ = null;
        }
        return baseRequestBuilder_;
      }

      // optional bytes RespFieldFilter = 2;
      private com.google.protobuf.ByteString respFieldFilter_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes RespFieldFilter = 2;</code>
       *
       * <pre>
       * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
       * </pre>
       */
      public boolean hasRespFieldFilter() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes RespFieldFilter = 2;</code>
       *
       * <pre>
       * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
       * </pre>
       */
      public com.google.protobuf.ByteString getRespFieldFilter() {
        return respFieldFilter_;
      }
      /**
       * <code>optional bytes RespFieldFilter = 2;</code>
       *
       * <pre>
       * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
       * </pre>
       */
      public Builder setRespFieldFilter(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        respFieldFilter_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes RespFieldFilter = 2;</code>
       *
       * <pre>
       * 当一个 bit 被设置就表示要 resp 的某个字段：见EmInitRespFieldFilter。
       * </pre>
       */
      public Builder clearRespFieldFilter() {
        bitField0_ = (bitField0_ & ~0x00000002);
        respFieldFilter_ = getDefaultInstance().getRespFieldFilter();
        onChanged();
        return this;
      }

      // optional bytes Challenge = 3;
      private com.google.protobuf.ByteString challenge_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes Challenge = 3;</code>
       *
       * <pre>
       * 设备用来验证手机是否安全。为设备随机生成的四个字节。
       * </pre>
       */
      public boolean hasChallenge() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes Challenge = 3;</code>
       *
       * <pre>
       * 设备用来验证手机是否安全。为设备随机生成的四个字节。
       * </pre>
       */
      public com.google.protobuf.ByteString getChallenge() {
        return challenge_;
      }
      /**
       * <code>optional bytes Challenge = 3;</code>
       *
       * <pre>
       * 设备用来验证手机是否安全。为设备随机生成的四个字节。
       * </pre>
       */
      public Builder setChallenge(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        challenge_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes Challenge = 3;</code>
       *
       * <pre>
       * 设备用来验证手机是否安全。为设备随机生成的四个字节。
       * </pre>
       */
      public Builder clearChallenge() {
        bitField0_ = (bitField0_ & ~0x00000004);
        challenge_ = getDefaultInstance().getChallenge();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.InitRequest)
    }

    static {
      defaultInstance = new InitRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.InitRequest)
  }

  public interface InitResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BaseResponse BaseResponse = 1;
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    boolean hasBaseResponse();
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    MmBp.BaseResponse getBaseResponse();
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder();

    // required uint32 UserIdHigh = 2;
    /**
     * <code>required uint32 UserIdHigh = 2;</code>
     *
     * <pre>
     * 微信用户 Id 高 32 位
     * </pre>
     */
    boolean hasUserIdHigh();
    /**
     * <code>required uint32 UserIdHigh = 2;</code>
     *
     * <pre>
     * 微信用户 Id 高 32 位
     * </pre>
     */
    int getUserIdHigh();

    // required uint32 UserIdLow = 3;
    /**
     * <code>required uint32 UserIdLow = 3;</code>
     *
     * <pre>
     * 微信用户 Id 低 32 位
     * </pre>
     */
    boolean hasUserIdLow();
    /**
     * <code>required uint32 UserIdLow = 3;</code>
     *
     * <pre>
     * 微信用户 Id 低 32 位
     * </pre>
     */
    int getUserIdLow();

    // optional uint32 ChalleangeAnswer = 4;
    /**
     * <code>optional uint32 ChalleangeAnswer = 4;</code>
     *
     * <pre>
     * 手机回复设备的挑战。为设备生成的字节的 crc32。
     * </pre>
     */
    boolean hasChalleangeAnswer();
    /**
     * <code>optional uint32 ChalleangeAnswer = 4;</code>
     *
     * <pre>
     * 手机回复设备的挑战。为设备生成的字节的 crc32。
     * </pre>
     */
    int getChalleangeAnswer();

    // optional .MmBp.EmInitScence InitScence = 5;
    /**
     * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
     *
     * <pre>
     * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
     * </pre>
     */
    boolean hasInitScence();
    /**
     * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
     *
     * <pre>
     * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
     * </pre>
     */
    MmBp.EmInitScence getInitScence();

    // optional uint32 AutoSyncMaxDurationSecond = 6;
    /**
     * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
     *
     * <pre>
     * 自动同步最多持续多长，微信就会关闭连接。
     * </pre>
     */
    boolean hasAutoSyncMaxDurationSecond();
    /**
     * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
     *
     * <pre>
     * 自动同步最多持续多长，微信就会关闭连接。
     * </pre>
     */
    int getAutoSyncMaxDurationSecond();

    // optional string UserNickName = 11;
    /**
     * <code>optional string UserNickName = 11;</code>
     *
     * <pre>
     * 微信用户昵称
     * </pre>
     */
    boolean hasUserNickName();
    /**
     * <code>optional string UserNickName = 11;</code>
     *
     * <pre>
     * 微信用户昵称
     * </pre>
     */
    java.lang.String getUserNickName();
    /**
     * <code>optional string UserNickName = 11;</code>
     *
     * <pre>
     * 微信用户昵称
     * </pre>
     */
    com.google.protobuf.ByteString
        getUserNickNameBytes();

    // optional .MmBp.EmPlatformType PlatformType = 12;
    /**
     * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
     *
     * <pre>
     * 手机平台
     * </pre>
     */
    boolean hasPlatformType();
    /**
     * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
     *
     * <pre>
     * 手机平台
     * </pre>
     */
    MmBp.EmPlatformType getPlatformType();

    // optional string Model = 13;
    /**
     * <code>optional string Model = 13;</code>
     *
     * <pre>
     * 手机硬件型号
     * </pre>
     */
    boolean hasModel();
    /**
     * <code>optional string Model = 13;</code>
     *
     * <pre>
     * 手机硬件型号
     * </pre>
     */
    java.lang.String getModel();
    /**
     * <code>optional string Model = 13;</code>
     *
     * <pre>
     * 手机硬件型号
     * </pre>
     */
    com.google.protobuf.ByteString
        getModelBytes();

    // optional string Os = 14;
    /**
     * <code>optional string Os = 14;</code>
     *
     * <pre>
     * 手机 os 版本
     * </pre>
     */
    boolean hasOs();
    /**
     * <code>optional string Os = 14;</code>
     *
     * <pre>
     * 手机 os 版本
     * </pre>
     */
    java.lang.String getOs();
    /**
     * <code>optional string Os = 14;</code>
     *
     * <pre>
     * 手机 os 版本
     * </pre>
     */
    com.google.protobuf.ByteString
        getOsBytes();

    // optional int32 Time = 15;
    /**
     * <code>optional int32 Time = 15;</code>
     *
     * <pre>
     * 手机当前时间
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>optional int32 Time = 15;</code>
     *
     * <pre>
     * 手机当前时间
     * </pre>
     */
    int getTime();

    // optional int32 TimeZone = 16;
    /**
     * <code>optional int32 TimeZone = 16;</code>
     *
     * <pre>
     * 手机当前时区
     * </pre>
     */
    boolean hasTimeZone();
    /**
     * <code>optional int32 TimeZone = 16;</code>
     *
     * <pre>
     * 手机当前时区
     * </pre>
     */
    int getTimeZone();

    // optional string TimeString = 17;
    /**
     * <code>optional string TimeString = 17;</code>
     *
     * <pre>
     * 手机当前时间，格式如 201402281005285，具体字段
     * </pre>
     */
    boolean hasTimeString();
    /**
     * <code>optional string TimeString = 17;</code>
     *
     * <pre>
     * 手机当前时间，格式如 201402281005285，具体字段
     * </pre>
     */
    java.lang.String getTimeString();
    /**
     * <code>optional string TimeString = 17;</code>
     *
     * <pre>
     * 手机当前时间，格式如 201402281005285，具体字段
     * </pre>
     */
    com.google.protobuf.ByteString
        getTimeStringBytes();
  }
  /**
   * Protobuf type {@code MmBp.InitResponse}
   */
  public static final class InitResponse extends
      com.google.protobuf.GeneratedMessage
      implements InitResponseOrBuilder {
    // Use InitResponse.newBuilder() to construct.
    private InitResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InitResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InitResponse defaultInstance;
    public static InitResponse getDefaultInstance() {
      return defaultInstance;
    }

    public InitResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InitResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BaseResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseResponse_.toBuilder();
              }
              baseResponse_ = input.readMessage(MmBp.BaseResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseResponse_);
                baseResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              userIdHigh_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              userIdLow_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              challeangeAnswer_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              MmBp.EmInitScence value = MmBp.EmInitScence.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                initScence_ = value;
              }
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              autoSyncMaxDurationSecond_ = input.readUInt32();
              break;
            }
            case 90: {
              bitField0_ |= 0x00000040;
              userNickName_ = input.readBytes();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();
              MmBp.EmPlatformType value = MmBp.EmPlatformType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(12, rawValue);
              } else {
                bitField0_ |= 0x00000080;
                platformType_ = value;
              }
              break;
            }
            case 106: {
              bitField0_ |= 0x00000100;
              model_ = input.readBytes();
              break;
            }
            case 114: {
              bitField0_ |= 0x00000200;
              os_ = input.readBytes();
              break;
            }
            case 120: {
              bitField0_ |= 0x00000400;
              time_ = input.readInt32();
              break;
            }
            case 128: {
              bitField0_ |= 0x00000800;
              timeZone_ = input.readInt32();
              break;
            }
            case 138: {
              bitField0_ |= 0x00001000;
              timeString_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_InitResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_InitResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.InitResponse.class, MmBp.InitResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<InitResponse> PARSER =
        new com.google.protobuf.AbstractParser<InitResponse>() {
      public InitResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InitResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BaseResponse BaseResponse = 1;
    public static final int BASERESPONSE_FIELD_NUMBER = 1;
    private MmBp.BaseResponse baseResponse_;
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public MmBp.BaseResponse getBaseResponse() {
      return baseResponse_;
    }
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder() {
      return baseResponse_;
    }

    // required uint32 UserIdHigh = 2;
    public static final int USERIDHIGH_FIELD_NUMBER = 2;
    private int userIdHigh_;
    /**
     * <code>required uint32 UserIdHigh = 2;</code>
     *
     * <pre>
     * 微信用户 Id 高 32 位
     * </pre>
     */
    public boolean hasUserIdHigh() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 UserIdHigh = 2;</code>
     *
     * <pre>
     * 微信用户 Id 高 32 位
     * </pre>
     */
    public int getUserIdHigh() {
      return userIdHigh_;
    }

    // required uint32 UserIdLow = 3;
    public static final int USERIDLOW_FIELD_NUMBER = 3;
    private int userIdLow_;
    /**
     * <code>required uint32 UserIdLow = 3;</code>
     *
     * <pre>
     * 微信用户 Id 低 32 位
     * </pre>
     */
    public boolean hasUserIdLow() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 UserIdLow = 3;</code>
     *
     * <pre>
     * 微信用户 Id 低 32 位
     * </pre>
     */
    public int getUserIdLow() {
      return userIdLow_;
    }

    // optional uint32 ChalleangeAnswer = 4;
    public static final int CHALLEANGEANSWER_FIELD_NUMBER = 4;
    private int challeangeAnswer_;
    /**
     * <code>optional uint32 ChalleangeAnswer = 4;</code>
     *
     * <pre>
     * 手机回复设备的挑战。为设备生成的字节的 crc32。
     * </pre>
     */
    public boolean hasChalleangeAnswer() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 ChalleangeAnswer = 4;</code>
     *
     * <pre>
     * 手机回复设备的挑战。为设备生成的字节的 crc32。
     * </pre>
     */
    public int getChalleangeAnswer() {
      return challeangeAnswer_;
    }

    // optional .MmBp.EmInitScence InitScence = 5;
    public static final int INITSCENCE_FIELD_NUMBER = 5;
    private MmBp.EmInitScence initScence_;
    /**
     * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
     *
     * <pre>
     * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
     * </pre>
     */
    public boolean hasInitScence() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
     *
     * <pre>
     * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
     * </pre>
     */
    public MmBp.EmInitScence getInitScence() {
      return initScence_;
    }

    // optional uint32 AutoSyncMaxDurationSecond = 6;
    public static final int AUTOSYNCMAXDURATIONSECOND_FIELD_NUMBER = 6;
    private int autoSyncMaxDurationSecond_;
    /**
     * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
     *
     * <pre>
     * 自动同步最多持续多长，微信就会关闭连接。
     * </pre>
     */
    public boolean hasAutoSyncMaxDurationSecond() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
     *
     * <pre>
     * 自动同步最多持续多长，微信就会关闭连接。
     * </pre>
     */
    public int getAutoSyncMaxDurationSecond() {
      return autoSyncMaxDurationSecond_;
    }

    // optional string UserNickName = 11;
    public static final int USERNICKNAME_FIELD_NUMBER = 11;
    private java.lang.Object userNickName_;
    /**
     * <code>optional string UserNickName = 11;</code>
     *
     * <pre>
     * 微信用户昵称
     * </pre>
     */
    public boolean hasUserNickName() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string UserNickName = 11;</code>
     *
     * <pre>
     * 微信用户昵称
     * </pre>
     */
    public java.lang.String getUserNickName() {
      java.lang.Object ref = userNickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userNickName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string UserNickName = 11;</code>
     *
     * <pre>
     * 微信用户昵称
     * </pre>
     */
    public com.google.protobuf.ByteString
        getUserNickNameBytes() {
      java.lang.Object ref = userNickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userNickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .MmBp.EmPlatformType PlatformType = 12;
    public static final int PLATFORMTYPE_FIELD_NUMBER = 12;
    private MmBp.EmPlatformType platformType_;
    /**
     * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
     *
     * <pre>
     * 手机平台
     * </pre>
     */
    public boolean hasPlatformType() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
     *
     * <pre>
     * 手机平台
     * </pre>
     */
    public MmBp.EmPlatformType getPlatformType() {
      return platformType_;
    }

    // optional string Model = 13;
    public static final int MODEL_FIELD_NUMBER = 13;
    private java.lang.Object model_;
    /**
     * <code>optional string Model = 13;</code>
     *
     * <pre>
     * 手机硬件型号
     * </pre>
     */
    public boolean hasModel() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string Model = 13;</code>
     *
     * <pre>
     * 手机硬件型号
     * </pre>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          model_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Model = 13;</code>
     *
     * <pre>
     * 手机硬件型号
     * </pre>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string Os = 14;
    public static final int OS_FIELD_NUMBER = 14;
    private java.lang.Object os_;
    /**
     * <code>optional string Os = 14;</code>
     *
     * <pre>
     * 手机 os 版本
     * </pre>
     */
    public boolean hasOs() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional string Os = 14;</code>
     *
     * <pre>
     * 手机 os 版本
     * </pre>
     */
    public java.lang.String getOs() {
      java.lang.Object ref = os_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          os_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Os = 14;</code>
     *
     * <pre>
     * 手机 os 版本
     * </pre>
     */
    public com.google.protobuf.ByteString
        getOsBytes() {
      java.lang.Object ref = os_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        os_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 Time = 15;
    public static final int TIME_FIELD_NUMBER = 15;
    private int time_;
    /**
     * <code>optional int32 Time = 15;</code>
     *
     * <pre>
     * 手机当前时间
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    /**
     * <code>optional int32 Time = 15;</code>
     *
     * <pre>
     * 手机当前时间
     * </pre>
     */
    public int getTime() {
      return time_;
    }

    // optional int32 TimeZone = 16;
    public static final int TIMEZONE_FIELD_NUMBER = 16;
    private int timeZone_;
    /**
     * <code>optional int32 TimeZone = 16;</code>
     *
     * <pre>
     * 手机当前时区
     * </pre>
     */
    public boolean hasTimeZone() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    /**
     * <code>optional int32 TimeZone = 16;</code>
     *
     * <pre>
     * 手机当前时区
     * </pre>
     */
    public int getTimeZone() {
      return timeZone_;
    }

    // optional string TimeString = 17;
    public static final int TIMESTRING_FIELD_NUMBER = 17;
    private java.lang.Object timeString_;
    /**
     * <code>optional string TimeString = 17;</code>
     *
     * <pre>
     * 手机当前时间，格式如 201402281005285，具体字段
     * </pre>
     */
    public boolean hasTimeString() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    /**
     * <code>optional string TimeString = 17;</code>
     *
     * <pre>
     * 手机当前时间，格式如 201402281005285，具体字段
     * </pre>
     */
    public java.lang.String getTimeString() {
      java.lang.Object ref = timeString_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          timeString_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string TimeString = 17;</code>
     *
     * <pre>
     * 手机当前时间，格式如 201402281005285，具体字段
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTimeStringBytes() {
      java.lang.Object ref = timeString_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timeString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
      userIdHigh_ = 0;
      userIdLow_ = 0;
      challeangeAnswer_ = 0;
      initScence_ = MmBp.EmInitScence.EIS_deviceChat;
      autoSyncMaxDurationSecond_ = 0;
      userNickName_ = "";
      platformType_ = MmBp.EmPlatformType.EPT_ios;
      model_ = "";
      os_ = "";
      time_ = 0;
      timeZone_ = 0;
      timeString_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserIdHigh()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUserIdLow()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBaseResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, userIdHigh_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, userIdLow_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, challeangeAnswer_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, initScence_.getNumber());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(6, autoSyncMaxDurationSecond_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(11, getUserNickNameBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeEnum(12, platformType_.getNumber());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(13, getModelBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBytes(14, getOsBytes());
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(15, time_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeInt32(16, timeZone_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeBytes(17, getTimeStringBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, userIdHigh_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, userIdLow_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, challeangeAnswer_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, initScence_.getNumber());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, autoSyncMaxDurationSecond_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getUserNickNameBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, platformType_.getNumber());
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(13, getModelBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(14, getOsBytes());
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, time_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, timeZone_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(17, getTimeStringBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.InitResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.InitResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.InitResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.InitResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.InitResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.InitResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.InitResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.InitResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.InitResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.InitResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.InitResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.InitResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.InitResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_InitResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_InitResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.InitResponse.class, MmBp.InitResponse.Builder.class);
      }

      // Construct using MmBp.InitResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseResponseBuilder_ == null) {
          baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        userIdHigh_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        userIdLow_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        challeangeAnswer_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        initScence_ = MmBp.EmInitScence.EIS_deviceChat;
        bitField0_ = (bitField0_ & ~0x00000010);
        autoSyncMaxDurationSecond_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        userNickName_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        platformType_ = MmBp.EmPlatformType.EPT_ios;
        bitField0_ = (bitField0_ & ~0x00000080);
        model_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        os_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        time_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        timeZone_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        timeString_ = "";
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_InitResponse_descriptor;
      }

      public MmBp.InitResponse getDefaultInstanceForType() {
        return MmBp.InitResponse.getDefaultInstance();
      }

      public MmBp.InitResponse build() {
        MmBp.InitResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.InitResponse buildPartial() {
        MmBp.InitResponse result = new MmBp.InitResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userIdHigh_ = userIdHigh_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.userIdLow_ = userIdLow_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.challeangeAnswer_ = challeangeAnswer_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.initScence_ = initScence_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.autoSyncMaxDurationSecond_ = autoSyncMaxDurationSecond_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.userNickName_ = userNickName_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.platformType_ = platformType_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.model_ = model_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.os_ = os_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.time_ = time_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.timeZone_ = timeZone_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.timeString_ = timeString_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.InitResponse) {
          return mergeFrom((MmBp.InitResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.InitResponse other) {
        if (other == MmBp.InitResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.hasUserIdHigh()) {
          setUserIdHigh(other.getUserIdHigh());
        }
        if (other.hasUserIdLow()) {
          setUserIdLow(other.getUserIdLow());
        }
        if (other.hasChalleangeAnswer()) {
          setChalleangeAnswer(other.getChalleangeAnswer());
        }
        if (other.hasInitScence()) {
          setInitScence(other.getInitScence());
        }
        if (other.hasAutoSyncMaxDurationSecond()) {
          setAutoSyncMaxDurationSecond(other.getAutoSyncMaxDurationSecond());
        }
        if (other.hasUserNickName()) {
          bitField0_ |= 0x00000040;
          userNickName_ = other.userNickName_;
          onChanged();
        }
        if (other.hasPlatformType()) {
          setPlatformType(other.getPlatformType());
        }
        if (other.hasModel()) {
          bitField0_ |= 0x00000100;
          model_ = other.model_;
          onChanged();
        }
        if (other.hasOs()) {
          bitField0_ |= 0x00000200;
          os_ = other.os_;
          onChanged();
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        if (other.hasTimeZone()) {
          setTimeZone(other.getTimeZone());
        }
        if (other.hasTimeString()) {
          bitField0_ |= 0x00001000;
          timeString_ = other.timeString_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseResponse()) {

          return false;
        }
        if (!hasUserIdHigh()) {

          return false;
        }
        if (!hasUserIdLow()) {

          return false;
        }
        if (!getBaseResponse().isInitialized()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.InitResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.InitResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BaseResponse BaseResponse = 1;
      private MmBp.BaseResponse baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder> baseResponseBuilder_;
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public boolean hasBaseResponse() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponse getBaseResponse() {
        if (baseResponseBuilder_ == null) {
          return baseResponse_;
        } else {
          return baseResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(MmBp.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseResponse_ = value;
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(
          MmBp.BaseResponse.Builder builderForValue) {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = builderForValue.build();
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder mergeBaseResponse(MmBp.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseResponse_ != MmBp.BaseResponse.getDefaultInstance()) {
            baseResponse_ =
              MmBp.BaseResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
          } else {
            baseResponse_ = value;
          }
          onChanged();
        } else {
          baseResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder clearBaseResponse() {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
          onChanged();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponse.Builder getBaseResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder() {
        if (baseResponseBuilder_ != null) {
          return baseResponseBuilder_.getMessageOrBuilder();
        } else {
          return baseResponse_;
        }
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder>
          getBaseResponseFieldBuilder() {
        if (baseResponseBuilder_ == null) {
          baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder>(
                  baseResponse_,
                  getParentForChildren(),
                  isClean());
          baseResponse_ = null;
        }
        return baseResponseBuilder_;
      }

      // required uint32 UserIdHigh = 2;
      private int userIdHigh_ ;
      /**
       * <code>required uint32 UserIdHigh = 2;</code>
       *
       * <pre>
       * 微信用户 Id 高 32 位
       * </pre>
       */
      public boolean hasUserIdHigh() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 UserIdHigh = 2;</code>
       *
       * <pre>
       * 微信用户 Id 高 32 位
       * </pre>
       */
      public int getUserIdHigh() {
        return userIdHigh_;
      }
      /**
       * <code>required uint32 UserIdHigh = 2;</code>
       *
       * <pre>
       * 微信用户 Id 高 32 位
       * </pre>
       */
      public Builder setUserIdHigh(int value) {
        bitField0_ |= 0x00000002;
        userIdHigh_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 UserIdHigh = 2;</code>
       *
       * <pre>
       * 微信用户 Id 高 32 位
       * </pre>
       */
      public Builder clearUserIdHigh() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userIdHigh_ = 0;
        onChanged();
        return this;
      }

      // required uint32 UserIdLow = 3;
      private int userIdLow_ ;
      /**
       * <code>required uint32 UserIdLow = 3;</code>
       *
       * <pre>
       * 微信用户 Id 低 32 位
       * </pre>
       */
      public boolean hasUserIdLow() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint32 UserIdLow = 3;</code>
       *
       * <pre>
       * 微信用户 Id 低 32 位
       * </pre>
       */
      public int getUserIdLow() {
        return userIdLow_;
      }
      /**
       * <code>required uint32 UserIdLow = 3;</code>
       *
       * <pre>
       * 微信用户 Id 低 32 位
       * </pre>
       */
      public Builder setUserIdLow(int value) {
        bitField0_ |= 0x00000004;
        userIdLow_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 UserIdLow = 3;</code>
       *
       * <pre>
       * 微信用户 Id 低 32 位
       * </pre>
       */
      public Builder clearUserIdLow() {
        bitField0_ = (bitField0_ & ~0x00000004);
        userIdLow_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 ChalleangeAnswer = 4;
      private int challeangeAnswer_ ;
      /**
       * <code>optional uint32 ChalleangeAnswer = 4;</code>
       *
       * <pre>
       * 手机回复设备的挑战。为设备生成的字节的 crc32。
       * </pre>
       */
      public boolean hasChalleangeAnswer() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 ChalleangeAnswer = 4;</code>
       *
       * <pre>
       * 手机回复设备的挑战。为设备生成的字节的 crc32。
       * </pre>
       */
      public int getChalleangeAnswer() {
        return challeangeAnswer_;
      }
      /**
       * <code>optional uint32 ChalleangeAnswer = 4;</code>
       *
       * <pre>
       * 手机回复设备的挑战。为设备生成的字节的 crc32。
       * </pre>
       */
      public Builder setChalleangeAnswer(int value) {
        bitField0_ |= 0x00000008;
        challeangeAnswer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ChalleangeAnswer = 4;</code>
       *
       * <pre>
       * 手机回复设备的挑战。为设备生成的字节的 crc32。
       * </pre>
       */
      public Builder clearChalleangeAnswer() {
        bitField0_ = (bitField0_ & ~0x00000008);
        challeangeAnswer_ = 0;
        onChanged();
        return this;
      }

      // optional .MmBp.EmInitScence InitScence = 5;
      private MmBp.EmInitScence initScence_ = MmBp.EmInitScence.EIS_deviceChat;
      /**
       * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
       *
       * <pre>
       * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
       * </pre>
       */
      public boolean hasInitScence() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
       *
       * <pre>
       * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
       * </pre>
       */
      public MmBp.EmInitScence getInitScence() {
        return initScence_;
      }
      /**
       * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
       *
       * <pre>
       * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
       * </pre>
       */
      public Builder setInitScence(MmBp.EmInitScence value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        initScence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .MmBp.EmInitScence InitScence = 5;</code>
       *
       * <pre>
       * 微信连接上设备时，处于什么情景。如果该字段为空，表示处于 EIS_deviceChat 下。
       * </pre>
       */
      public Builder clearInitScence() {
        bitField0_ = (bitField0_ & ~0x00000010);
        initScence_ = MmBp.EmInitScence.EIS_deviceChat;
        onChanged();
        return this;
      }

      // optional uint32 AutoSyncMaxDurationSecond = 6;
      private int autoSyncMaxDurationSecond_ ;
      /**
       * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
       *
       * <pre>
       * 自动同步最多持续多长，微信就会关闭连接。
       * </pre>
       */
      public boolean hasAutoSyncMaxDurationSecond() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
       *
       * <pre>
       * 自动同步最多持续多长，微信就会关闭连接。
       * </pre>
       */
      public int getAutoSyncMaxDurationSecond() {
        return autoSyncMaxDurationSecond_;
      }
      /**
       * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
       *
       * <pre>
       * 自动同步最多持续多长，微信就会关闭连接。
       * </pre>
       */
      public Builder setAutoSyncMaxDurationSecond(int value) {
        bitField0_ |= 0x00000020;
        autoSyncMaxDurationSecond_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 AutoSyncMaxDurationSecond = 6;</code>
       *
       * <pre>
       * 自动同步最多持续多长，微信就会关闭连接。
       * </pre>
       */
      public Builder clearAutoSyncMaxDurationSecond() {
        bitField0_ = (bitField0_ & ~0x00000020);
        autoSyncMaxDurationSecond_ = 0;
        onChanged();
        return this;
      }

      // optional string UserNickName = 11;
      private java.lang.Object userNickName_ = "";
      /**
       * <code>optional string UserNickName = 11;</code>
       *
       * <pre>
       * 微信用户昵称
       * </pre>
       */
      public boolean hasUserNickName() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string UserNickName = 11;</code>
       *
       * <pre>
       * 微信用户昵称
       * </pre>
       */
      public java.lang.String getUserNickName() {
        java.lang.Object ref = userNickName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          userNickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string UserNickName = 11;</code>
       *
       * <pre>
       * 微信用户昵称
       * </pre>
       */
      public com.google.protobuf.ByteString
          getUserNickNameBytes() {
        java.lang.Object ref = userNickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userNickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string UserNickName = 11;</code>
       *
       * <pre>
       * 微信用户昵称
       * </pre>
       */
      public Builder setUserNickName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        userNickName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string UserNickName = 11;</code>
       *
       * <pre>
       * 微信用户昵称
       * </pre>
       */
      public Builder clearUserNickName() {
        bitField0_ = (bitField0_ & ~0x00000040);
        userNickName_ = getDefaultInstance().getUserNickName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string UserNickName = 11;</code>
       *
       * <pre>
       * 微信用户昵称
       * </pre>
       */
      public Builder setUserNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        userNickName_ = value;
        onChanged();
        return this;
      }

      // optional .MmBp.EmPlatformType PlatformType = 12;
      private MmBp.EmPlatformType platformType_ = MmBp.EmPlatformType.EPT_ios;
      /**
       * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
       *
       * <pre>
       * 手机平台
       * </pre>
       */
      public boolean hasPlatformType() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
       *
       * <pre>
       * 手机平台
       * </pre>
       */
      public MmBp.EmPlatformType getPlatformType() {
        return platformType_;
      }
      /**
       * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
       *
       * <pre>
       * 手机平台
       * </pre>
       */
      public Builder setPlatformType(MmBp.EmPlatformType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        platformType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .MmBp.EmPlatformType PlatformType = 12;</code>
       *
       * <pre>
       * 手机平台
       * </pre>
       */
      public Builder clearPlatformType() {
        bitField0_ = (bitField0_ & ~0x00000080);
        platformType_ = MmBp.EmPlatformType.EPT_ios;
        onChanged();
        return this;
      }

      // optional string Model = 13;
      private java.lang.Object model_ = "";
      /**
       * <code>optional string Model = 13;</code>
       *
       * <pre>
       * 手机硬件型号
       * </pre>
       */
      public boolean hasModel() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string Model = 13;</code>
       *
       * <pre>
       * 手机硬件型号
       * </pre>
       */
      public java.lang.String getModel() {
        java.lang.Object ref = model_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          model_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Model = 13;</code>
       *
       * <pre>
       * 手机硬件型号
       * </pre>
       */
      public com.google.protobuf.ByteString
          getModelBytes() {
        java.lang.Object ref = model_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          model_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Model = 13;</code>
       *
       * <pre>
       * 手机硬件型号
       * </pre>
       */
      public Builder setModel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        model_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Model = 13;</code>
       *
       * <pre>
       * 手机硬件型号
       * </pre>
       */
      public Builder clearModel() {
        bitField0_ = (bitField0_ & ~0x00000100);
        model_ = getDefaultInstance().getModel();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Model = 13;</code>
       *
       * <pre>
       * 手机硬件型号
       * </pre>
       */
      public Builder setModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        model_ = value;
        onChanged();
        return this;
      }

      // optional string Os = 14;
      private java.lang.Object os_ = "";
      /**
       * <code>optional string Os = 14;</code>
       *
       * <pre>
       * 手机 os 版本
       * </pre>
       */
      public boolean hasOs() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional string Os = 14;</code>
       *
       * <pre>
       * 手机 os 版本
       * </pre>
       */
      public java.lang.String getOs() {
        java.lang.Object ref = os_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          os_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Os = 14;</code>
       *
       * <pre>
       * 手机 os 版本
       * </pre>
       */
      public com.google.protobuf.ByteString
          getOsBytes() {
        java.lang.Object ref = os_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          os_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Os = 14;</code>
       *
       * <pre>
       * 手机 os 版本
       * </pre>
       */
      public Builder setOs(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        os_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Os = 14;</code>
       *
       * <pre>
       * 手机 os 版本
       * </pre>
       */
      public Builder clearOs() {
        bitField0_ = (bitField0_ & ~0x00000200);
        os_ = getDefaultInstance().getOs();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Os = 14;</code>
       *
       * <pre>
       * 手机 os 版本
       * </pre>
       */
      public Builder setOsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        os_ = value;
        onChanged();
        return this;
      }

      // optional int32 Time = 15;
      private int time_ ;
      /**
       * <code>optional int32 Time = 15;</code>
       *
       * <pre>
       * 手机当前时间
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      /**
       * <code>optional int32 Time = 15;</code>
       *
       * <pre>
       * 手机当前时间
       * </pre>
       */
      public int getTime() {
        return time_;
      }
      /**
       * <code>optional int32 Time = 15;</code>
       *
       * <pre>
       * 手机当前时间
       * </pre>
       */
      public Builder setTime(int value) {
        bitField0_ |= 0x00000400;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 Time = 15;</code>
       *
       * <pre>
       * 手机当前时间
       * </pre>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000400);
        time_ = 0;
        onChanged();
        return this;
      }

      // optional int32 TimeZone = 16;
      private int timeZone_ ;
      /**
       * <code>optional int32 TimeZone = 16;</code>
       *
       * <pre>
       * 手机当前时区
       * </pre>
       */
      public boolean hasTimeZone() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      /**
       * <code>optional int32 TimeZone = 16;</code>
       *
       * <pre>
       * 手机当前时区
       * </pre>
       */
      public int getTimeZone() {
        return timeZone_;
      }
      /**
       * <code>optional int32 TimeZone = 16;</code>
       *
       * <pre>
       * 手机当前时区
       * </pre>
       */
      public Builder setTimeZone(int value) {
        bitField0_ |= 0x00000800;
        timeZone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 TimeZone = 16;</code>
       *
       * <pre>
       * 手机当前时区
       * </pre>
       */
      public Builder clearTimeZone() {
        bitField0_ = (bitField0_ & ~0x00000800);
        timeZone_ = 0;
        onChanged();
        return this;
      }

      // optional string TimeString = 17;
      private java.lang.Object timeString_ = "";
      /**
       * <code>optional string TimeString = 17;</code>
       *
       * <pre>
       * 手机当前时间，格式如 201402281005285，具体字段
       * </pre>
       */
      public boolean hasTimeString() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      /**
       * <code>optional string TimeString = 17;</code>
       *
       * <pre>
       * 手机当前时间，格式如 201402281005285，具体字段
       * </pre>
       */
      public java.lang.String getTimeString() {
        java.lang.Object ref = timeString_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          timeString_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string TimeString = 17;</code>
       *
       * <pre>
       * 手机当前时间，格式如 201402281005285，具体字段
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTimeStringBytes() {
        java.lang.Object ref = timeString_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timeString_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string TimeString = 17;</code>
       *
       * <pre>
       * 手机当前时间，格式如 201402281005285，具体字段
       * </pre>
       */
      public Builder setTimeString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        timeString_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string TimeString = 17;</code>
       *
       * <pre>
       * 手机当前时间，格式如 201402281005285，具体字段
       * </pre>
       */
      public Builder clearTimeString() {
        bitField0_ = (bitField0_ & ~0x00001000);
        timeString_ = getDefaultInstance().getTimeString();
        onChanged();
        return this;
      }
      /**
       * <code>optional string TimeString = 17;</code>
       *
       * <pre>
       * 手机当前时间，格式如 201402281005285，具体字段
       * </pre>
       */
      public Builder setTimeStringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00001000;
        timeString_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.InitResponse)
    }

    static {
      defaultInstance = new InitResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.InitResponse)
  }

  public interface SendDataRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BaseRequest BaseRequest = 1;
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    boolean hasBaseRequest();
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    MmBp.BaseRequest getBaseRequest();
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder();

    // required bytes Data = 2;
    /**
     * <code>required bytes Data = 2;</code>
     */
    boolean hasData();
    /**
     * <code>required bytes Data = 2;</code>
     */
    com.google.protobuf.ByteString getData();

    // optional .MmBp.EmDeviceDataType Type = 3;
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    boolean hasType();
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    MmBp.EmDeviceDataType getType();
  }
  /**
   * Protobuf type {@code MmBp.SendDataRequest}
   */
  public static final class SendDataRequest extends
      com.google.protobuf.GeneratedMessage
      implements SendDataRequestOrBuilder {
    // Use SendDataRequest.newBuilder() to construct.
    private SendDataRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SendDataRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SendDataRequest defaultInstance;
    public static SendDataRequest getDefaultInstance() {
      return defaultInstance;
    }

    public SendDataRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SendDataRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BaseRequest.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseRequest_.toBuilder();
              }
              baseRequest_ = input.readMessage(MmBp.BaseRequest.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseRequest_);
                baseRequest_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              data_ = input.readBytes();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              MmBp.EmDeviceDataType value = MmBp.EmDeviceDataType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_SendDataRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_SendDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.SendDataRequest.class, MmBp.SendDataRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<SendDataRequest> PARSER =
        new com.google.protobuf.AbstractParser<SendDataRequest>() {
      public SendDataRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendDataRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SendDataRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BaseRequest BaseRequest = 1;
    public static final int BASEREQUEST_FIELD_NUMBER = 1;
    private MmBp.BaseRequest baseRequest_;
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public boolean hasBaseRequest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public MmBp.BaseRequest getBaseRequest() {
      return baseRequest_;
    }
    /**
     * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
     */
    public MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder() {
      return baseRequest_;
    }

    // required bytes Data = 2;
    public static final int DATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>required bytes Data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bytes Data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    // optional .MmBp.EmDeviceDataType Type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MmBp.EmDeviceDataType type_;
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    public MmBp.EmDeviceDataType getType() {
      return type_;
    }

    private void initFields() {
      baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
      data_ = com.google.protobuf.ByteString.EMPTY;
      type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseRequest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.SendDataRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SendDataRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SendDataRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SendDataRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SendDataRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SendDataRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.SendDataRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.SendDataRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.SendDataRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SendDataRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.SendDataRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.SendDataRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.SendDataRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_SendDataRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_SendDataRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.SendDataRequest.class, MmBp.SendDataRequest.Builder.class);
      }

      // Construct using MmBp.SendDataRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseRequestFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseRequestBuilder_ == null) {
          baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_SendDataRequest_descriptor;
      }

      public MmBp.SendDataRequest getDefaultInstanceForType() {
        return MmBp.SendDataRequest.getDefaultInstance();
      }

      public MmBp.SendDataRequest build() {
        MmBp.SendDataRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.SendDataRequest buildPartial() {
        MmBp.SendDataRequest result = new MmBp.SendDataRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseRequestBuilder_ == null) {
          result.baseRequest_ = baseRequest_;
        } else {
          result.baseRequest_ = baseRequestBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.SendDataRequest) {
          return mergeFrom((MmBp.SendDataRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.SendDataRequest other) {
        if (other == MmBp.SendDataRequest.getDefaultInstance()) return this;
        if (other.hasBaseRequest()) {
          mergeBaseRequest(other.getBaseRequest());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseRequest()) {

          return false;
        }
        if (!hasData()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.SendDataRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.SendDataRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BaseRequest BaseRequest = 1;
      private MmBp.BaseRequest baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder> baseRequestBuilder_;
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public boolean hasBaseRequest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequest getBaseRequest() {
        if (baseRequestBuilder_ == null) {
          return baseRequest_;
        } else {
          return baseRequestBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(MmBp.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseRequest_ = value;
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(
          MmBp.BaseRequest.Builder builderForValue) {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = builderForValue.build();
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder mergeBaseRequest(MmBp.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseRequest_ != MmBp.BaseRequest.getDefaultInstance()) {
            baseRequest_ =
              MmBp.BaseRequest.newBuilder(baseRequest_).mergeFrom(value).buildPartial();
          } else {
            baseRequest_ = value;
          }
          onChanged();
        } else {
          baseRequestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public Builder clearBaseRequest() {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = MmBp.BaseRequest.getDefaultInstance();
          onChanged();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequest.Builder getBaseRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      public MmBp.BaseRequestOrBuilder getBaseRequestOrBuilder() {
        if (baseRequestBuilder_ != null) {
          return baseRequestBuilder_.getMessageOrBuilder();
        } else {
          return baseRequest_;
        }
      }
      /**
       * <code>required .MmBp.BaseRequest BaseRequest = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder>
          getBaseRequestFieldBuilder() {
        if (baseRequestBuilder_ == null) {
          baseRequestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BaseRequest, MmBp.BaseRequest.Builder, MmBp.BaseRequestOrBuilder>(
                  baseRequest_,
                  getParentForChildren(),
                  isClean());
          baseRequest_ = null;
        }
        return baseRequestBuilder_;
      }

      // required bytes Data = 2;
      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes Data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bytes Data = 2;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>required bytes Data = 2;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes Data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      // optional .MmBp.EmDeviceDataType Type = 3;
      private MmBp.EmDeviceDataType type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public MmBp.EmDeviceDataType getType() {
        return type_;
      }
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public Builder setType(MmBp.EmDeviceDataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.SendDataRequest)
    }

    static {
      defaultInstance = new SendDataRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.SendDataRequest)
  }

  public interface SendDataResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BaseResponse BaseResponse = 1;
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    boolean hasBaseResponse();
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    MmBp.BaseResponse getBaseResponse();
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder();

    // optional bytes Data = 2;
    /**
     * <code>optional bytes Data = 2;</code>
     */
    boolean hasData();
    /**
     * <code>optional bytes Data = 2;</code>
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * Protobuf type {@code MmBp.SendDataResponse}
   */
  public static final class SendDataResponse extends
      com.google.protobuf.GeneratedMessage
      implements SendDataResponseOrBuilder {
    // Use SendDataResponse.newBuilder() to construct.
    private SendDataResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SendDataResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SendDataResponse defaultInstance;
    public static SendDataResponse getDefaultInstance() {
      return defaultInstance;
    }

    public SendDataResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SendDataResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BaseResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseResponse_.toBuilder();
              }
              baseResponse_ = input.readMessage(MmBp.BaseResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseResponse_);
                baseResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              data_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_SendDataResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_SendDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.SendDataResponse.class, MmBp.SendDataResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<SendDataResponse> PARSER =
        new com.google.protobuf.AbstractParser<SendDataResponse>() {
      public SendDataResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendDataResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SendDataResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BaseResponse BaseResponse = 1;
    public static final int BASERESPONSE_FIELD_NUMBER = 1;
    private MmBp.BaseResponse baseResponse_;
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public MmBp.BaseResponse getBaseResponse() {
      return baseResponse_;
    }
    /**
     * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
     */
    public MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder() {
      return baseResponse_;
    }

    // optional bytes Data = 2;
    public static final int DATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>optional bytes Data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes Data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private void initFields() {
      baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
      data_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBaseResponse().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, data_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, data_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.SendDataResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SendDataResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SendDataResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SendDataResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SendDataResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SendDataResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.SendDataResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.SendDataResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.SendDataResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SendDataResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.SendDataResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.SendDataResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.SendDataResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_SendDataResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_SendDataResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.SendDataResponse.class, MmBp.SendDataResponse.Builder.class);
      }

      // Construct using MmBp.SendDataResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseResponseBuilder_ == null) {
          baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_SendDataResponse_descriptor;
      }

      public MmBp.SendDataResponse getDefaultInstanceForType() {
        return MmBp.SendDataResponse.getDefaultInstance();
      }

      public MmBp.SendDataResponse build() {
        MmBp.SendDataResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.SendDataResponse buildPartial() {
        MmBp.SendDataResponse result = new MmBp.SendDataResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.SendDataResponse) {
          return mergeFrom((MmBp.SendDataResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.SendDataResponse other) {
        if (other == MmBp.SendDataResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseResponse()) {

          return false;
        }
        if (!getBaseResponse().isInitialized()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.SendDataResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.SendDataResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BaseResponse BaseResponse = 1;
      private MmBp.BaseResponse baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder> baseResponseBuilder_;
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public boolean hasBaseResponse() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponse getBaseResponse() {
        if (baseResponseBuilder_ == null) {
          return baseResponse_;
        } else {
          return baseResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(MmBp.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseResponse_ = value;
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(
          MmBp.BaseResponse.Builder builderForValue) {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = builderForValue.build();
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder mergeBaseResponse(MmBp.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseResponse_ != MmBp.BaseResponse.getDefaultInstance()) {
            baseResponse_ =
              MmBp.BaseResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
          } else {
            baseResponse_ = value;
          }
          onChanged();
        } else {
          baseResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public Builder clearBaseResponse() {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = MmBp.BaseResponse.getDefaultInstance();
          onChanged();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponse.Builder getBaseResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      public MmBp.BaseResponseOrBuilder getBaseResponseOrBuilder() {
        if (baseResponseBuilder_ != null) {
          return baseResponseBuilder_.getMessageOrBuilder();
        } else {
          return baseResponse_;
        }
      }
      /**
       * <code>required .MmBp.BaseResponse BaseResponse = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder>
          getBaseResponseFieldBuilder() {
        if (baseResponseBuilder_ == null) {
          baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BaseResponse, MmBp.BaseResponse.Builder, MmBp.BaseResponseOrBuilder>(
                  baseResponse_,
                  getParentForChildren(),
                  isClean());
          baseResponse_ = null;
        }
        return baseResponseBuilder_;
      }

      // optional bytes Data = 2;
      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes Data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes Data = 2;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>optional bytes Data = 2;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes Data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.SendDataResponse)
    }

    static {
      defaultInstance = new SendDataResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.SendDataResponse)
  }

  public interface RecvDataPushOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BasePush BasePush = 1;
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    boolean hasBasePush();
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    MmBp.BasePush getBasePush();
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    MmBp.BasePushOrBuilder getBasePushOrBuilder();

    // required bytes Data = 2;
    /**
     * <code>required bytes Data = 2;</code>
     */
    boolean hasData();
    /**
     * <code>required bytes Data = 2;</code>
     */
    com.google.protobuf.ByteString getData();

    // optional .MmBp.EmDeviceDataType Type = 3;
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    boolean hasType();
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    MmBp.EmDeviceDataType getType();
  }
  /**
   * Protobuf type {@code MmBp.RecvDataPush}
   *
   * <pre>
   * push ===================================================
   * 微信或厂商发送数据给蓝牙设备 ---------------------------
   * </pre>
   */
  public static final class RecvDataPush extends
      com.google.protobuf.GeneratedMessage
      implements RecvDataPushOrBuilder {
    // Use RecvDataPush.newBuilder() to construct.
    private RecvDataPush(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RecvDataPush(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RecvDataPush defaultInstance;
    public static RecvDataPush getDefaultInstance() {
      return defaultInstance;
    }

    public RecvDataPush getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RecvDataPush(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BasePush.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = basePush_.toBuilder();
              }
              basePush_ = input.readMessage(MmBp.BasePush.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(basePush_);
                basePush_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              data_ = input.readBytes();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              MmBp.EmDeviceDataType value = MmBp.EmDeviceDataType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_RecvDataPush_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_RecvDataPush_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.RecvDataPush.class, MmBp.RecvDataPush.Builder.class);
    }

    public static com.google.protobuf.Parser<RecvDataPush> PARSER =
        new com.google.protobuf.AbstractParser<RecvDataPush>() {
      public RecvDataPush parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RecvDataPush(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RecvDataPush> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BasePush BasePush = 1;
    public static final int BASEPUSH_FIELD_NUMBER = 1;
    private MmBp.BasePush basePush_;
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public boolean hasBasePush() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public MmBp.BasePush getBasePush() {
      return basePush_;
    }
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public MmBp.BasePushOrBuilder getBasePushOrBuilder() {
      return basePush_;
    }

    // required bytes Data = 2;
    public static final int DATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>required bytes Data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bytes Data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    // optional .MmBp.EmDeviceDataType Type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MmBp.EmDeviceDataType type_;
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
     *
     * <pre>
     * 数据类型(如厂商自定义数据，或公众平台规定的手
     * </pre>
     */
    public MmBp.EmDeviceDataType getType() {
      return type_;
    }

    private void initFields() {
      basePush_ = MmBp.BasePush.getDefaultInstance();
      data_ = com.google.protobuf.ByteString.EMPTY;
      type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBasePush()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, basePush_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, basePush_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.RecvDataPush parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.RecvDataPush parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.RecvDataPush parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.RecvDataPush parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.RecvDataPush parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.RecvDataPush parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.RecvDataPush parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.RecvDataPush parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.RecvDataPush parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.RecvDataPush parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.RecvDataPush prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.RecvDataPush}
     *
     * <pre>
     * push ===================================================
     * 微信或厂商发送数据给蓝牙设备 ---------------------------
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.RecvDataPushOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_RecvDataPush_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_RecvDataPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.RecvDataPush.class, MmBp.RecvDataPush.Builder.class);
      }

      // Construct using MmBp.RecvDataPush.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBasePushFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (basePushBuilder_ == null) {
          basePush_ = MmBp.BasePush.getDefaultInstance();
        } else {
          basePushBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_RecvDataPush_descriptor;
      }

      public MmBp.RecvDataPush getDefaultInstanceForType() {
        return MmBp.RecvDataPush.getDefaultInstance();
      }

      public MmBp.RecvDataPush build() {
        MmBp.RecvDataPush result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.RecvDataPush buildPartial() {
        MmBp.RecvDataPush result = new MmBp.RecvDataPush(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (basePushBuilder_ == null) {
          result.basePush_ = basePush_;
        } else {
          result.basePush_ = basePushBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.RecvDataPush) {
          return mergeFrom((MmBp.RecvDataPush)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.RecvDataPush other) {
        if (other == MmBp.RecvDataPush.getDefaultInstance()) return this;
        if (other.hasBasePush()) {
          mergeBasePush(other.getBasePush());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBasePush()) {

          return false;
        }
        if (!hasData()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.RecvDataPush parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.RecvDataPush) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BasePush BasePush = 1;
      private MmBp.BasePush basePush_ = MmBp.BasePush.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder> basePushBuilder_;
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public boolean hasBasePush() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePush getBasePush() {
        if (basePushBuilder_ == null) {
          return basePush_;
        } else {
          return basePushBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder setBasePush(MmBp.BasePush value) {
        if (basePushBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          basePush_ = value;
          onChanged();
        } else {
          basePushBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder setBasePush(
          MmBp.BasePush.Builder builderForValue) {
        if (basePushBuilder_ == null) {
          basePush_ = builderForValue.build();
          onChanged();
        } else {
          basePushBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder mergeBasePush(MmBp.BasePush value) {
        if (basePushBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              basePush_ != MmBp.BasePush.getDefaultInstance()) {
            basePush_ =
              MmBp.BasePush.newBuilder(basePush_).mergeFrom(value).buildPartial();
          } else {
            basePush_ = value;
          }
          onChanged();
        } else {
          basePushBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder clearBasePush() {
        if (basePushBuilder_ == null) {
          basePush_ = MmBp.BasePush.getDefaultInstance();
          onChanged();
        } else {
          basePushBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePush.Builder getBasePushBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBasePushFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePushOrBuilder getBasePushOrBuilder() {
        if (basePushBuilder_ != null) {
          return basePushBuilder_.getMessageOrBuilder();
        } else {
          return basePush_;
        }
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder>
          getBasePushFieldBuilder() {
        if (basePushBuilder_ == null) {
          basePushBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder>(
                  basePush_,
                  getParentForChildren(),
                  isClean());
          basePush_ = null;
        }
        return basePushBuilder_;
      }

      // required bytes Data = 2;
      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes Data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bytes Data = 2;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>required bytes Data = 2;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes Data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      // optional .MmBp.EmDeviceDataType Type = 3;
      private MmBp.EmDeviceDataType type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public MmBp.EmDeviceDataType getType() {
        return type_;
      }
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public Builder setType(MmBp.EmDeviceDataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .MmBp.EmDeviceDataType Type = 3;</code>
       *
       * <pre>
       * 数据类型(如厂商自定义数据，或公众平台规定的手
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = MmBp.EmDeviceDataType.EDDT_manufatureSvr;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.RecvDataPush)
    }

    static {
      defaultInstance = new RecvDataPush(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.RecvDataPush)
  }

  public interface SwitchViewPushOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BasePush BasePush = 1;
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    boolean hasBasePush();
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    MmBp.BasePush getBasePush();
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    MmBp.BasePushOrBuilder getBasePushOrBuilder();

    // required .MmBp.EmSwitchViewOp SwitchViewOp = 2;
    /**
     * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
     *
     * <pre>
     * 进入或者退出 View
     * </pre>
     */
    boolean hasSwitchViewOp();
    /**
     * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
     *
     * <pre>
     * 进入或者退出 View
     * </pre>
     */
    MmBp.EmSwitchViewOp getSwitchViewOp();

    // required .MmBp.EmViewId ViewId = 3;
    /**
     * <code>required .MmBp.EmViewId ViewId = 3;</code>
     *
     * <pre>
     * view 的 id
     * </pre>
     */
    boolean hasViewId();
    /**
     * <code>required .MmBp.EmViewId ViewId = 3;</code>
     *
     * <pre>
     * view 的 id
     * </pre>
     */
    MmBp.EmViewId getViewId();
  }
  /**
   * Protobuf type {@code MmBp.SwitchViewPush}
   */
  public static final class SwitchViewPush extends
      com.google.protobuf.GeneratedMessage
      implements SwitchViewPushOrBuilder {
    // Use SwitchViewPush.newBuilder() to construct.
    private SwitchViewPush(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SwitchViewPush(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SwitchViewPush defaultInstance;
    public static SwitchViewPush getDefaultInstance() {
      return defaultInstance;
    }

    public SwitchViewPush getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SwitchViewPush(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BasePush.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = basePush_.toBuilder();
              }
              basePush_ = input.readMessage(MmBp.BasePush.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(basePush_);
                basePush_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              MmBp.EmSwitchViewOp value = MmBp.EmSwitchViewOp.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                switchViewOp_ = value;
              }
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              MmBp.EmViewId value = MmBp.EmViewId.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                viewId_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_SwitchViewPush_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_SwitchViewPush_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.SwitchViewPush.class, MmBp.SwitchViewPush.Builder.class);
    }

    public static com.google.protobuf.Parser<SwitchViewPush> PARSER =
        new com.google.protobuf.AbstractParser<SwitchViewPush>() {
      public SwitchViewPush parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SwitchViewPush(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SwitchViewPush> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BasePush BasePush = 1;
    public static final int BASEPUSH_FIELD_NUMBER = 1;
    private MmBp.BasePush basePush_;
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public boolean hasBasePush() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public MmBp.BasePush getBasePush() {
      return basePush_;
    }
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public MmBp.BasePushOrBuilder getBasePushOrBuilder() {
      return basePush_;
    }

    // required .MmBp.EmSwitchViewOp SwitchViewOp = 2;
    public static final int SWITCHVIEWOP_FIELD_NUMBER = 2;
    private MmBp.EmSwitchViewOp switchViewOp_;
    /**
     * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
     *
     * <pre>
     * 进入或者退出 View
     * </pre>
     */
    public boolean hasSwitchViewOp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
     *
     * <pre>
     * 进入或者退出 View
     * </pre>
     */
    public MmBp.EmSwitchViewOp getSwitchViewOp() {
      return switchViewOp_;
    }

    // required .MmBp.EmViewId ViewId = 3;
    public static final int VIEWID_FIELD_NUMBER = 3;
    private MmBp.EmViewId viewId_;
    /**
     * <code>required .MmBp.EmViewId ViewId = 3;</code>
     *
     * <pre>
     * view 的 id
     * </pre>
     */
    public boolean hasViewId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .MmBp.EmViewId ViewId = 3;</code>
     *
     * <pre>
     * view 的 id
     * </pre>
     */
    public MmBp.EmViewId getViewId() {
      return viewId_;
    }

    private void initFields() {
      basePush_ = MmBp.BasePush.getDefaultInstance();
      switchViewOp_ = MmBp.EmSwitchViewOp.ESVO_enter;
      viewId_ = MmBp.EmViewId.EVI_deviceChatView;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBasePush()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSwitchViewOp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasViewId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, basePush_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, switchViewOp_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, viewId_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, basePush_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, switchViewOp_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, viewId_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.SwitchViewPush parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SwitchViewPush parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SwitchViewPush parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SwitchViewPush parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SwitchViewPush parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SwitchViewPush parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.SwitchViewPush parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.SwitchViewPush parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.SwitchViewPush parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SwitchViewPush parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.SwitchViewPush prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.SwitchViewPush}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.SwitchViewPushOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_SwitchViewPush_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_SwitchViewPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.SwitchViewPush.class, MmBp.SwitchViewPush.Builder.class);
      }

      // Construct using MmBp.SwitchViewPush.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBasePushFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (basePushBuilder_ == null) {
          basePush_ = MmBp.BasePush.getDefaultInstance();
        } else {
          basePushBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        switchViewOp_ = MmBp.EmSwitchViewOp.ESVO_enter;
        bitField0_ = (bitField0_ & ~0x00000002);
        viewId_ = MmBp.EmViewId.EVI_deviceChatView;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_SwitchViewPush_descriptor;
      }

      public MmBp.SwitchViewPush getDefaultInstanceForType() {
        return MmBp.SwitchViewPush.getDefaultInstance();
      }

      public MmBp.SwitchViewPush build() {
        MmBp.SwitchViewPush result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.SwitchViewPush buildPartial() {
        MmBp.SwitchViewPush result = new MmBp.SwitchViewPush(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (basePushBuilder_ == null) {
          result.basePush_ = basePush_;
        } else {
          result.basePush_ = basePushBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.switchViewOp_ = switchViewOp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.viewId_ = viewId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.SwitchViewPush) {
          return mergeFrom((MmBp.SwitchViewPush)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.SwitchViewPush other) {
        if (other == MmBp.SwitchViewPush.getDefaultInstance()) return this;
        if (other.hasBasePush()) {
          mergeBasePush(other.getBasePush());
        }
        if (other.hasSwitchViewOp()) {
          setSwitchViewOp(other.getSwitchViewOp());
        }
        if (other.hasViewId()) {
          setViewId(other.getViewId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBasePush()) {

          return false;
        }
        if (!hasSwitchViewOp()) {

          return false;
        }
        if (!hasViewId()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.SwitchViewPush parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.SwitchViewPush) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BasePush BasePush = 1;
      private MmBp.BasePush basePush_ = MmBp.BasePush.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder> basePushBuilder_;
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public boolean hasBasePush() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePush getBasePush() {
        if (basePushBuilder_ == null) {
          return basePush_;
        } else {
          return basePushBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder setBasePush(MmBp.BasePush value) {
        if (basePushBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          basePush_ = value;
          onChanged();
        } else {
          basePushBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder setBasePush(
          MmBp.BasePush.Builder builderForValue) {
        if (basePushBuilder_ == null) {
          basePush_ = builderForValue.build();
          onChanged();
        } else {
          basePushBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder mergeBasePush(MmBp.BasePush value) {
        if (basePushBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              basePush_ != MmBp.BasePush.getDefaultInstance()) {
            basePush_ =
              MmBp.BasePush.newBuilder(basePush_).mergeFrom(value).buildPartial();
          } else {
            basePush_ = value;
          }
          onChanged();
        } else {
          basePushBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder clearBasePush() {
        if (basePushBuilder_ == null) {
          basePush_ = MmBp.BasePush.getDefaultInstance();
          onChanged();
        } else {
          basePushBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePush.Builder getBasePushBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBasePushFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePushOrBuilder getBasePushOrBuilder() {
        if (basePushBuilder_ != null) {
          return basePushBuilder_.getMessageOrBuilder();
        } else {
          return basePush_;
        }
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder>
          getBasePushFieldBuilder() {
        if (basePushBuilder_ == null) {
          basePushBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder>(
                  basePush_,
                  getParentForChildren(),
                  isClean());
          basePush_ = null;
        }
        return basePushBuilder_;
      }

      // required .MmBp.EmSwitchViewOp SwitchViewOp = 2;
      private MmBp.EmSwitchViewOp switchViewOp_ = MmBp.EmSwitchViewOp.ESVO_enter;
      /**
       * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
       *
       * <pre>
       * 进入或者退出 View
       * </pre>
       */
      public boolean hasSwitchViewOp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
       *
       * <pre>
       * 进入或者退出 View
       * </pre>
       */
      public MmBp.EmSwitchViewOp getSwitchViewOp() {
        return switchViewOp_;
      }
      /**
       * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
       *
       * <pre>
       * 进入或者退出 View
       * </pre>
       */
      public Builder setSwitchViewOp(MmBp.EmSwitchViewOp value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        switchViewOp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .MmBp.EmSwitchViewOp SwitchViewOp = 2;</code>
       *
       * <pre>
       * 进入或者退出 View
       * </pre>
       */
      public Builder clearSwitchViewOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        switchViewOp_ = MmBp.EmSwitchViewOp.ESVO_enter;
        onChanged();
        return this;
      }

      // required .MmBp.EmViewId ViewId = 3;
      private MmBp.EmViewId viewId_ = MmBp.EmViewId.EVI_deviceChatView;
      /**
       * <code>required .MmBp.EmViewId ViewId = 3;</code>
       *
       * <pre>
       * view 的 id
       * </pre>
       */
      public boolean hasViewId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .MmBp.EmViewId ViewId = 3;</code>
       *
       * <pre>
       * view 的 id
       * </pre>
       */
      public MmBp.EmViewId getViewId() {
        return viewId_;
      }
      /**
       * <code>required .MmBp.EmViewId ViewId = 3;</code>
       *
       * <pre>
       * view 的 id
       * </pre>
       */
      public Builder setViewId(MmBp.EmViewId value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        viewId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .MmBp.EmViewId ViewId = 3;</code>
       *
       * <pre>
       * view 的 id
       * </pre>
       */
      public Builder clearViewId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        viewId_ = MmBp.EmViewId.EVI_deviceChatView;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.SwitchViewPush)
    }

    static {
      defaultInstance = new SwitchViewPush(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.SwitchViewPush)
  }

  public interface SwitchBackgroudPushOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .MmBp.BasePush BasePush = 1;
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    boolean hasBasePush();
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    MmBp.BasePush getBasePush();
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    MmBp.BasePushOrBuilder getBasePushOrBuilder();

    // required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;
    /**
     * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
     */
    boolean hasSwitchBackgroundOp();
    /**
     * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
     */
    MmBp.EmSwitchBackgroundOp getSwitchBackgroundOp();
  }
  /**
   * Protobuf type {@code MmBp.SwitchBackgroudPush}
   *
   * <pre>
   * 微信客户端进入退出后台的通知 ------------------------------
   * </pre>
   */
  public static final class SwitchBackgroudPush extends
      com.google.protobuf.GeneratedMessage
      implements SwitchBackgroudPushOrBuilder {
    // Use SwitchBackgroudPush.newBuilder() to construct.
    private SwitchBackgroudPush(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SwitchBackgroudPush(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SwitchBackgroudPush defaultInstance;
    public static SwitchBackgroudPush getDefaultInstance() {
      return defaultInstance;
    }

    public SwitchBackgroudPush getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SwitchBackgroudPush(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              MmBp.BasePush.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = basePush_.toBuilder();
              }
              basePush_ = input.readMessage(MmBp.BasePush.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(basePush_);
                basePush_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              MmBp.EmSwitchBackgroundOp value = MmBp.EmSwitchBackgroundOp.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                switchBackgroundOp_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MmBp.internal_static_MmBp_SwitchBackgroudPush_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MmBp.internal_static_MmBp_SwitchBackgroudPush_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MmBp.SwitchBackgroudPush.class, MmBp.SwitchBackgroudPush.Builder.class);
    }

    public static com.google.protobuf.Parser<SwitchBackgroudPush> PARSER =
        new com.google.protobuf.AbstractParser<SwitchBackgroudPush>() {
      public SwitchBackgroudPush parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SwitchBackgroudPush(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SwitchBackgroudPush> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .MmBp.BasePush BasePush = 1;
    public static final int BASEPUSH_FIELD_NUMBER = 1;
    private MmBp.BasePush basePush_;
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public boolean hasBasePush() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public MmBp.BasePush getBasePush() {
      return basePush_;
    }
    /**
     * <code>required .MmBp.BasePush BasePush = 1;</code>
     */
    public MmBp.BasePushOrBuilder getBasePushOrBuilder() {
      return basePush_;
    }

    // required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;
    public static final int SWITCHBACKGROUNDOP_FIELD_NUMBER = 2;
    private MmBp.EmSwitchBackgroundOp switchBackgroundOp_;
    /**
     * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
     */
    public boolean hasSwitchBackgroundOp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
     */
    public MmBp.EmSwitchBackgroundOp getSwitchBackgroundOp() {
      return switchBackgroundOp_;
    }

    private void initFields() {
      basePush_ = MmBp.BasePush.getDefaultInstance();
      switchBackgroundOp_ = MmBp.EmSwitchBackgroundOp.ESBO_enterBackground;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBasePush()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSwitchBackgroundOp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, basePush_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, switchBackgroundOp_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, basePush_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, switchBackgroundOp_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MmBp.SwitchBackgroudPush parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MmBp.SwitchBackgroudPush parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MmBp.SwitchBackgroudPush parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MmBp.SwitchBackgroudPush parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MmBp.SwitchBackgroudPush prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MmBp.SwitchBackgroudPush}
     *
     * <pre>
     * 微信客户端进入退出后台的通知 ------------------------------
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MmBp.SwitchBackgroudPushOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MmBp.internal_static_MmBp_SwitchBackgroudPush_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MmBp.internal_static_MmBp_SwitchBackgroudPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MmBp.SwitchBackgroudPush.class, MmBp.SwitchBackgroudPush.Builder.class);
      }

      // Construct using MmBp.SwitchBackgroudPush.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBasePushFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (basePushBuilder_ == null) {
          basePush_ = MmBp.BasePush.getDefaultInstance();
        } else {
          basePushBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        switchBackgroundOp_ = MmBp.EmSwitchBackgroundOp.ESBO_enterBackground;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MmBp.internal_static_MmBp_SwitchBackgroudPush_descriptor;
      }

      public MmBp.SwitchBackgroudPush getDefaultInstanceForType() {
        return MmBp.SwitchBackgroudPush.getDefaultInstance();
      }

      public MmBp.SwitchBackgroudPush build() {
        MmBp.SwitchBackgroudPush result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MmBp.SwitchBackgroudPush buildPartial() {
        MmBp.SwitchBackgroudPush result = new MmBp.SwitchBackgroudPush(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (basePushBuilder_ == null) {
          result.basePush_ = basePush_;
        } else {
          result.basePush_ = basePushBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.switchBackgroundOp_ = switchBackgroundOp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MmBp.SwitchBackgroudPush) {
          return mergeFrom((MmBp.SwitchBackgroudPush)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MmBp.SwitchBackgroudPush other) {
        if (other == MmBp.SwitchBackgroudPush.getDefaultInstance()) return this;
        if (other.hasBasePush()) {
          mergeBasePush(other.getBasePush());
        }
        if (other.hasSwitchBackgroundOp()) {
          setSwitchBackgroundOp(other.getSwitchBackgroundOp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBasePush()) {

          return false;
        }
        if (!hasSwitchBackgroundOp()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MmBp.SwitchBackgroudPush parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MmBp.SwitchBackgroudPush) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .MmBp.BasePush BasePush = 1;
      private MmBp.BasePush basePush_ = MmBp.BasePush.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder> basePushBuilder_;
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public boolean hasBasePush() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePush getBasePush() {
        if (basePushBuilder_ == null) {
          return basePush_;
        } else {
          return basePushBuilder_.getMessage();
        }
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder setBasePush(MmBp.BasePush value) {
        if (basePushBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          basePush_ = value;
          onChanged();
        } else {
          basePushBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder setBasePush(
          MmBp.BasePush.Builder builderForValue) {
        if (basePushBuilder_ == null) {
          basePush_ = builderForValue.build();
          onChanged();
        } else {
          basePushBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder mergeBasePush(MmBp.BasePush value) {
        if (basePushBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              basePush_ != MmBp.BasePush.getDefaultInstance()) {
            basePush_ =
              MmBp.BasePush.newBuilder(basePush_).mergeFrom(value).buildPartial();
          } else {
            basePush_ = value;
          }
          onChanged();
        } else {
          basePushBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public Builder clearBasePush() {
        if (basePushBuilder_ == null) {
          basePush_ = MmBp.BasePush.getDefaultInstance();
          onChanged();
        } else {
          basePushBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePush.Builder getBasePushBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBasePushFieldBuilder().getBuilder();
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      public MmBp.BasePushOrBuilder getBasePushOrBuilder() {
        if (basePushBuilder_ != null) {
          return basePushBuilder_.getMessageOrBuilder();
        } else {
          return basePush_;
        }
      }
      /**
       * <code>required .MmBp.BasePush BasePush = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder>
          getBasePushFieldBuilder() {
        if (basePushBuilder_ == null) {
          basePushBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MmBp.BasePush, MmBp.BasePush.Builder, MmBp.BasePushOrBuilder>(
                  basePush_,
                  getParentForChildren(),
                  isClean());
          basePush_ = null;
        }
        return basePushBuilder_;
      }

      // required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;
      private MmBp.EmSwitchBackgroundOp switchBackgroundOp_ = MmBp.EmSwitchBackgroundOp.ESBO_enterBackground;
      /**
       * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
       */
      public boolean hasSwitchBackgroundOp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
       */
      public MmBp.EmSwitchBackgroundOp getSwitchBackgroundOp() {
        return switchBackgroundOp_;
      }
      /**
       * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
       */
      public Builder setSwitchBackgroundOp(MmBp.EmSwitchBackgroundOp value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        switchBackgroundOp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .MmBp.EmSwitchBackgroundOp SwitchBackgroundOp = 2;</code>
       */
      public Builder clearSwitchBackgroundOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        switchBackgroundOp_ = MmBp.EmSwitchBackgroundOp.ESBO_enterBackground;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MmBp.SwitchBackgroudPush)
    }

    static {
      defaultInstance = new SwitchBackgroudPush(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MmBp.SwitchBackgroudPush)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_BaseRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_BaseRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_BaseResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_BaseResponse_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_BasePush_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_BasePush_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_AuthRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_AuthRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_AuthResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_AuthResponse_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_InitRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_InitRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_InitResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_InitResponse_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_SendDataRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_SendDataRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_SendDataResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_SendDataResponse_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_RecvDataPush_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_RecvDataPush_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_SwitchViewPush_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_SwitchViewPush_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MmBp_SwitchBackgroudPush_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MmBp_SwitchBackgroudPush_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nMmBp.proto\022\004MmBp\"\r\n\013BaseRequest\"/\n\014Bas" +
      "eResponse\022\017\n\007ErrCode\030\001 \002(\005\022\016\n\006ErrMsg\030\002 \001" +
      "(\t\"\n\n\010BasePush\"\205\002\n\013AuthRequest\022&\n\013BaseRe" +
      "quest\030\001 \002(\0132\021.MmBp.BaseRequest\022 \n\030Md5Dev" +
      "iceTypeAndDeviceId\030\002 \001(\014\022\024\n\014ProtoVersion" +
      "\030\003 \002(\005\022\021\n\tAuthProto\030\004 \002(\005\022&\n\nAuthMethod\030" +
      "\005 \002(\0162\022.MmBp.EmAuthMethod\022\017\n\007AesSign\030\006 \001" +
      "(\014\022\022\n\nMacAddress\030\007 \001(\014\022\020\n\010TimeZone\030\n \001(\t" +
      "\022\020\n\010Language\030\013 \001(\t\022\022\n\nDeviceName\030\014 \001(\t\"O" +
      "\n\014AuthResponse\022(\n\014BaseResponse\030\001 \002(\0132\022.M",
      "mBp.BaseResponse\022\025\n\rAesSessionKey\030\002 \002(\014\"" +
      "a\n\013InitRequest\022&\n\013BaseRequest\030\001 \002(\0132\021.Mm" +
      "Bp.BaseRequest\022\027\n\017RespFieldFilter\030\002 \001(\014\022" +
      "\021\n\tChallenge\030\003 \001(\014\"\325\002\n\014InitResponse\022(\n\014B" +
      "aseResponse\030\001 \002(\0132\022.MmBp.BaseResponse\022\022\n" +
      "\nUserIdHigh\030\002 \002(\r\022\021\n\tUserIdLow\030\003 \002(\r\022\030\n\020" +
      "ChalleangeAnswer\030\004 \001(\r\022&\n\nInitScence\030\005 \001" +
      "(\0162\022.MmBp.EmInitScence\022!\n\031AutoSyncMaxDur" +
      "ationSecond\030\006 \001(\r\022\024\n\014UserNickName\030\013 \001(\t\022" +
      "*\n\014PlatformType\030\014 \001(\0162\024.MmBp.EmPlatformT",
      "ype\022\r\n\005Model\030\r \001(\t\022\n\n\002Os\030\016 \001(\t\022\014\n\004Time\030\017" +
      " \001(\005\022\020\n\010TimeZone\030\020 \001(\005\022\022\n\nTimeString\030\021 \001" +
      "(\t\"m\n\017SendDataRequest\022&\n\013BaseRequest\030\001 \002" +
      "(\0132\021.MmBp.BaseRequest\022\014\n\004Data\030\002 \002(\014\022$\n\004T" +
      "ype\030\003 \001(\0162\026.MmBp.EmDeviceDataType\"J\n\020Sen" +
      "dDataResponse\022(\n\014BaseResponse\030\001 \002(\0132\022.Mm" +
      "Bp.BaseResponse\022\014\n\004Data\030\002 \001(\014\"d\n\014RecvDat" +
      "aPush\022 \n\010BasePush\030\001 \002(\0132\016.MmBp.BasePush\022" +
      "\014\n\004Data\030\002 \002(\014\022$\n\004Type\030\003 \001(\0162\026.MmBp.EmDev" +
      "iceDataType\"~\n\016SwitchViewPush\022 \n\010BasePus",
      "h\030\001 \002(\0132\016.MmBp.BasePush\022*\n\014SwitchViewOp\030" +
      "\002 \002(\0162\024.MmBp.EmSwitchViewOp\022\036\n\006ViewId\030\003 " +
      "\002(\0162\016.MmBp.EmViewId\"o\n\023SwitchBackgroudPu" +
      "sh\022 \n\010BasePush\030\001 \002(\0132\016.MmBp.BasePush\0226\n\022" +
      "SwitchBackgroundOp\030\002 \002(\0162\032.MmBp.EmSwitch" +
      "BackgroundOp*\201\002\n\007EmCmdId\022\014\n\010ECI_none\020\000\022\021" +
      "\n\014ECI_req_auth\020\221N\022\025\n\020ECI_req_sendData\020\222N" +
      "\022\021\n\014ECI_req_init\020\223N\022\023\n\rECI_resp_auth\020\241\234\001" +
      "\022\027\n\021ECI_resp_sendData\020\242\234\001\022\023\n\rECI_resp_in" +
      "it\020\243\234\001\022\027\n\021ECI_push_recvData\020\261\352\001\022\031\n\023ECI_p",
      "ush_switchView\020\262\352\001\022\036\n\030ECI_push_switchBac" +
      "kgroud\020\263\352\001\022\024\n\016ECI_err_decode\020\257\352\001*\354\002\n\013EmE" +
      "rrorCode\022\027\n\nEEC_system\020\377\377\377\377\377\377\377\377\377\001\022\031\n\014EEC" +
      "_needAuth\020\376\377\377\377\377\377\377\377\377\001\022\037\n\022EEC_sessionTimeo" +
      "ut\020\375\377\377\377\377\377\377\377\377\001\022\027\n\nEEC_decode\020\374\377\377\377\377\377\377\377\377\001\022\036" +
      "\n\021EEC_deviceIsBlock\020\373\377\377\377\377\377\377\377\377\001\022.\n!EEC_se" +
      "rviceUnAvalibleInBackground\020\372\377\377\377\377\377\377\377\377\001\022-" +
      "\n EEC_deviceProtoVersionNeedUpdate\020\371\377\377\377\377" +
      "\377\377\377\377\001\022,\n\037EEC_phoneProtoVersionNeedUpdate" +
      "\020\370\377\377\377\377\377\377\377\377\001\022\036\n\021EEC_maxReqInQueue\020\367\377\377\377\377\377\377",
      "\377\377\001\022\"\n\025EEC_userExitWxAccount\020\366\377\377\377\377\377\377\377\377\001*" +
      "1\n\014EmAuthMethod\022\013\n\007EAM_md5\020\001\022\024\n\020EAM_macN" +
      "oEncrypt\020\002*\240\001\n\025EmInitRespFieldFilter\022\026\n\022" +
      "EIRFF_userNickName\020\001\022\026\n\022EIRFF_platformTy" +
      "pe\020\002\022\017\n\013EIRFF_model\020\004\022\014\n\010EIRFF_os\020\010\022\016\n\nE" +
      "IRFF_time\020\020\022\022\n\016EIRFF_timeZone\020 \022\024\n\020EIRFF" +
      "_timeString\020@*4\n\014EmInitScence\022\022\n\016EIS_dev" +
      "iceChat\020\001\022\020\n\014EIS_autoSync\020\002*q\n\016EmPlatfor" +
      "mType\022\013\n\007EPT_ios\020\001\022\017\n\013EPT_andriod\020\002\022\n\n\006E" +
      "PT_wp\020\003\022\r\n\tEPT_s60v3\020\004\022\r\n\tEPT_s60v5\020\005\022\013\n",
      "\007EPT_s40\020\006\022\n\n\006EPT_bb\020\007*`\n\020EmDeviceDataTy" +
      "pe\022\026\n\022EDDT_manufatureSvr\020\000\022\024\n\020EDDT_wxWri" +
      "stBand\020\001\022\036\n\031EDDT_wxDeviceHtmlChatView\020\221N" +
      "*/\n\016EmSwitchViewOp\022\016\n\nESVO_enter\020\001\022\r\n\tES" +
      "VO_exit\020\002*>\n\010EmViewId\022\026\n\022EVI_deviceChatV" +
      "iew\020\001\022\032\n\026EVI_deviceChatHtmlView\020\002*Y\n\024EmS" +
      "witchBackgroundOp\022\030\n\024ESBO_enterBackgroun" +
      "d\020\001\022\027\n\023ESBO_enterForground\020\002\022\016\n\nESBO_sle" +
      "ep\020\003"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MmBp_BaseRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MmBp_BaseRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_BaseRequest_descriptor,
              new java.lang.String[] { });
          internal_static_MmBp_BaseResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_MmBp_BaseResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_BaseResponse_descriptor,
              new java.lang.String[] { "ErrCode", "ErrMsg", });
          internal_static_MmBp_BasePush_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_MmBp_BasePush_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_BasePush_descriptor,
              new java.lang.String[] { });
          internal_static_MmBp_AuthRequest_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_MmBp_AuthRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_AuthRequest_descriptor,
              new java.lang.String[] { "BaseRequest", "Md5DeviceTypeAndDeviceId", "ProtoVersion", "AuthProto", "AuthMethod", "AesSign", "MacAddress", "TimeZone", "Language", "DeviceName", });
          internal_static_MmBp_AuthResponse_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_MmBp_AuthResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_AuthResponse_descriptor,
              new java.lang.String[] { "BaseResponse", "AesSessionKey", });
          internal_static_MmBp_InitRequest_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_MmBp_InitRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_InitRequest_descriptor,
              new java.lang.String[] { "BaseRequest", "RespFieldFilter", "Challenge", });
          internal_static_MmBp_InitResponse_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_MmBp_InitResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_InitResponse_descriptor,
              new java.lang.String[] { "BaseResponse", "UserIdHigh", "UserIdLow", "ChalleangeAnswer", "InitScence", "AutoSyncMaxDurationSecond", "UserNickName", "PlatformType", "Model", "Os", "Time", "TimeZone", "TimeString", });
          internal_static_MmBp_SendDataRequest_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_MmBp_SendDataRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_SendDataRequest_descriptor,
              new java.lang.String[] { "BaseRequest", "Data", "Type", });
          internal_static_MmBp_SendDataResponse_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_MmBp_SendDataResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_SendDataResponse_descriptor,
              new java.lang.String[] { "BaseResponse", "Data", });
          internal_static_MmBp_RecvDataPush_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_MmBp_RecvDataPush_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_RecvDataPush_descriptor,
              new java.lang.String[] { "BasePush", "Data", "Type", });
          internal_static_MmBp_SwitchViewPush_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_MmBp_SwitchViewPush_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_SwitchViewPush_descriptor,
              new java.lang.String[] { "BasePush", "SwitchViewOp", "ViewId", });
          internal_static_MmBp_SwitchBackgroudPush_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_MmBp_SwitchBackgroudPush_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MmBp_SwitchBackgroudPush_descriptor,
              new java.lang.String[] { "BasePush", "SwitchBackgroundOp", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
}
