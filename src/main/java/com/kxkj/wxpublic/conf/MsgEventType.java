package com.kxkj.wxpublic.conf;

public enum MsgEventType {



    MY_TICKET("my_ticket"),
    USERINFO("userinfo")
    ;


    private String eventKey = "";

    MsgEventType(String eventKey) {
        this.eventKey = eventKey;
    }

    /**
     * @return the msgType
     */
    @Override
    public String toString() {
        return eventKey;
    }


}
