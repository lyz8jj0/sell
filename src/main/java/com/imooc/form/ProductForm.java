package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by 李新宇
 * 2019-03-29 11:15
 */
@Data
public class ProductForm {

    private String productId;

    /**
     * 商品名字
     */
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 小图
     */
    private String productIcon;

    /**
     * 类目编号
     */
    private Integer categoryType;
}
