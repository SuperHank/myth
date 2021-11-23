package com.hank.myth.biz.controller;


import com.alibaba.fastjson.JSON;
import com.hank.myth.biz.service.ICouponTemplateService;
import com.hank.myth.model.req.BuildTemplateReqDto;
import com.hank.myth.model.CouponTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Slf4j
@RestController
@RequestMapping("/coupon-template")
public class CouponTemplateController {

    @Autowired
    private ICouponTemplateService couponTemplateService;

    @PostMapping("/create")
    public CouponTemplate buildTemplate(@RequestBody BuildTemplateReqDto reqDto) {
        log.info("build template reqDto : {}", JSON.toJSONString(reqDto));
        CouponTemplate template = couponTemplateService.buildTemplate(reqDto);
        log.info("build template respDto : {}", JSON.toJSONString(template));
        return template;
    }

}
