package com.ll.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author LLstart
 * @date 2022/12/21 - 15:38
 */
@Data
public class MergeVo {

    private Long purchaseId; //整单id
    private List<Long> items;//[1,2,3,4] //合并项集合
}
