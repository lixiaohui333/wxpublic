package com.kxkj.wxpublic.domain.wx;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class MessageTextEntity extends MessageBase{


    @XStreamAlias("Content")
    private String content;

    public MessageTextEntity() {


    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}