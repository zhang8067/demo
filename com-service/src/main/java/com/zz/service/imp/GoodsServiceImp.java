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

    public PagedResult queryAllHotGoods(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsVO> results = goodsMapper.queryAllHotGoods();
        PageInfo<GoodsVO> pageList = new PageInfo<GoodsVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());
    }

    public PagedResult queryAllBestGoods(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsVO> results = goodsMapper.queryAllBestGoods();
        PageInfo<GoodsVO> pageList = new PageInfo<GoodsVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());
    }

    public GoodsDetailVo queryGoodsDetailsById(String goodsId) {
        return goodsMapper.queryGoodsDetailsById(goodsId);
    }

    public PagedResult queryAllHotGoodsList(Integer pageNum, Integer pageSize,String orderBy,Integer orderType) {
        PageHelper.startPage(pageNum,pageSize);
        List<GoodsVO> results = goodsMapper.queryAllHotGoodsList(orderBy,orderType);
        PageInfo<GoodsVO> pageList = new PageInfo<GoodsVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());

    }

}
