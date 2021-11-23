package com.hank.myth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponDto {

    private Integer id;

    private String templateCode;

    private String memberCode;

    private String couponCode;

    private LocalDateTime assignTime;

    private Integer status;
}
