package com.thymeleaf.demo.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class User {
    private int id;//标识符
    private String username;
    private String password;
    private String telphone;
    private Date registerTime;
    /**
     * 权限（0：管路员；1：普通用户）
     */
    private int popedom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getPopedom() {
        return popedom;
    }

    public void setPopedom(int popedom) {
        this.popedom = popedom;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telphone='" + telphone + '\'' +
                ", registerTime=" + registerTime +
                ", popedom=" + popedom +
                '}';
    }
}
