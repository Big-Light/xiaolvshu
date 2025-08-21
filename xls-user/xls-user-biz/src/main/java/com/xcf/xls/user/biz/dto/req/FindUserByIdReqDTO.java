package com.xcf.xls.user.biz.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 根据用户 ID 查询用户信息
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserByIdReqDTO {
    /**
     * 用户id
     */
    @NotNull(message = "用户 ID 不能为空")
    private Long id;
}
