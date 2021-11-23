package com.hank.myth.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.hank.myth.enums.coupon.CouponCategoryEnum;
import com.hank.myth.enums.coupon.DistributeTargetEnum;
import com.hank.myth.enums.coupon.ProductLineEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 优惠券模板表
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("coupon_template")
@EqualsAndHashCode(callSuper = true)
public class CouponTemplate extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String templateCode;

    private Integer available;

    private Integer expired;

    private String name;

    private String logo;

    private String intro;

    private String category;

    private Integer productLine;

    private Integer couponCount;

    private Date createTime;

    private Integer userId;

    private String templateKey;

    private Integer target;

    private String rule;

    /**
     * 自定义构造函数
     */
    public CouponTemplate(String templateCode, String name, String logo, String intro, String category,
                          Integer productLine, Integer couponCount, Integer userId,
                          Integer target, String rule) {

        this.templateCode = templateCode;
        this.available = 0;
        this.expired = 0;
        this.name = name;
        this.logo = logo;
        this.intro = intro;
        this.category = CouponCategoryEnum.of(category).getCode();
        this.productLine = ProductLineEnum.of(productLine).getCode();
        this.couponCount = couponCount;
        this.userId = userId;
        // 优惠券模板唯一编码 = 4(产品线和类型) + 8(日期: 20190101) + id(扩充为4位)
        this.templateKey = productLine.toString() + category +
                new SimpleDateFormat("yyyyMMdd").format(new Date());
        this.target = DistributeTargetEnum.of(target).getCode();
        this.rule = rule;
        this.createTime = new Date();
    }
}
