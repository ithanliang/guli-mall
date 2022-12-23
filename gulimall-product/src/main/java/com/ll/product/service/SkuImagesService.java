package com.ll.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ll.common.utils.PageUtils;
import com.ll.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author ll
 * @email ll@gmail.com
 * @date 2022-11-03 18:58:30
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

