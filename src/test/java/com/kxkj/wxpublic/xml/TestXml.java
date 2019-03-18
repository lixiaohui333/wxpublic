package com.kxkj.wxpublic.xml;

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
//        WxMessageAllEntity xmlbean = XmlUtil.xmlToBean(xmlStr, WxMessageAllEntity.class);
//        XStream xstream = XmlUtil.createXstream();
//        xstream.processAnnotations(WxMessageAllEntity.class);
//        xstream.alias("xml",WxMessageAllEntity.class);
//        WxMessageAllEntity xmlbean = (WxMessageAllEntity) xstream.fromXML(xmlStr);

//        WxMessageAllEntity xmlDomain = XmlUtil.toXmlDomain(xmlStr);


//        System.out.println(xmlDomain);

    }
}
