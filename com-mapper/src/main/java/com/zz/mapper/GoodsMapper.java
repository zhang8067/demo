package com.zz.mapper;

import com.zz.pojo.Goods;
import com.zz.vo.CategoryVO;
import com.zz.vo.GoodsDetailVo;
import com.zz.vo.GoodsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 20:57
 **/
@Component
public interface GoodsMapper extends BaseMapper<Goods> {

    //查询首页热销商品 pageNum 当前页 pageSize 页面大小
    List<GoodsVO> queryAllHotGoods();

    //查询首页畅销商品 pageNum 当前页 pageSize 页面大小
    List<GoodsVO> queryAllBestGoods();

    //查询商品详情 goodsId 商品id
    GoodsDetailVo queryGoodsDetailsById(String goodsId);

    //查询热卖产品列表 pageNum 当前页 pageSize 页面大小 orderBy 排序字段 orderType 排序规则
    List<GoodsVO> queryAllHotGoodsList(@Param("orderBy") String orderBy,@Param("orderType") Integer orderType);
}
