package application;

import dto.ProductCommentDetailDto;
import entityService.ProductCommentEntityService;

import java.util.List;

public class findAllProductCommentsByProductIdApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<ProductCommentDetailDto> result =  productCommentEntityService.findAllProductCommentsByProductId(10L);

        for (ProductCommentDetailDto productCommentDetailDto : result) {
            System.out.println(productCommentDetailDto);
        }

    }
}
