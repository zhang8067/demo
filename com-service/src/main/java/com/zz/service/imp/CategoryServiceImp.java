package com.zz.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.mapper.CategoryMapper;
import com.zz.service.CategoryService;
import com.zz.utils.PagedResult;
import com.zz.vo.CategoryVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:14
 **/
@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService {


    private final CategoryMapper categoryMapper;

    //查询首页种类列表 pageNum 当前页 页面尺寸
    public PagedResult queryAllCategorys(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
       List<CategoryVO> results = categoryMapper.queryAllCategorys();
        PageInfo<CategoryVO> pageList = new PageInfo<CategoryVO>(results);
        return new PagedResult(pageNum,pageList.getPages(),pageList.getTotal(),pageList.getList());
    }
}
