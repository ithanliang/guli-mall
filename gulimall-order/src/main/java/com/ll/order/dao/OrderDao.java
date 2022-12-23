package com.ll.order.dao;

import com.ll.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:57:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
