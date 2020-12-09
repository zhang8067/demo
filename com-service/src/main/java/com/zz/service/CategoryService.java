package com.zz.service;

import com.zz.utils.PagedResult;

public interface CategoryService {

    //查询首页种类列表
    PagedResult queryAllCategorys(Integer pageNum,Integer pageSize);
}
