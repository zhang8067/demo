package com.zz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 19:43
 **/
@Data
@Accessors(chain = true)
@TableName("tb_goods_file")
public class GoodsFile extends Base{
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long  id;
    private Long  goodsId;       //商品id
    private String category;      //附件类别(main-主图,pic-普通图片)
    private String name;          //附件名
    private String type;          //附件类型
    private Integer size;         //附件大小
    private String url;           //附件访问链接
    private Integer sort;          //排序
    private Integer delFlag;      //删除状态（0正常 -1删除）
}
