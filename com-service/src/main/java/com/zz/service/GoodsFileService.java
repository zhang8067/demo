package com.zz.service;

import com.zz.pojo.GoodsFile;

import java.util.List;

public interface GoodsFileService {

    //通过goodsId获得附件
    List<GoodsFile> queryFileById(String goodsId);
}
