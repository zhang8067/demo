package com.zz.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author zhangzhen
 * @Date 2020/12/8 11:18
 **/
@Data
@Accessors(chain = true)
public class GoodsVO implements Serializable {

    private String      id;                    //    id
    private BigDecimal  price;            //    商品价格（规格中的最低价格）
    private String  goodsName;             //   商品详情
    private String      picture;             //   商品主图(封面图纸第一张)
}
