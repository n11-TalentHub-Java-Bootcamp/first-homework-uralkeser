package dto;


import entity.Category;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDetailDto {

    private String productName;
    private String productCategoryName;
    private BigDecimal productPrice;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String phoneNumber;
    private String comment;
    private Date commentDate;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategoryName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategoryName = productCategory;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public ProductCommentDetailDto(String productName, String productCategoryName, BigDecimal productPrice, String userName, String userSurname, String userEmail, String phoneNumber, String comment, Date commentDate) {
        this.productName = productName;
        this.productCategoryName = productCategoryName;
        this.productPrice = productPrice;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "ProductDetailDto{" +
                "urunAdi='" + productName + '\'' +
                ", kategoriAdi=" + productCategoryName +
                ", fiyat=" + productPrice +
                ", kullaniciAdi='" + userName + '\'' +
                ", kullaniciSoyadi='" + userSurname + '\'' +
                ", kullaniciEmail='" + userEmail + '\'' +
                ", kullaniciNumarası='" + phoneNumber + '\'' +
                ", yorum='" + comment + '\'' +
                ", yorumTarihi=" + commentDate +
                '}';
    }
}


