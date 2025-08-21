package com.xcf.xls.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.xcf.xls.note.biz.domain.mapper")
public class XlsNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XlsNoteBizApplication.class, args);
    }

}
