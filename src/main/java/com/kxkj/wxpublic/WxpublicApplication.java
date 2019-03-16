package com.kxkj.wxpublic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class WxpublicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxpublicApplication.class, args);
    }


}
