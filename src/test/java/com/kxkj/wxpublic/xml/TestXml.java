package com.kxkj.wxpublic.xml;

import com.kxkj.wxpublic.domain.wx.WxMessageAllEntity;
import com.kxkj.wxpublic.utils.xml.XmlUtil;
import org.junit.Test;

public class TestXml {

    @Test
    public void testXml(){
        System.out.println("----------test--------");

        String xmlStr="<xml><ToUserName><![CDATA[gh_ff431504bf4c]]></ToUserName>\n" +
                "<FromUserName><![CDATA[ogN8twZQLrUyfFJxeOS_1xFLOBo8]]></FromUserName>\n" +
                "<CreateTime>1552641656</CreateTime>\n" +
                "<MsgType><![CDATA[text]]></MsgType>\n" +
                "<Content><![CDATA[发发发]]></Content>\n" +
                "<MsgId>22228486582347301</MsgId>\n" +
                "</xml>";

//        XmlUtil.getMyXStream();
        WxMessageAllEntity xmlbean = XmlUtil.xmlToBean(xmlStr, WxMessageAllEntity.class);

        System.out.println(xmlbean);

    }
}
