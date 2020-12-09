package com.zz.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 19:43
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@TableName("tb_goods")
public class Goods extends Base {
    @TableId(value = "id")
    private String id;                    //    id
    private String merchantId;          //   商户id
    private String shopId;                // 商铺id
    private String goodsNo;             //   商品编号
    private String goodsName;           //   商品名称
    private String categoryId ;         //   一级类目id
    private String  category;            //    一级类目
    private String   macroCategoryId;   //    二级类目id
    private String  macroCategory ;     //    二级类目
    private String  microCategorId;    //    三级类目id
    private String  microCategory;      //    三级类目
    private String  goodsCode;           //   商品货号
    private BigDecimal weight;           //  商品重量
    private String   weightUnit;         //    重量单位(g,kg)
    private BigDecimal price;            //    商品价格（规格中的最低价格）
    private Integer   stock;             //     商品库存
    private Integer   recommend_1;       //      推荐位1(热销爆款)
    private Integer    recommend_2;      //       推荐位2(精选好物)
    private Integer   state;             //      状态(0 下架 1上架)
    private String  content;             //   商品详情
    private String  picture;             //   商品主图(封面图纸第一张)
    private Integer   sort;              //      排序
    private Integer    source;           //       商品添加来源（1自己创建）
    private Integer    delFlag;         //       删除状态（0正常 -1删除）
}