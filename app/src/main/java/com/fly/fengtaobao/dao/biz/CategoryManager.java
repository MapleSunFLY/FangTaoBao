package com.fly.fengtaobao.dao.biz;

import com.fly.fengtaobao.dao.ICategoryService;
import com.fly.fengtaobao.daompl.CategoryService;
import com.fly.fengtaobao.model.Category;

import java.util.List;

/**
 * <pre>
 *           .----.
 *        _.'__    `.
 *    .--(Q)(OK)---/$\
 *  .' @          /$$$\
 *  :         ,   $$$$$
 *   `-..__.-' _.-\$$$/
 *         `;_:    `"'
 *       .'"""""`.
 *      /,  FLY  ,\
 *     //         \\
 *     `-._______.-'
 *     ___`. | .'___
 *    (______|______)
 * </pre>
 * 创建时间 : 2017/7/26
 * <p>
 * 描述: 管理者(逻辑层) --> Category操作的管理者
 */

public class CategoryManager {

    private ICategoryService dao;

    public CategoryManager(){
        dao = new CategoryService();
    }

    public List<Category> getAllCategory(){
        return dao.getAllCategory();
    }

    public Category getCategoryById(int cotegoryId){
        return dao.getCategoryById(cotegoryId);
    }


}
