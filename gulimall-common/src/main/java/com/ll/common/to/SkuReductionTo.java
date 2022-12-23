package com.ll.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author LLstart
 * @date 2022/12/20 - 15:35
 */
@Data
public class SkuReductionTo {
    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}
