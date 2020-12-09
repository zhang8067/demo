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
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@TableName("tb_category")
public class Category extends Base{
    @TableId(value = "id")
    private Long id;
    private String categoryNo;    //分类编号
    private String name;           //分类名称
    private Integer level;         //分类级别
    private Integer isShow;       //是否显示
    private Integer isBarShow;   //导航栏是否显示
    private String icon;           //图标
    private Long parentId;        //上级分类id
    private Integer sort;          //排序
    private Integer delFlag;      //删除状态（0正常 -1删除）

}
