package com.zz.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author zhangzhen
 * @Date 2020/12/8 23:05
 **/
@Data
@Accessors(chain = true)
public class GoodsFileVO implements Serializable {
    private String type;
    private String url;

}
