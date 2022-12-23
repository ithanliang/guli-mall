package com.ll.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author LLstart
 * @date 2022/12/20 - 15:11
 */
@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}
