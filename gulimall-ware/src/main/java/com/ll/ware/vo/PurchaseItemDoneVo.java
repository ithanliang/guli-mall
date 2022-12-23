package com.ll.ware.vo;

import lombok.Data;

/**
 * @author LLstart
 * @date 2022/12/21 - 16:34
 */
@Data
public class PurchaseItemDoneVo {

    //{itemId:1,status:4,reason:""}
    private Long itemId;
    private Integer status;
    private String reason;

}
