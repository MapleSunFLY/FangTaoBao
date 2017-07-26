package com.fly.fengtaobao.daompl;

import com.fly.fengtaobao.dao.ICategoryService;
import com.fly.fengtaobao.model.Category;

import java.util.ArrayList;
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
 * Created by FLY on 2017/6/8.
 * 描述: dao接口实现层 --> ICategoryService 实现
 * 接口隔离，松耦合，利扩展
 */

public class CategoryService implements ICategoryService {

    List<Category> categories = new ArrayList<Category>();

    @Override
    public List<Category> getAllCategory() {
        categories.add(new Category(1, "手机"));
        categories.add(new Category(2, "电器"));
        categories.add(new Category(3, "服装 "));
        return categories;
    }

    @Override
    public Category getCategoryById(int cotegoryId) {
        if (categories != null) {
            for (Category c : categories) {
                if (cotegoryId == c.getCategoryId()) {
                    return c;
                }
            }
        }
        return null;
    }
}
