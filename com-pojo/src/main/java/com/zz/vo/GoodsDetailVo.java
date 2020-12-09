package com.zz.vo;

import com.zz.pojo.GoodsFile;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/8 13:02
 **/
@Data
@Accessors(chain = true)
public class GoodsDetailVo implements Serializable {

    private BigDecimal price;
    private String     picture;
    private String goodsName;
    private Integer  salesVolume;
    private String goodsSpec;
    private String  comment;
    private Integer score;
    private String pictures;
    private String avatar;
    private String  nickName;
    private List<GoodsFile> goodsFileList;
}
