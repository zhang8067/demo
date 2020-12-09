package com.zz.mapper;

import com.zz.pojo.GoodsFile;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 20:57
 **/
public interface GoodsFileMapper extends BaseMapper<GoodsFile> {
    List<GoodsFile> queryFileById(String goodsId);
}
