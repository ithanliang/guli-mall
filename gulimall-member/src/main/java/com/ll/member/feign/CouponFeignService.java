package com.ll.member.feign;

import com.ll.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LLstart
 * @date 2022/11/4 - 18:12
 */

/*
* 声明式远程调用
* */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /*
    * 远程调用coupon测试
    * */
    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
