package com.zz.controller;

import com.zz.pojo.GoodsFile;
import com.zz.service.GoodsFileService;
import com.zz.service.GoodsService;
import com.zz.utils.JSONResult;
import com.zz.utils.PagedResult;
import com.zz.vo.GoodsDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:20
 **/
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    GoodsFileService goodsFileService;

    @GetMapping("/hotLists")
    public JSONResult getAllHotGoods(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "2") Integer pageSize){
        PagedResult pagedResult = goodsService.queryAllHotGoods(pageNum,pageSize);
        return JSONResult.ok(pagedResult);
    }

    @GetMapping("/bestLists")
    public JSONResult queryAllBestGoods(@RequestParam(defaultValue = "1") Integer pageNum,
                                     @RequestParam(defaultValue = "2") Integer pageSize){
        PagedResult pagedResult = goodsService.queryAllBestGoods(pageNum,pageSize);
        return JSONResult.ok(pagedResult);
    }

    @GetMapping("/goodsDetails/{goodsId}")
    @Transactional
    public JSONResult queryGoodsDetailsById(@PathVariable String goodsId){
        GoodsDetailVo goodsDetailVo = goodsService.queryGoodsDetailsById(goodsId);
       List<GoodsFile> goodsFile = goodsFileService.queryFileById(goodsId);
       goodsDetailVo.setGoodsFileList(goodsFile);
        return JSONResult.ok(goodsDetailVo);
    }

    @GetMapping("/queryHotLists")
    public JSONResult queryAllHotGoods(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "6") Integer pageSize,
                                       @RequestParam( defaultValue = "g.price")String orderBy,
                                       @RequestParam(defaultValue = "1")  Integer orderType
                                       ){
        if(orderType == 1){
        }
        if (orderType == 2){
        }
        PagedResult pagedResult = goodsService.queryAllHotGoodsList(pageNum,pageSize,orderBy,orderType);
        return JSONResult.ok(pagedResult);
    }


}
