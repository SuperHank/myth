package com.hank.myth.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("coupon_template")
public class CouponTemplate extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
