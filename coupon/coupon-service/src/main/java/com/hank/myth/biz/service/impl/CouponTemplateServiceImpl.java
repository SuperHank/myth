package com.hank.myth.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hank.myth.biz.service.ICouponTemplateService;
import com.hank.myth.mapper.CouponTemplateMapper;
import com.hank.myth.model.CouponTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券模板表 服务实现类
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@Service
public class CouponTemplateServiceImpl extends ServiceImpl<CouponTemplateMapper, CouponTemplate> implements ICouponTemplateService {

    @Autowired
    private CouponTemplateMapper couponTemplateMapper;
}
