package com.xcf.xls.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.xcf.xls.auth.mapper")
@SpringBootApplication
public class XlsAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XlsAuthApplication.class, args);
    }

}
