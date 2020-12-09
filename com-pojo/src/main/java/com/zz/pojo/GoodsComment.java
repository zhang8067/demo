package com.zz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 19:43
 **/
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("tb_goods_comment")
public class GoodsComment extends Base{
    @TableId(value = "id")
    private Long id;
    private Long orderId;             // 订单id
    private String  orderNo;          // 订单号
    private Long  goodsId;            // 商品id
    private String  goodsName;        // 商品名称
    private Long  specId;             // 规格id
    private String  specName;         // 规格名称
    private Long  userId;             // 用户id
    private String  nickName;         // 用户昵称
    private String avatar;             // 用户头像
    private String  comment;           // 评论内容
    private Integer score;             // 评论分数
    private String pictures;           // 评论图片地址（多张,分隔）
    private Integer delFlag;          // 删除状态（0正常 -1删除）
}
