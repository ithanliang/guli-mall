package com.ll.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:57:24
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

