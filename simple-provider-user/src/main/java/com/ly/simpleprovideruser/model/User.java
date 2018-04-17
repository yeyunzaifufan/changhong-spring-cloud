package com.ly.simpleprovideruser.model;

import com.ly.simpleprovideruser.base.BaseBean;

import java.math.BigDecimal;

public class User extends BaseBean {

    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
