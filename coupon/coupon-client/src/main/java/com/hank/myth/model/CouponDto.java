package com.hank.myth.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CouponDto {

    private Integer id;

    private String templateCode;

    private String memberCode;

    private String couponCode;

    private LocalDateTime assignTime;

    private Integer status;
}
