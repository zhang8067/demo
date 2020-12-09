package com.zz.controller;

import com.zz.pojo.Banner;
import com.zz.service.BannerService;
import com.zz.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:19
 **/
@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;
    @GetMapping("/bannerLists")
    public JSONResult listBanner() {
        List <Banner> banners = bannerService.getBannerList();
        return JSONResult.ok(banners);
    }
}
