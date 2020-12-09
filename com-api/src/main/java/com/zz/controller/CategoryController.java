package com.zz.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zz.pojo.Category;
import com.zz.service.CategoryService;
import com.zz.utils.JSONResult;
import com.zz.utils.PagedResult;
import com.zz.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 21:19
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    //查询首页种类列表
    @GetMapping("/categoryLists")
    public JSONResult getCategoryLists(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize){
        PagedResult pagedResult = categoryService.queryAllCategorys(pageNum,pageSize);
        return JSONResult.ok(pagedResult);
    }

}
