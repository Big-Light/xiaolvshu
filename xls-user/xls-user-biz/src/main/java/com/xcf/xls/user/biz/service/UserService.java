package com.xcf.xls.user.biz.service;


import com.xcf.response.Response;
import com.xcf.xls.user.biz.model.VO.UpdateUserInfoReqVO;

/**
 * @description: 用户业务
 **/
public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);
}

