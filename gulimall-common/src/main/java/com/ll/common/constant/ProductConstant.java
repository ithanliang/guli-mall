package com.ll.common.constant;

/**
 * @author LLstart
 * @date 2022/12/15 - 10:09
 */
public class ProductConstant {
    public enum AttrEnum {
        ATTR_TYPE_BASE(1, "基本属性"),ATTR_TYPE_SALE(0,"销售属性");



        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        }
}
