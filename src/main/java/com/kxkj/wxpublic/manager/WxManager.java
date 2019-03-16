package com.kxkj.wxpublic.manager;

import com.kxkj.wxpublic.domain.AccessToken;
import com.kxkj.wxpublic.domain.form.WxStartForm;
import com.kxkj.wxpublic.domain.wx.WxMessageAllEntity;

public interface WxManager {
    boolean checkSignature(WxStartForm bean);

    AccessToken getAccessToken();

    boolean setWxMenu();

    String handleMsg(WxMessageAllEntity bean);
}
