package com.hank.myth.client.controller;


import com.hank.myth.biz.service.ICouponService;
import com.hank.myth.model.Coupon;
import com.hank.myth.model.CouponDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券(用户领取的记录) 前端控制器
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@RestController
@RequestMapping("/coupon-client")
public class CouponClientController {

    @Autowired
    private ICouponService couponService;

    @GetMapping("/get/{id}")
    public CouponDto get(@PathVariable("id") Integer id) {
        Coupon coupon = couponService.getById(id);

        return coupon2CouponDto(coupon);
    }


    /**
     * 将 CouponDto 转换为 coupon
     */
    private CouponDto coupon2CouponDto(Coupon coupon) {
        return new CouponDto(
                coupon.getId(),
                coupon.getTemplateCode(),
                coupon.getMemberCode(),
                coupon.getCouponCode(),
                coupon.getAssignTime(),
                coupon.getStatus()
        );
    }
}
