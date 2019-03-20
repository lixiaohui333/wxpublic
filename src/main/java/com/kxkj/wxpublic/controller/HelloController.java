package com.kxkj.wxpublic.controller;


import com.kxkj.wxpublic.dao.ThirdDao;
import com.kxkj.wxpublic.dao.mapper.ThirdPlatformInfoDoMapper;
import com.kxkj.wxpublic.dao.model.ThirdPlatformInfoDo;
import com.kxkj.wxpublic.dao.model.ThirdPlatformInfoDoExample;
import com.kxkj.wxpublic.domain.wx.WxMessageAllEntity;
import com.kxkj.wxpublic.manager.HelloManager;
import com.kxkj.wxpublic.manager.WxManager;
import com.kxkj.wxpublic.utils.xml.XmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
* 测试类
* */
@Controller
public class HelloController {

//    @Autowired
//    ThirdDao thirdDao;

    @Autowired
    ThirdPlatformInfoDoMapper thirdPlatformInfoDoMapper;


//    public List<ThirdPlatformInfoDo> findall(){
//
//        return  thirdPlatformInfoDoMapper.selectByExample(new ThirdPlatformInfoDoExample());
//    }
//

    @Autowired
    HelloManager helloManager;


    @Autowired
    WxManager wxManager;

    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        System.out.println("RequestMapping:hello");
        return "hotload hello wxpublic "+helloManager.findRandomStr();
    }


    @RequestMapping("/jsp")
    public ModelAndView hellojsp(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","lxh");
        modelAndView.setViewName("hello");


        return modelAndView;
    }


    @RequestMapping("/getToken")
    public @ResponseBody String getToken(){
        wxManager.getAccessToken();
        return "ok";
    }



    @RequestMapping("/testdb")
    public @ResponseBody List<ThirdPlatformInfoDo> testdb(){

        List<ThirdPlatformInfoDo> areaDo = thirdPlatformInfoDoMapper.selectByExample(new ThirdPlatformInfoDoExample());


        return areaDo;
    }

    @RequestMapping("/menu")
    public @ResponseBody String menu(){
        wxManager.setWxMenu();
        return "ok";
    }

    @RequestMapping("/testxml")
    public @ResponseBody String testxml(){

        String xmlStr="<xml><ToUserName><![CDATA[gh_ff431504bf4c]]></ToUserName>\n" +
                "<FromUserName><![CDATA[ogN8twZQLrUyfFJxeOS_1xFLOBo8]]></FromUserName>\n" +
                "<CreateTime>1552641656</CreateTime>\n" +
                "<MsgType><![CDATA[text]]></MsgType>\n" +
                "<Content><![CDATA[发发发]]></Content>\n" +
                "<MsgId>22228486582347301</MsgId>\n" +
                "</xml>";


        WxMessageAllEntity xmlbean = XmlUtil.toBean(WxMessageAllEntity.class,xmlStr);

        if(xmlbean instanceof WxMessageAllEntity ){

            System.out.println("----instanceof-----");
        }




        System.out.println(xmlbean);



        return "ok";
    }
}
