package com.kxkj.wxpublic.dao;

import com.kxkj.wxpublic.dao.mapper.ThirdPlatformInfoDoMapper;
import com.kxkj.wxpublic.dao.model.ThirdPlatformInfoDo;
import com.kxkj.wxpublic.dao.model.ThirdPlatformInfoDoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThirdDao {

    @Autowired
    ThirdPlatformInfoDoMapper thirdPlatformInfoDoMapper;


    public List<ThirdPlatformInfoDo> findall(){

        return  thirdPlatformInfoDoMapper.selectByExample(new ThirdPlatformInfoDoExample());
    }

}
