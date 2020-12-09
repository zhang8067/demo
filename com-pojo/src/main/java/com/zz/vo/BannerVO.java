package com.zz.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zhangzhen
 * @Date 2020/12/8 9:46
 **/
@Data
@Accessors(chain = true)
public class BannerVO  implements Serializable {

    private Long id;
    private String name;            //banner名称
    private String location;        //banner位置(默认首轮录播)
    private String picture;         //banner图片地址
}
