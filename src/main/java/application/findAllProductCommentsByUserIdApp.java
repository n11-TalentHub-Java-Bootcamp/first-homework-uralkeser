package application;

import dto.UserCommentDto;
import entityService.ProductCommentEntityService;

import java.util.List;

public class findAllProductCommentsByUserIdApp {
    public static void main(String[] args) {
        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<UserCommentDto> result =  productCommentEntityService.findAllProductCommentsByUserId(10L);

        for (UserCommentDto userCommentDto : result) {
            System.out.println(userCommentDto);
        }

    }
}
