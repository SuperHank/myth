package com.hank.myth.biz.controller;


import com.hank.myth.biz.service.ICouponTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券模板表 前端控制器
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@RestController
@RequestMapping("/coupon-template")
public class CouponTemplateController {

    @Autowired
    private ICouponTemplateService couponTemplateService;
}
