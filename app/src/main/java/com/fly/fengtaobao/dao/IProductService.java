package com.fly.fengtaobao.dao;

import com.fly.fengtaobao.model.Product;

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
 * 描述: 接口层 --> 商品操作
 */

public interface IProductService {
    /**
     * 获取所有商品
     * @return
     */
    public List<Product> getAllProduct();

    /**
     * 获取所有同类型商品
     * @param categoryId
     * @return
     */
    public List<Product> getAllProductByCategory(int categoryId);

    /**
     * 分页获取商品
     * @param pageIndex 页数 首页为1
     * @param pageSize 每页数据条数
     * @return 返回当前页数数据
     */
    public List<Product> getProductByPage(int pageIndex,int pageSize);

    /**
     * 根据商品名称获取商品列表
     * @param productName
     * @return
     */
    public List<Product> getProductByName(String productName);

    /**
     * 根据商品ID获取商品
     * @param productId
     * @return
     */
    public Product getProductById(int productId);

    /**
     * 添加商品
     * @param product
     */
    public void insertProduct(Product product);

    /**
     * 修改商品信息
     * @param product
     */
    public void modifyProduct(Product product);

    /**
     * 删除商品
     * @param productId
     */
    public void deleteProduct(int productId);
}
