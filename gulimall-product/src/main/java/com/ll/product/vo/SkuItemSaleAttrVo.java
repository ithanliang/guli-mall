package com.ll.product.vo;

import lombok.Data;
import lombok.ToString;
import com.ll.product.vo.AttrValueWithSkuIdVO;
import java.util.List;

/**
 * @author ZSY
 * @createTime: 2020-06-19 11:21
 */
@Data
@ToString
public class SkuItemSaleAttrVo {

    private Long attrId;

    private String attrName;

    private List<AttrValueWithSkuIdVO> attrValues;

}
