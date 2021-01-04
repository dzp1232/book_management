package cn.dzp.entity;

import java.util.Date;

public class User {
    public User(){ }

    public  User(long id,String name,String pwd,String sex){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
        this.sex=sex;
    }

    public User(long id,String name,String pwd,String sex,byte
            age,int integrity,boolean isAdministrator,String phone) {
        this.id=id;
        this.name=name;
        this.pwd=pwd;
        this.sex=sex;
        this.age=age;
        this.integrity=integrity;
        this.isAdministrator=isAdministrator;
        this.phone=phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", integrity=" + integrity +
                ", isAdministrator=" + isAdministrator +
                ", phone='" + phone + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    private Long id;

    private String name;

    private String sex;

    private Byte age;

    private Integer integrity;

    private Boolean isAdministrator;

    private String phone;

    private Date gmtCreate;

    private  String pwd;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Integer getIntegrity() {
        return integrity;
    }

    public void setIntegrity(Integer integrity) {
        this.integrity = integrity;
    }

    public Boolean getIsAdministrator() {
        return isAdministrator;
    }

    public void setIsAdministrator(Boolean isAdministrator) {
        this.isAdministrator = isAdministrator;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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