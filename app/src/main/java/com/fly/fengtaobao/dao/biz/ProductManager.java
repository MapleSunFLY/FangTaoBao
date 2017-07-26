package com.fly.fengtaobao.dao.biz;

import com.fly.fengtaobao.dao.IProductService;
import com.fly.fengtaobao.daompl.ProductService;
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
 * 创建时间 : 2017/7/26
 * <p>
 * 描述: 管理者(逻辑层) --> Product操作的管理者
 */

public class ProductManager {

    private IProductService dao;

    public ProductManager() {
        dao = new ProductService();
    }

    public List<Product> getProductByPage(int pageIndex, int pageSize) {
        return dao.getProductByPage(pageIndex, pageSize);
    }

    public List<Product> getProductByName(String productName) {
        return dao.getProductByName(productName);
    }

    public Product getProductById(int productId) {
        return dao.getProductById(productId);
    }

    public boolean addProduct(Product product) throws Exception{
        try {
            dao.insertProduct(product);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean addProduct(int productId, String productName, int categoryId, String photoUrl, double unitPrice, String note) throws Exception {
        Product product = new Product(productId,productName,categoryId,photoUrl,unitPrice,note);
        return this.addProduct(product);
    }

    public boolean modifyProduct(Product product) throws Exception{
        try {
            dao.modifyProduct(product);
            return true;
        }catch (Exception e){
           throw e;
        }
    }

    public boolean modifyProduct(int productId, String productName, int categoryId, String photoUrl, double unitPrice, String note) throws Exception {
        Product p = this.getProductById(productId);
        p.setProductName(productName);
        p.setCategoryId(categoryId);
        p.setPhotoUrl(photoUrl);
        p.setUnitPrice(unitPrice);
        p.setNote(note);
        return this.modifyProduct(p);
    }

    public boolean deleteProduct(int id)throws Exception{
        try {
            dao.deleteProduct(id);
            return true;
        }catch (Exception e){
            throw e;
        }
    }

    public boolean deleteProduct(Product product)throws Exception{
        return this.deleteProduct(product.getProductId());
    }

}
