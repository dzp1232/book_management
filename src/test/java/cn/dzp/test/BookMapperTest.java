package cn.dzp.test;

import cn.dzp.entity.Book;
import cn.dzp.entity.User;
import cn.dzp.mapper.BookMapper;
import cn.dzp.mapper.UserMapper;
import cn.dzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BookMapperTest {
    @Test
    public void testSelect(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<Book> bookList = bookMapper.getBookList();
        for (Book book:bookList){
            System.out.println(book.toString());
        }
    }
    @Test
    public void testSelectOne(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book book= bookMapper.getBookById(2L);
        System.out.println(book.toString());
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        bookMapper.updateBookById(new Book(6L,"吞噬星空","我爱西红柿",3));
        // 提交事务
        System.out.println("已更新");
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testDelete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        bookMapper.deleteBookById(7L);
        System.out.println("已删除！");
        // 提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book book=new Book("斗破苍穹","天蚕土豆",22, "玄幻小说");
       bookMapper.addBook(book);
        System.out.println("已增加！");
        // 提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    //根据id和书名查询书籍数据
    public void selectUserByNP(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book book = bookMapper.selectBookByIN(1L,"狂人日记");
        System.out.println(book);

    }
    @Test
    //模糊查询
    public void testLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = bookMapper.getBookListLike("%app%");
        for(Book book:books){
            System.out.println(book);
        }
        sqlSession.close();
    }
}
