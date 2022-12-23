package com.ll.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:56:09
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

