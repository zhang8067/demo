package com.zz.service;


import com.zz.vo.BannerVO;

import java.util.List;

public interface BannerService {

    /**
     * 查询banner列表
     *
     */
    List <BannerVO> getBannerList();
}
