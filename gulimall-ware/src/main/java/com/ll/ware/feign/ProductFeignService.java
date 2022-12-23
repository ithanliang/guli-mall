package com.ll.ware.feign;

import com.ll.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LLstart
 * @date 2022/12/21 - 16:51
 */
@FeignClient("gulimall-product")
public interface ProductFeignService {
    /**
     * /product/skuinfo/info/{skuId}
     * <p>
     * 1)、让所有请求过网关；
     * 1、@FeignClient("gulimall-gateway")：给gulimall-gateway所在的机器发请求
     * 2、/api/product/skuinfo/info/{skuId}
     * 2）、直接让后台指定服务处理
     * 1、@FeignClient("gulimall-gateway")
     * 2、/product/skuinfo/info/{skuId}
     *
     * @return R
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    R info(@PathVariable("skuId") Long skuId);
}
