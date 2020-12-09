package com.zz.service;

import com.zz.utils.PagedResult;

public interface CategoryService {
    PagedResult queryAllCategorys(Integer pageNum,Integer pageSize);
}
