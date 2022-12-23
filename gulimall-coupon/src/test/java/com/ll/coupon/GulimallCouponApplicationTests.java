package com.ll.coupon;

import com.ll.coupon.entity.CouponEntity;
import com.ll.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity couponEntity =new CouponEntity();

        couponEntity.setCouponName("耐克");
        couponService.save(couponEntity);
        System.out.println("保存成功");


    }

}
