package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ProductDAO;
import pojo.Product;

public class UpdateDataAction extends ActionSupport {
    Integer productId;
    String productName;
    String productCategory;
    Integer productPrice;
    String createdDate;

    public String execute(){

        Product product = ProductDAO.getProductById(productId);
        productId = product.getProductId();
        productName = product.getProductName();
        productCategory = product.getProductCategory();
        productPrice = product.getProductPrice();
        createdDate = product.getCreatedDate();

        return "success";
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
