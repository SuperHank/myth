package com.hank.myth.biz.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hank.myth.biz.service.IAsyncService;
import com.hank.myth.biz.service.ICouponTemplateService;
import com.hank.myth.enums.common.ResultCode;
import com.hank.myth.mapper.CouponTemplateMapper;
import com.hank.myth.model.CouponTemplate;
import com.hank.myth.model.req.BuildTemplateReqDto;
import com.hank.myth.util.CommonUtil;
import com.hank.myth.util.ExceptionThen;
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
    private IAsyncService asyncService;
    @Autowired
    private CouponTemplateMapper templateMapper;

    @Override
    public CouponTemplate buildTemplate(BuildTemplateReqDto reqDto) {
        // 判断同名的优惠券模板是否存在
        QueryWrapper<CouponTemplate> wrapper = new QueryWrapper<CouponTemplate>().eq("name", reqDto.getName());
        ExceptionThen.then(templateMapper.selectOne(wrapper) != null, ResultCode.PARAM_DUPLICATED, "Exist Same Name Template!");

        // 构造 CouponTemplate 并保存到数据库中
        CouponTemplate template = requestToTemplate(reqDto);
        templateMapper.insert(template);

        // 根据优惠券模板异步生成优惠券码
        asyncService.asyncConstructCouponByTemplate(template);

        return template;
    }

    /**
     * 将 TemplateRequest 转换为 CouponTemplate
     */
    private CouponTemplate requestToTemplate(BuildTemplateReqDto reqDto) {

        return new CouponTemplate(
                CommonUtil.getRandomStrCode(16),
                reqDto.getName(),
                reqDto.getLogo(),
                reqDto.getDesc(),
                reqDto.getCategory(),
                reqDto.getProductLine(),
                reqDto.getCount(),
                reqDto.getUserId(),
                reqDto.getTarget(),
                JSON.toJSONString(reqDto.getRule())
        );
    }
}
