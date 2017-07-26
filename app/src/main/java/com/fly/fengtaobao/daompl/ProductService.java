package com.fly.fengtaobao.daompl;

import com.fly.fengtaobao.dao.IProductService;
import com.fly.fengtaobao.model.Product;

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
 * 描述: dao接口实现层 --> IProductService 实现
 */

public class ProductService implements IProductService {

    private List<Product> productsList = new ArrayList<Product>();

    public ProductService() {

    }

    @Override
    public List<Product> getAllProduct() {
        Product product = new Product(1, "三星 GT-3000", 1,
                "http://img.25pp.com//uploadfile/news/2014/0904/20140904101241764.jpg",
                1880, "操作系统：Android，网络：3G");
        productsList.add(product);

        product = new Product(2, "中兴 1993", 1,
                "http://img3.imgtn.bdimg.com/it/u=1849638377,1202985358&fm=26&gp=0.jpg",
                1900, "操作系统：Android，网络：3G");
        productsList.add(product);

        product = new Product(3, "华为 A4", 1,
                "http://d6.yihaodianimg.com/N07/M08/6E/60/CgQIz1QdIW6ACfT6AAKbNI5uiEg12001.jpg",
                1500, "操作系统：Android，网络：3G");
        productsList.add(product);

        product = new Product(4, "三星 P9", 1,
                "http://img.25pp.com//uploadfile/news/2014/0904/20140904101241764.jpg",
                3200, "操作系统：Android，网络：4G");
        productsList.add(product);

        product = new Product(5, "华为 X4", 1,
                "http://d6.yihaodianimg.com/N07/M08/6E/60/CgQIz1QdIW6ACfT6AAKbNI5uiEg12001.jpg",
                1200, "操作系统：Android，网络：4G");
        productsList.add(product);

        product = new Product(6, "小米 MX7", 1,
                "http://img1.imgtn.bdimg.com/it/u=1857872501,1494729518&fm=26&gp=0.jpg",
                2000, "操作系统：Android，网络：4G");
        productsList.add(product);

        product = new Product(7, "小米 MK9", 1,
                "http://img1.imgtn.bdimg.com/it/u=1857872501,1494729518&fm=26&gp=0.jpg",
                4500, "操作系统：Android，网络：4G");
        productsList.add(product);
        return productsList;
    }

    @Override
    public List<Product> getAllProductByCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Product> getProductByPage(int pageIndex, int pageSize) {
        if (productsList == null) return null;
        if (pageIndex > getPageCount(pageSize)) {
            pageIndex = getPageCount(pageSize);
        }
        if (pageIndex < 1) {
            pageIndex = 1;
        }
        List<Product> productPage = new ArrayList<Product>();
        for (int i = 0; i < pageSize; i++) {
            int listIndex = (pageIndex - 1) * pageSize + i;
            if (listIndex < productsList.size()) {
                productPage.add(productsList.get(listIndex));
            } else {
                return productPage;
            }
        }
        return productPage;
    }

    /**
     * 求取总页数
     *
     * @param pageSize
     * @return
     */
    private int getPageCount(int pageSize) {
        if (productsList == null) return 0;
        int pageCount = productsList.size() / pageSize;
        if ((productsList.size() % pageSize) != 0) {
            pageCount += 1;
        }
        return pageCount;
    }

    @Override
    public List<Product> getProductByName(String productName) {
        if (productsList == null) return null;
        List<Product> nameList = new ArrayList<Product>();
        for (Product p : productsList) {
            if (p.getProductName().indexOf(productName) != -1) {
                nameList.add(p);
            }
        }
        return nameList;
    }

    @Override
    public Product getProductById(int productId) {
        if (productsList == null) return null;
        for (Product p : productsList) {
            if (productId == p.getProductId()) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void insertProduct(Product product) {
        if (productsList != null) {
            this.productsList.add(product);
        }
    }

    @Override
    public void modifyProduct(Product product) {
        for (int i = 0; i < productsList.size(); i++) {
            if (product.getProductId() == productsList.get(i).getProductId()) {
                productsList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void deleteProduct(int Id) {
        Product p = this.getProductById(Id);
        if (p != null) {
            productsList.remove(p);
        }
    }


}
