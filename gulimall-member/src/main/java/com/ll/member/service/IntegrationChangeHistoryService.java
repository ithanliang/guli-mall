package com.ll.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:56:09
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

