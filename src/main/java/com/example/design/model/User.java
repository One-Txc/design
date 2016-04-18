package com.example.design.model;

import org.springframework.data.annotation.Id;

import java.util.Date;


/**
 * Created by lxh on 4/14/16.
 */
public class User {
    @Id
    private Long id;                // 用户ID
    private String accountName;     // 账户名称
    private String password;        // 用户密码
    private String email;           // 邮箱
    private String nickname;        // 昵称
    private String userPicture;     // 用户头像
    private String name;            // 真实姓名
    private String sex;             // 性别
    private Date birthday;          // 出生日期
    private String job;             // 工作
    private String city;            // 居住城市
    private String userIntro;       // 个人介绍
    private VISITROLE visitrole;    // 其他用户的浏览权限
    private ROLE role;              // 用户权限

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public VISITROLE getVisitrole() {
        return visitrole;
    }

    public void setVisitrole(VISITROLE visitrole) {
        this.visitrole = visitrole;
    }

    private enum ROLE {
        admin, user, guest;
    }

    private enum VISITROLE {
        SELF, FRIEND, ALL
    }
}