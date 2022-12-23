package com.ll.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author LLstart
 * @date 2022/12/20 - 15:35
 */
@Data
public class MemberPrice {
    private Long id;
    private String name;
    private BigDecimal price;
}
