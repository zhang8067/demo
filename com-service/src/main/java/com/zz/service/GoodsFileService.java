package com.zz.service;

import com.zz.pojo.GoodsFile;

import java.util.List;

public interface GoodsFileService {
    List<GoodsFile> queryFileById(String goodsId);
}
