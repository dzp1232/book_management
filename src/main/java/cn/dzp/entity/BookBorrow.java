package cn.dzp.entity;

import java.util.Date;

public class BookBorrow {
    private Long id;

    private String name;

    private Long userId;

    private Long bookId;

    private Date borrowDate;

    @Override
    public String toString() {
        return "BookBorrow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", borrowDate=" + borrowDate +
                ", expectReturnDate=" + expectReturnDate +
                ", returnDate=" + returnDate +
                ", isOverdue=" + isOverdue +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    private Date expectReturnDate;

    private Date returnDate;

    private Byte isOverdue;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getExpectReturnDate() {
        return expectReturnDate;
    }

    public void setExpectReturnDate(Date expectReturnDate) {
        this.expectReturnDate = expectReturnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Byte getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(Byte isOverdue) {
        this.isOverdue = isOverdue;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}