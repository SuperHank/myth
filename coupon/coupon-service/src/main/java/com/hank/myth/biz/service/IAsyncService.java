package com.hank.myth.biz.service;

import com.hank.myth.model.CouponTemplate;

public interface IAsyncService {
    /**
     * 根据模板异步的创建优惠券码
     *
     * @param template {@link CouponTemplate} 优惠券模板实体
     */
    void asyncConstructCouponByTemplate(CouponTemplate template);
}
