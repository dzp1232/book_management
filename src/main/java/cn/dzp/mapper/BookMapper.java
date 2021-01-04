package cn.dzp.mapper;

import cn.dzp.entity.Book;
import cn.dzp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> getBookList();

    int addBook(Book book);

    void updateBookById(Book book);

    void deleteBookById(long i);

    Book getBookById(Long id);

    //模糊查询
    List<Book> getBookListLike(String name);

    //根据用户名密码查询用户信息
    Book selectBookByIN(@Param("id") Long id, @Param("name") String name);
}