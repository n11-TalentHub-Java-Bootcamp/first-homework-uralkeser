package application;

import dto.ProductCommentCountDto;
import entityService.ProductCommentEntityService;

import java.util.List;

public class findAllProductCommentsCountApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();

        List<ProductCommentCountDto> result =  productCommentEntityService.findAllProductCommentsCount();

        for (ProductCommentCountDto productCommentCountDto : result) {
            System.out.println(productCommentCountDto);
        }

    }
}
