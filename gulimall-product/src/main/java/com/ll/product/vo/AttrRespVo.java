package com.ll.product.vo;

import lombok.Data;

/**
 * @author LLstart
 * @date 2022/11/18 - 20:46
 */
@Data
public class AttrRespVo extends AttrVo{
    /**
     *"catelogName": "手机/数码/手机", //所属分类名字
     * "groupName": "主体", //所属分组名字
     * */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
