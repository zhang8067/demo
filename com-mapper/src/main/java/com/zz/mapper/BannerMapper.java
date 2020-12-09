package com.zz.mapper;

import com.zz.pojo.Banner;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 20:56
 **/
@Component
public interface BannerMapper extends BaseMapper<Banner> {
    List <Banner> getBannerLists();
}
