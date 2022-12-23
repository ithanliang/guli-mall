package com.ll.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.product.entity.SpuInfoEntity;
import com.ll.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:58:30
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);
}

