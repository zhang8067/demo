package com.zz.mapper;

import com.zz.pojo.Category;
import com.zz.vo.CategoryVO;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 20:57
 **/
public interface CategoryMapper extends BaseMapper<Category> {
    List<CategoryVO> queryAllCategorys();
}
