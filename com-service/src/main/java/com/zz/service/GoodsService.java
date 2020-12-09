package com.zz.service;

import com.zz.utils.PagedResult;
import com.zz.vo.GoodsDetailVo;


public interface GoodsService {

    //查询首页热销商品 pageNum 当前页 pageSize 页面大小
    PagedResult queryAllHotGoods(Integer pageNum,Integer pageSize);

    //查询首页畅销商品 pageNum 当前页 pageSize 页面大小
    PagedResult queryAllBestGoods(Integer pageNum,Integer pageSize);

    //查询商品详情 goodsId 商品id
    GoodsDetailVo queryGoodsDetailsById(String goodsId);

    //查询热卖产品列表 pageNum 当前页 pageSize 页面大小 orderBy 排序字段 orderType 排序规则
    PagedResult queryAllHotGoodsList(Integer pageNum,Integer pageSize,String orderBy,Integer orderType);
}
