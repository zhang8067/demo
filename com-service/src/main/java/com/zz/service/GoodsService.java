package com.zz.service;

import com.zz.utils.PagedResult;
import com.zz.vo.GoodsDetailVo;


public interface GoodsService {
    PagedResult queryAllHotGoods(Integer pageNum,Integer pageSize);

    PagedResult queryAllBestGoods(Integer pageNum,Integer pageSize);

    GoodsDetailVo queryGoodsDetailsById(String goodsId);

    PagedResult queryAllHotGoodsList(Integer pageNum,Integer pageSize,String orderBy,Integer orderType);
}
