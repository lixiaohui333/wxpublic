package com.kxkj.wxpublic.domain.wx;

import com.kxkj.wxpublic.utils.ToString;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class MessageBase extends ToString {

    @XStreamAlias("ToUserName")
    private String toUserName;
    @XStreamAlias("FromUserName")
    private String fromUserName;


    //由于微信服务端需要的时间整形是以秒为单位的，故需要除以1000L
    // this.setCreateTime(String.valueOf(System.currentTimeMillis() / 1000L));
    @XStreamAlias("CreateTime")
    private String createTime;
    @XStreamAlias("MsgType")
    private String msgType;


    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
}
