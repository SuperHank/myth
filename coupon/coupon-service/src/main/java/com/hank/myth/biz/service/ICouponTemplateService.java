package com.hank.myth.biz.service;

import com.hank.myth.model.req.BuildTemplateReqDto;
import com.hank.myth.model.CouponTemplate;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 优惠券模板表 服务类
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
public interface ICouponTemplateService extends IService<CouponTemplate> {

    /**
     * 构建优惠券模版
     *
     * @param reqDto
     * @return
     */
    CouponTemplate buildTemplate(BuildTemplateReqDto reqDto);
}
