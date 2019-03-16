package com.kxkj.wxpublic.controller;


import com.kxkj.wxpublic.domain.form.WxStartForm;
import com.kxkj.wxpublic.domain.wx.WxMessageAllEntity;
import com.kxkj.wxpublic.manager.HelloManager;
import com.kxkj.wxpublic.manager.WxManager;
import com.kxkj.wxpublic.utils.xml.XmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * 测试类
 * */
@RestController
public class WxController {

    @Autowired
    WxManager wxManager;


    @RequestMapping(value = "/wx/start",method = RequestMethod.GET)
    public Object wxstart(WxStartForm bean) {
        System.out.println("RequestMapping: /wx/start");


        boolean checkResult = wxManager.checkSignature(bean);

        System.out.println("checkResult:"+checkResult);
        System.out.println(bean.getEchostr());

        return checkResult ? bean.getEchostr() : "error";
    }


    @RequestMapping(value = "/wx/start",method = RequestMethod.POST)
    public Object wxRequest(@RequestBody String body){

        System.out.println("----RequestMapping POST-----");
        System.out.println(body);

//        WxMessageAllEntity bean = XmlUtil.xmlToBean(body, WxMessageAllEntity.class);
        WxMessageAllEntity xmlbean = XmlUtil.xmlToBean(body, WxMessageAllEntity.class);

//       String result= wxManager.handleMsg(bean);



        return "success";
    }
}
