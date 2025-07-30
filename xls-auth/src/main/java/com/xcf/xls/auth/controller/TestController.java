package com.xcf.xls.auth.controller;


import com.xcf.framework.biz.operationlog.aspect.ApiOperationLog;
import com.xcf.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


/**
 * @author: 犬小哈
 * @url: www.quanxiaoha.com
 * @date: 2024/5/4 12:53
 * @description: TODO
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response<String> test() {
        return Response.success("开始学习");
    }

    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<User> test2() {
        return Response.success(User.builder()
                .nickName("犬小哈")
                .createTime(LocalDateTime.now())
                .build());
    }
}

