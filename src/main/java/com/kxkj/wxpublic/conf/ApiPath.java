package com.kxkj.wxpublic.conf;

public class ApiPath {


    private static final String WX_BASE_URL="https://api.weixin.qq.com/";

    public static final String WX_GETACCESS_TOKEN=WX_BASE_URL+"cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

    public static final String WX_SET_MEUN=WX_BASE_URL+"cgi-bin/menu/create?access_token=%s";


}
