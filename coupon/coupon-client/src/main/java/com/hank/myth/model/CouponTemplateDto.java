package com.hank.myth.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 优惠券模板表
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@Data
@Accessors(chain = true)
public class CouponTemplateDto {

    private Integer id;

    private String templateCode;

    private Boolean available;

    private Boolean expired;

    private String name;

    private String logo;

    private String intro;

    private String category;

    private Integer productLine;

    private Integer couponCount;

    private LocalDateTime createTime;

    private Long userId;

    private String templateKey;

    private Integer target;

    private String rule;
}
