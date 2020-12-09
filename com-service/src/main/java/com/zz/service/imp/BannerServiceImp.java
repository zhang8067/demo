package com.zz.service.imp;

import com.zz.mapper.BannerMapper;
import com.zz.service.BannerService;
import com.zz.vo.BannerVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:15
 **/
@Service
@AllArgsConstructor
public class BannerServiceImp implements BannerService {


    private BannerMapper bannerMapper;

    /**
     * 查询banner列表
     *
     */
    public List <BannerVO> getBannerList() {
        return bannerMapper.getBannerLists();
    }

}
