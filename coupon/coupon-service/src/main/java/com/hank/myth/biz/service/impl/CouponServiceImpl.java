package com.hank.myth.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hank.myth.biz.service.ICouponService;
import com.hank.myth.mapper.CouponMapper;
import com.hank.myth.model.Coupon;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券(用户领取的记录) 服务实现类
 * </p>
 *
 * @author shih
 * @since 2021-11-23
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements ICouponService {

}
