package com.kxkj.wxpublic.manager.impl;

import com.kxkj.wxpublic.manager.HelloManager;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class HelloManagerImpl implements HelloManager
{
    @Override
    public String findRandomStr() {

        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
