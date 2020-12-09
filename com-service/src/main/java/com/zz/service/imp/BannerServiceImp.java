package com.zz.service.imp;

import com.zz.mapper.BannerMapper;
import com.zz.pojo.Banner;
import com.zz.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:15
 **/
@Service
public class BannerServiceImp implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    //查询banner列表
    public List <Banner> getBannerList() {
        return bannerMapper.getBannerLists();
    }

}
