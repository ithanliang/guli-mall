package com.ll.member.dao;

import com.ll.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:56:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
