package com.kxkj.wxpublic.task;

import com.kxkj.wxpublic.manager.WxManager;
import com.kxkj.wxpublic.springboot.ApplicationContextProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TokenRunable implements Runnable {

    private Logger logger = LoggerFactory.getLogger(getClass());


//    @Autowired
    WxManager wxManager;

    @Override
    public void run() {
        logger.info("----启动了TokenRunable----");
        wxManager= ApplicationContextProvider.getBean(WxManager.class);

        int i = 0;
        while (true) {


            wxManager.getAccessToken();


            logger.info("TokenRunable:" + i);
            i++;
            try {
                Thread.sleep(7200 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
