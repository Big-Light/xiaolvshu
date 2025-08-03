package com.xcf.xls.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xcf.xls.user.biz.mapper")
public class XlsUserBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XlsUserBizApplication.class, args);
    }

}
