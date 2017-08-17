package com.chapter3;

import com.smart.security.SmartSecurity;

/**
 * Created by wm on 2017/8/17.
 */
public class AppSecurity implements SmartSecurity {
    @Override
    public String getPassword(String userName) {
        //模拟返回从数据库中读取的密码
        return "111111";
    }
}
