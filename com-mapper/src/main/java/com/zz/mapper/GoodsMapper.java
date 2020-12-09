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

    List<GoodsVO> queryAllHotGoods();
    List<GoodsVO> queryAllBestGoods();

    GoodsDetailVo queryGoodsDetailsById(String goodsId);

    List<GoodsVO> queryAllHotGoodsList(@Param("orderBy") String orderBy,@Param("orderType") Integer orderType);
}
