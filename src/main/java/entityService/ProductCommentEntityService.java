package entityService;

import dao.ProductCommentDao;
import dto.ProductCommentCountDto;
import dto.ProductCommentDetailDto;
import dto.UserCommentDto;
import entity.ProductComment;

import java.util.List;

public class ProductCommentEntityService {
    private ProductCommentDao productCommentDao = new ProductCommentDao();

    public ProductCommentEntityService(){
        productCommentDao = new ProductCommentDao();
    }

    public List<ProductComment> findAll(){
        return productCommentDao.findAll();
    }

    public List<ProductCommentDetailDto> findAllProductCommentsByProductId(Long id) {
        return productCommentDao.findAllProductCommentsByProductId(id);
    }

    public List<ProductCommentCountDto> findAllProductCommentsCount(){
        return productCommentDao.findAllProductCommentsCount();
    }

    public List<UserCommentDto> findAllProductCommentsByUserId(Long id) {
        return productCommentDao.findAllProductCommentsByUserId(id);
    }

}
