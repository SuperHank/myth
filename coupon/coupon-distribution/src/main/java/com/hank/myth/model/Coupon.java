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
 * 优惠券(用户领取的记录)
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("coupon")
public class Coupon extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 优惠券模版Code
     */
    private String templateCode;

    /**
     * 领取用户
     */
    private String memberCode;

    /**
     * 优惠券码
     */
    private String couponCode;

    /**
     * 领取时间
     */
    private LocalDateTime assignTime;

    /**
     * 优惠券的状态
     */
    private Integer status;


}
