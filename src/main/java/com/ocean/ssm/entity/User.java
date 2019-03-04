package com.ocean.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Administrator on 2019/3/4 19:33.
 */
public class User {
    private String name;
    private String username;
    private String password;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" , timezone="GMT+8")
    private Date birthday;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss" , timezone="GMT+8")
    private Date registryTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegistryTime() {
        return registryTime;
    }

    public void setRegistryTime(Date registryTime) {
        this.registryTime = registryTime;
    }
}
