package com.chapter3;

import com.annotation.Action;
import com.annotation.Controller;
import com.common.Param;
import com.response.Data;

/**
 * Created by wm on 2017/8/17.
 */
@Controller
public class SecurityTest {

    @Action("GET:/")
    public Data index(Param param) {
        Data data = new Data();
//        data.setModel(list);
        data.setModel("这是首页====");
        return data;
    }

    @Action("GET:/login")
    public Data login(Param param) {
        Data data = new Data();
//        data.setModel(list);
        data.setModel("这是登录页面(没有验证的时候)====");
        return data;
    }

    @Action("GET:/customer/narmal")
    public Data narmal(Param param) {
        Data data = new Data();
//        data.setModel(list);
        data.setModel("这是正常请求应该验证====");
        return data;
    }




}
