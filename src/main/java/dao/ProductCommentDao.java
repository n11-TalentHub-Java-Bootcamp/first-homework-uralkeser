package dao;

import base.BaseDao;
import dto.ProductCommentCountDto;
import dto.ProductCommentDetailDto;
import dto.UserCommentDto;
import entity.ProductComment;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductCommentDao extends BaseDao {

    public List<ProductComment> findAll() {

        Query query = getCurrentSession().createQuery(
                "select productComment from ProductComment productComment");

        return query.list();
    }

    public List<ProductCommentDetailDto> findAllProductCommentsByProductId(Long id) { //returns all product comments of a product by given product id
        String sql = " select new dto.ProductCommentDetailDto( p.name, p.category.name, p.price, u.name, u.surname, u.email, u.phoneNumber, pc.comment, pc.commentDate)" +
                " from ProductComment pc" +
                " INNER JOIN Product p ON pc.productId.id = p.id " +
                " INNER JOIN User u ON pc.userId.id = u.id  " +
                " WHERE p.id = :id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }

    public List<ProductCommentCountDto> findAllProductCommentsCount() { //returns all product comments count of all products
        String sql = " select new dto.ProductCommentCountDto(p.id, p.name, p.price, COUNT(p.id))" +
                " from ProductComment pc" +
                " INNER JOIN Product p ON pc.productId.id = p.id " +
                " GROUP BY p.id ";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }

    public List<UserCommentDto> findAllProductCommentsByUserId(Long id) { // returns all product comments of a user by given user id
        String sql =" select new dto.UserCommentDto( u.id, u.name, p.name, pc.comment, pc.commentDate ) " +
                    " from ProductComment pc " +
                    " INNER JOIN Product p ON pc.productId.id = p.id " +
                    " INNER JOIN User u ON pc.userId.id = u.id " +
                    " WHERE u.id = :id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }
}