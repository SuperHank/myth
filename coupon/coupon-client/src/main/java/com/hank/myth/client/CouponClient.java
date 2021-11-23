package com.hank.myth.client;

import com.hank.myth.model.CouponDto;
import com.hank.myth.model.CouponTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "coupon-service")
public interface CouponClient {

    /**
     * 获取模版id 到 CouponTemplateSDK的映射
     */
    @GetMapping("/coupon-template/template/id/{id}")
    CouponTemplateDto getTemplateById(@PathVariable("id") Integer id);

    @GetMapping("/coupon-service/coupon-client/get/{id}")
    public CouponDto get(@PathVariable("id") Integer id);
}
