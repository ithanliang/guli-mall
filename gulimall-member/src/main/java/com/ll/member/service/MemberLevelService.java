package com.ll.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:56:09
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

