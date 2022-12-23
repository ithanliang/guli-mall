package com.ll.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:59:27
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

