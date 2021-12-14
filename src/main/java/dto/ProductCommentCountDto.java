package dto;

import java.math.BigDecimal;

public class ProductCommentCountDto {

    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private BigDecimal productCommentCount;

    public ProductCommentCountDto(Long productId, String productName, BigDecimal productPrice, BigDecimal productCommentCount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCommentCount = productCommentCount;
    }

    @Override
    public String toString() {
        return "ProductCommentCountDto{" +
                "urunId=" + productId +
                ", urunAdi='" + productName + '\'' +
                ", urunFiyati=" + productPrice +
                ", urunYorumSayisi=" + productCommentCount +
                '}';
    }

}
