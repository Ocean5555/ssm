package com.ocean.ssm.service;

import com.ocean.ssm.entity.User;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/4 19:44.
 */
@Service
public class UserService {

    public User findUserByName(String name) {
        if(name.equals("admin")){
            User user = new User();
            user.setName("admin");
            user.setUsername("preference");
            user.setPassword("asdqwe123");
            user.setAge(27);
            user.setSalary(3000.00f);
            Date birthday = null;
            try {
                birthday = new SimpleDateFormat("yyyy-MM-dd").parse("1992-05-17");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            user.setBirthday(birthday);
            user.setRegistryTime(new Date());
            return user;
        }else {
            return null;
        }

    }
}
