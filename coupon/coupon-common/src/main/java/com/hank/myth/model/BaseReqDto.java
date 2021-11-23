package com.hank.myth.model;

import lombok.Data;

@Data
public abstract class BaseReqDto {
    private String token;

    protected abstract void validate();
}
