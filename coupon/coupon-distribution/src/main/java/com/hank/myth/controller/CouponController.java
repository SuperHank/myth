package com.hank.myth.controller;


import com.hank.myth.client.CouponClient;
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
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private CouponClient couponClient;

    @GetMapping("/get/{id}")
    public CouponDto get(@PathVariable("id") Integer id) {
        return couponClient.get(id);
    }
}
