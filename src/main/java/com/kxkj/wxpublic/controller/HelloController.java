package com.kxkj.wxpublic.controller;


import com.kxkj.wxpublic.manager.HelloManager;
import com.kxkj.wxpublic.manager.WxManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 测试类
* */
@RestController
public class HelloController {

    @Autowired
    HelloManager helloManager;


    @Autowired
    WxManager wxManager;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("RequestMapping:hello");
        return "hotload hello wxpublic "+helloManager.findRandomStr();
    }


    @RequestMapping("/getToken")
    public String getToken(){
        wxManager.getAccessToken();
        return "ok";
    }



    @RequestMapping("/menu")
    public String menu(){
        wxManager.setWxMenu();
        return "ok";
    }
}
