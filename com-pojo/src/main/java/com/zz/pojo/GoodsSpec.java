package com.zz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 19:43
 **/
@Data
@Accessors(chain = true)
@TableName("tb_goods_spec")
public class GoodsSpec extends Base{
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long  id;
    private Long  goodsId;               //商品id
    private String goodsSpec;            //商品规格
    private String  uniqueId;            //唯一性id（待确认）
    private String  skuNo;               //SKU编号
    private BigDecimal price;             //商品价格
    private Integer  stock;               //库存数量
    private Integer  salesVolume;        //销量
    private Integer sort;                 //排序
    private Integer  state;               //状态（0下架 1上架）
    private Integer delFlag;             //删除状态（0正常 -1删除）
}
