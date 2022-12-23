package com.ll.coupon.dao;

import com.ll.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:52:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
