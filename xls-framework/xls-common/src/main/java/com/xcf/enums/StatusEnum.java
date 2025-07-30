package com.xcf.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 开启/禁用状态枚举；
 **/
@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(0),
    // 禁用
    DISABLED(1);

    private final Integer value;
}

