package com.ll.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.product.entity.AttrGroupEntity;
import com.ll.product.vo.AttrGroupRelationVo;
import com.ll.product.vo.AttrGroupWithAttrsVo;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:58:30
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {


    /**
     * 分页查询属性三级分类
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 分页查询属性三级分类
     * @param params
     * @param catelogId 分类id
     * @return
     */

    PageUtils queryPage(Map<String, Object> params, Long catelogId);


    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);
}

