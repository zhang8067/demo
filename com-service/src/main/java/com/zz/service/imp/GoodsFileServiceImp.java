package com.zz.service.imp;

import com.zz.mapper.GoodsFileMapper;
import com.zz.pojo.GoodsFile;
import com.zz.service.GoodsFileService;
import com.zz.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/8 22:51
 **/
@Service
public class GoodsFileServiceImp implements GoodsFileService {

    @Autowired
    private GoodsFileMapper goodsFileMapper;

    //通过goodsId获得附件
    public List<GoodsFile> queryFileById(String goodsId) {
        return goodsFileMapper.queryFileById(goodsId);
    }
}
