package com.xcf.xls.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.xcf.xls.auth.mapper")
@SpringBootApplication
@EnableFeignClients(basePackages = "com.xcf.xls")
public class XlsAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XlsAuthApplication.class, args);
    }

}
