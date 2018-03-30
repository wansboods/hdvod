package com.bevixtech.hdvod.enums;

public enum ResultCodeEmum {
    operationSuccess("000","操作成功"),
    systemBusy("001","系统繁忙"),
    tokenQualified("002","token非法"),
    operationError("003","操作失败"),
    appIdIsNull("004", "appId空值"),
    appIdIsNotConf("005", "appId没有配置"),
    illegalApplyToken("006", "非法申请token"),
    failureToken("007", "token失效"),
    MayIngore("008", "数据异常,可忽略"),

    SystemError("-1","系统操作错误,请联系服务端人员"),
    DateError("-2","日期转换操作错误"),
    loginFail("100","未知错误原因"),
    loginPassWordIsNull("101","登陆密码空值"),
    loginUserISNull("102","登陆用户名空值"),
    loginUserNoExist("103","用户不存在"),
    loginUserInvalid("104","登录名已经无效"),
    loginPassWordError("105","密码错误"),
    UnLogin("106","用户未登陆"),
    loginAlready("114","账户已登陆"),
    loginerr("115","管理员账户不能使用"),
    loginError("111","登陆失败"),
    loginFailure("119","账号已失效，请联系管理员"),

    RegisterErr("120","注册失败"),
    MemberActive("117","有患者正在使用"),
    GuaHaoNumFull("118","挂号人数已满"),
    mobileOccupy("112","手机号已被占用"),
    GetValCodeMobileOccupy("106","手机号不存在"),
    EmployeeExist("107","用户不存在"),
    valCodeError("108"," 验证码错误"),
    passWordError("109","原始密码错误"),
    PictureSaveError("110","图片保存失败"),
    NewsExist("113","无公告消息"),
    NoAuthentication("199","未实名认证"),
    NoSalesDeliv("200",",没有待配送单"),
    StatusExist("300",",状态不存在"),
    ParamError("301",",非法参数"),
    ;


    private String code = "";
    private String name = "";
    private String desc = "";

    private ResultCodeEmum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
