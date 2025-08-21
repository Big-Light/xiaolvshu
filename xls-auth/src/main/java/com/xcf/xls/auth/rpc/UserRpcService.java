package com.xcf.xls.auth.rpc;

import com.xcf.response.Response;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.xcf.xls.user.api.UserFeignApi;
import org.xcf.xls.user.dto.req.RegisterUserReqDTO;

/**
 * @description: 用户服务
 **/
@Component
public class UserRpcService {
    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 用户注册
     *
     * @param phone
     * @return
     */
    public Long registerUser(String phone) {
        RegisterUserReqDTO registerUserReqDTO = new RegisterUserReqDTO();
        registerUserReqDTO.setPhone(phone);

        Response<Long> response = userFeignApi.registerUser(registerUserReqDTO);

        if (!response.isSuccess()) {
            return null;
        }

        return response.getData();
    }
}
