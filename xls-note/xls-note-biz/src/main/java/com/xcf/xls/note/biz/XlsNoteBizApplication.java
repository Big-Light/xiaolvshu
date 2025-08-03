package com.xcf.xls.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.xcf.xls.note.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.quanxiaoha.xiaohashu")
public class XlsNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XlsNoteBizApplication.class, args);
    }

}
