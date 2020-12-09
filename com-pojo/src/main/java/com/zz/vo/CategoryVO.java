package com.zz.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zhangzhen
 * @Date 2020/12/8 10:11
 **/
@Data
@Accessors(chain = true)
public class CategoryVO implements Serializable {
    private Long id;
    private String name;
    private String icon;
}
