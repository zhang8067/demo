package com.zz.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.mapper.GoodsMapper;
import com.zz.pojo.Goods;
import com.zz.service.GoodsService;
import com.zz.utils.PagedResult;
import com.zz.vo.CategoryVO;
import com.zz.vo.GoodsDetailVo;
import com.zz.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:15
 **/
@Service
public class GoodsServiceImp implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    //查询首页热销商品 pageNum 当前页 pageSize 页面大小
    public PagedResult queryAllHotGoods(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsVO> results = goodsMapper.queryAllHotGoods();
        PageInfo<GoodsVO> pageList = new PageInfo<GoodsVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());
    }

    //查询首页畅销商品 pageNum 当前页 pageSize 页面大小
    public PagedResult queryAllBestGoods(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsVO> results = goodsMapper.queryAllBestGoods();
        PageInfo<GoodsVO> pageList = new PageInfo<GoodsVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());
    }

    //查询商品详情 goodsId 商品id
    public GoodsDetailVo queryGoodsDetailsById(String goodsId) {
        return goodsMapper.queryGoodsDetailsById(goodsId);
    }

    //查询热卖产品列表 pageNum 当前页 pageSize 页面大小 orderBy 排序字段 orderType 排序规则
    public PagedResult queryAllHotGoodsList(Integer pageNum, Integer pageSize,String orderBy,Integer orderType) {
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsVO> results = goodsMapper.queryAllHotGoodsList(orderBy,orderType);
        PageInfo<GoodsVO> pageList = new PageInfo<GoodsVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());

    }

}
