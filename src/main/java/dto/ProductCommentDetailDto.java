package dto;


import entity.Category;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDetailDto {
    private String productName;
    private Category productCategory;
    private BigDecimal productPrice;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String phoneNumber;
    private String comment;
    private Date commentDate;
    public ProductCommentDetailDto(){

    }

    public ProductCommentDetailDto(String productName, Category productCategory, BigDecimal productPrice, String userName, String userSurname, String userEmail, String phoneNumber, String comment, Date commentDate) {
        this.productName = productName;
        this.productCategory = productCategory;
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
                ", kategori=" + productCategory +
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


