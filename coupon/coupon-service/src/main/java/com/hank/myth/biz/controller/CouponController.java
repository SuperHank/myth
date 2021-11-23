package com.hank.myth.biz.controller;


import com.hank.myth.biz.service.ICouponService;
import com.hank.myth.model.Coupon;
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
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private ICouponService couponService;

    @GetMapping("/get/{id}")
    public Coupon get(@PathVariable("id") Integer id) {
        return couponService.getById(id);
    }

}
