package com.xcf.xls.user.biz.service;


import com.xcf.response.Response;
import com.xcf.xls.user.biz.dto.FindUserByIdReqDTO;
import com.xcf.xls.user.biz.dto.resp.FindUserByIdRspDTO;
import com.xcf.xls.user.biz.model.VO.UpdateUserInfoReqVO;
import org.xcf.xls.user.dto.req.RegisterUserReqDTO;

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


    /**
     * 根据用户 ID 查询用户简略信息
     *
     * @param findUserByIdReqDTO
     * @return
     */
    Response<FindUserByIdRspDTO> findById(FindUserByIdReqDTO findUserByIdReqDTO);

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);
}

