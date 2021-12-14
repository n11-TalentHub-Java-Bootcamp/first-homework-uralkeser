package dto;

import java.util.Date;

public class UserCommentDto {

    private Long userId;
    private String userName;
    private String productName;
    private String productComment;
    private Date productCommentDate;

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
                ", kullaniciName='" + userName + '\'' +
                ", urunName='" + productName + '\'' +
                ", urunComment='" + productComment + '\'' +
                ", urunCommentDate=" + productCommentDate +
                '}';
    }
}
