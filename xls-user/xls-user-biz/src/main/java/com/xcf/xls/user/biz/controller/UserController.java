package com.xcf.xls.user.biz.controller;

import com.xcf.framework.biz.operationlog.aspect.ApiOperationLog;
import com.xcf.response.Response;
import com.xcf.xls.user.biz.dto.FindUserByIdReqDTO;
import com.xcf.xls.user.biz.dto.resp.FindUserByIdRspDTO;
import com.xcf.xls.user.biz.model.VO.UpdateUserInfoReqVO;
import com.xcf.xls.user.biz.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xcf.xls.user.dto.req.RegisterUserReqDTO;

/**
 * @description: 用户
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户信息修改
     *
     * @param updateUserInfoReqVO
     * @return
     */
    @PostMapping(value = "/update", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Response<?> updateUserInfo(@Validated UpdateUserInfoReqVO updateUserInfoReqVO) {
        return userService.updateUserInfo(updateUserInfoReqVO);
    }


    /**
     * 根据用户id查找用户简略信息
     * @param findUserByIdReqDTO
     * @return
     */
    @PostMapping("/findById")
    @ApiOperationLog(description = "查询用户简略信息")
    public Response<FindUserByIdRspDTO> findById(@Validated @RequestBody FindUserByIdReqDTO findUserByIdReqDTO) {
        return userService.findById(findUserByIdReqDTO);
    }


    // ===================================== 对其他服务提供的接口 =====================================
    @PostMapping("/register")
    @ApiOperationLog(description = "用户注册")
    public Response<Long> register(@Validated @RequestBody RegisterUserReqDTO registerUserReqDTO) {
        return userService.register(registerUserReqDTO);
    }

}

