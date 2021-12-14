package dto;

import java.util.Date;

public class UserCommentDto {

    private Long userId;
    private String userName;
    private String productName;
    private String productComment;
    private Date productCommentDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductComment() {
        return productComment;
    }

    public void setProductComment(String productComment) {
        this.productComment = productComment;
    }

    public Date getProductCommentDate() {
        return productCommentDate;
    }

    public void setProductCommentDate(Date productCommentDate) {
        this.productCommentDate = productCommentDate;
    }

    public UserCommentDto(Long userId, String userName, String productName, String productComment, Date productCommentDate) {
        this.userId = userId;
        this.userName = userName;
        this.productName = productName;
        this.productComment = productComment;
        this.productCommentDate = productCommentDate;
    }

    @Override
    public String toString() {
        return "UserCommentDto{" +
                "kullaniciId=" + userId +
                ", kullaniciAdi='" + userName + '\'' +
                ", urunAdi='" + productName + '\'' +
                ", urunYorum='" + productComment + '\'' +
                ", urunYorumTarihi=" + productCommentDate +
                '}';
    }
}
