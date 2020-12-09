package com.zz.controller;

import com.zz.service.BannerService;
import com.zz.utils.JSONResult;
import com.zz.vo.BannerVO;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class BannerController {

    private final BannerService bannerService;


    /**
     * 查询banner列表
     *
     */
    @GetMapping("/bannerLists")
    public JSONResult listBanner() {
        List <BannerVO> banners = bannerService.getBannerList();
        return JSONResult.ok(banners);
    }
}
