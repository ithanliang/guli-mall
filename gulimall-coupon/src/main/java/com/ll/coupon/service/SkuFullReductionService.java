package com.ll.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.to.SkuReductionTo;
import com.ll.common.utils.PageUtils;
import com.ll.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:52:39
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

