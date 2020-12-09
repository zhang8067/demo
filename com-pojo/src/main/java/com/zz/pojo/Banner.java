package com.zz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 19:42
 **/
@Data
@Accessors(chain = true)
@TableName("TB_BANNER")
public class Banner extends Base {
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long id;
    private Long locationId;       //banner位置id（默认1 首页轮播）
    private String location;        //banner位置(默认首轮录播)
    private String bannerNo;       //baner编号
    private String name;            //banner名称
    private String picture;         //banner图片地址
    private Integer sort;           //排序
    private Integer type;           //banner 类型
    private Long goodsId;          //关联商品id
    private Integer state;          //上下架状态(0下架 1上架)
    private Integer delFlag;       //删除状态（0正常 -1删除）

}
