package com.hank.myth.enums.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BizNameEnum {

    GATEWAY_SINGLE_ADD_ROUTE("手动添加路由（单条）"),
    ;

    private final String bizName;
}
