package com.kxkj.wxpublic.manager.impl;

import com.kxkj.wxpublic.conf.ApiPath;
import com.kxkj.wxpublic.conf.Constants;
import com.kxkj.wxpublic.conf.MyConfig;
import com.kxkj.wxpublic.domain.AccessToken;
import com.kxkj.wxpublic.domain.form.WxStartForm;
import com.kxkj.wxpublic.domain.wx.WxMenuBean;
import com.kxkj.wxpublic.domain.wx.WxMessageAllEntity;
import com.kxkj.wxpublic.manager.WxManager;
import com.kxkj.wxpublic.utils.Decript;
import com.kxkj.wxpublic.utils.GsonUtil;
import com.kxkj.wxpublic.utils.http.JsoupHelper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class WxManagerImpl implements WxManager {


    @Override
    public boolean checkSignature(WxStartForm bean) {

        String sortStr = sort(Constants.TOKEN, bean.getTimestamp(), bean.getNonce());

        String mytoken = Decript.SHA1(sortStr);
        System.out.println("mySignature:"+mytoken);

        if(bean.getSignature().equals(mytoken)){

            return true;
        }
        return false;
    }

    @Override
    public AccessToken getAccessToken() {


        String url = String.format(ApiPath.WX_GETACCESS_TOKEN, Constants.AppID, Constants.AppSecret);

        String token = JsoupHelper.get(url, null, null);

        System.out.println(token);

        AccessToken accessToken = GsonUtil.toDomain(token, AccessToken.class);

        if(accessToken!=null){
            MyConfig.ACCESSTOKEN = accessToken;
            return accessToken;
        }

        return null;

    }

    @Override
    public boolean setWxMenu() {

        WxMenuBean bean = new WxMenuBean();
        List<WxMenuBean.ButtonBean> buttonList=new ArrayList<>();

        WxMenuBean.ButtonBean btn1=new WxMenuBean.ButtonBean();
        btn1.setName("鲸鱼官网1");
        btn1.setType("view");
        btn1.setUrl("https://www.jingyuhuodong.com/");


        WxMenuBean.ButtonBean btn2=new WxMenuBean.ButtonBean();
        btn2.setName("会议新闻");
        btn2.setType("view");
        btn2.setUrl("https://www.jingyuhuodong.com/");

        WxMenuBean.ButtonBean btn3=new WxMenuBean.ButtonBean();
        btn3.setName("鲸鱼管家");

        List<WxMenuBean.ButtonBean> subList=new ArrayList<>();
        WxMenuBean.ButtonBean subBtn1=new WxMenuBean.ButtonBean();

        subBtn1.setName("我的电子票");
        subBtn1.setType("click");
        subBtn1.setKey("wx_click_myticket");


        WxMenuBean.ButtonBean subBtn2=new WxMenuBean.ButtonBean();
        subBtn2.setName("联系我们");
        subBtn2.setType("view");
        subBtn2.setUrl("https://www.jingyuhuodong.com");


        subList.add(subBtn1);
        subList.add(subBtn2);
        btn3.setSub_button(subList);


        buttonList.add(btn1);
        buttonList.add(btn2);
        buttonList.add(btn3);

        bean.setButton(buttonList);

        String url = String.format(ApiPath.WX_SET_MEUN,MyConfig.ACCESSTOKEN.getAccess_token());

        String result = JsoupHelper.post(url, GsonUtil.toJson(bean), null);
        System.out.println(result);

        return false;
    }

    @Override
    public String handleMsg(WxMessageAllEntity bean) {

        System.out.println(bean.toString());

        if (bean==null){
            return null;
        }

        switch (bean.getMsgType()){

        }


        return null;
    }


    /**
     * 排序方法
     * @param token
     * @param timestamp
     * @param nonce
     * @return
     */
    public static String sort(String token, String timestamp, String nonce) {
        String[] strArray = { token, timestamp, nonce };
        Arrays.sort(strArray);

        StringBuilder sbuilder = new StringBuilder();
        for (String str : strArray) {
            sbuilder.append(str);
        }

        return sbuilder.toString();
    }
}
