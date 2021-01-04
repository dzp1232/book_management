package cn.dzp.entity;

import java.util.Date;

public class Book {
    private Long id;

    private String name;

    private String author;

    private Integer num;

    public Book(){}

    public Book(Long id, String name, String author, Integer num) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.num = num;
    }

    public Book(String name, String author,
                Integer num, String sort) {
        this.name = name;
        this.author = author;
        this.num = num;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", num=" + num +
                ", record=" + record +
                ", sort='" + sort + '\'' +
                ", publicHouse='" + publicHouse + '\'' +
                ", price=" + price +
                ", publicDate=" + publicDate +
                ", main='" + main + '\'' +
                ", prim='" + prim + '\'' +
                ", state=" + state +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    private Date record;

    private String sort;

    private String publicHouse;

    private Integer price;

    private Date publicDate;

    private String main;

    private String prim;

    private Byte state;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getRecord() {
        return record;
    }

    public void setRecord(Date record) {
        this.record = record;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getPublic() {
        return publicHouse;
    }

    public void setPublic(String publicHouse) {
        this.publicHouse = publicHouse == null ? null : publicHouse.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main == null ? null : main.trim();
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim == null ? null : prim.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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