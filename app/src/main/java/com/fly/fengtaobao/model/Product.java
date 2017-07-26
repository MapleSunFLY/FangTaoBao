package com.fly.fengtaobao.model;

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
 * 描述: model 实体层 -->  产品实体
 */
public class Product {

    private int productId;
    private String productName;
    private int categoryId;
    private String photoUrl;
    private double unitPrice;
    private String note;

    public Product (){

    }

    public Product(int productId, String productName, int categoryId, String photoUrl, double unitPrice, String note) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.photoUrl = photoUrl;
        this.unitPrice = unitPrice;
        this.note = note;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", categoryId=" + categoryId +
                ", photoUrl='" + photoUrl + '\'' +
                ", unitPrice=" + unitPrice +
                ", note='" + note + '\'' +
                '}';
    }
}
