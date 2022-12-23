package com.ll.product;

import com.ll.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    CategoryService categoryService;

    @Test
    public void testFindpath() {
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径{}", catelogPath);
    }

    @Test
    void contextLoads() {
    }

}
