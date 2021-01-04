package cn.dzp.mapper;

import cn.dzp.entity.BookBorrow;

public interface BookBorrowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BookBorrow record);

    int insertSelective(BookBorrow record);

    BookBorrow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BookBorrow record);

    int updateByPrimaryKey(BookBorrow record);
}