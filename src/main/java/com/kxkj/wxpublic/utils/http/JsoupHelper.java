package com.kxkj.wxpublic.utils.http;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsoupHelper {


    /**
     * 获取连接
     *
     * @param url     请求url
     * @param params  参数
     * @param headers 头部信息
     * @return
     */
    public static Connection getConnection(String url, Map<String, String> params,
                                           Map<String, String> headers) {
        if (params != null) {
            List<NameValuePair> paramList = new ArrayList<NameValuePair>();
            Iterator<Map.Entry<String, String>> iter = params.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                String key = entry.getKey();
                String value = entry.getValue();
                paramList.add(new BasicNameValuePair(key, value));
            }
            try {
                String paramStr = EntityUtils.toString(new UrlEncodedFormEntity(paramList, "UTF-8"));
                StringBuffer sb = new StringBuffer();
                sb.append(url);
                if (url.indexOf("?") > 0) {
                    sb.append("&");
                } else {
                    sb.append("?");
                }
                sb.append(paramStr);
                url = sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



        return getConn(url, headers);
    }

    private static String dohttp(String url, Map<String, String> params,
                                 Map<String, String> headers, Connection.Method method) {

        System.out.println(url);
        String result = "";
        try {
            Connection conn = getConnection(url, params, headers);
            Connection.Response response = conn.method(method).execute();
            result = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static String post(String url, Map<String, String> params,
                              Map<String, String> headers) {

        return dohttp(url, params, headers, Connection.Method.POST);

    }

    public static String get(String url, Map<String, String> params,
                             Map<String, String> headers) {

        return dohttp(url, params, headers, Connection.Method.GET);

    }



    public static String post(String url, String body,
                              Map<String, String> headers) {


        Connection conn=getConn(url, headers);

        conn.method(Connection.Method.POST);
        conn.requestBody(body)
                .header("Content-Type", "application/json");

        System.out.println("url:"+url);
        System.out.println("body:"+body);
        try {
            Connection.Response response = conn.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    private static Connection getConn(String url, Map<String, String> headers) {
        Connection conn = Jsoup.connect(url);
        conn.timeout(10000); // 10秒超时
        conn.ignoreContentType(true);

        if (headers != null) {
            Iterator<Map.Entry<String, String>> iter = headers.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                String key = entry.getKey();
                String value = entry.getValue();
                conn.header(key, value);
            }
        }

        return conn;
    }


}
