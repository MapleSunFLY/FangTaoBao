package com.fly.fengtaobao.dao;

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
 * Created by FLY on 2017/6/8.
 * 描述: 接口层 --> 分类操作
 */

public interface ICategoryService {

    /**
     * 获取全部分类
     * @return
     */
    public List<Category> getAllCategory();

    /**
     * 由ID获取分类
     * @param cotegoryId
     * @return
     */
    public Category getCategoryById(int cotegoryId);
}
