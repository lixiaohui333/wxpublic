package com.kxkj.wxpublic.conf;

public class ApiPath {


    private static final String WX_BASE_URL="https://api.weixin.qq.com/";

    public static final String WX_GETACCESS_TOKEN=WX_BASE_URL+"cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

    public static final String WX_SET_MEUN=WX_BASE_URL+"cgi-bin/menu/create?access_token=%s";


    public static final String WX_GET_USERINFO=WX_BASE_URL+"cgi-bin/user/info?access_token=%s&openid=%s&lang=zh_CN";
//    public static final String WX_GET_USERINFO=WX_BASE_URL+"connect/oauth2/authorize?appid=%s&redirect_uri=%s";


}
