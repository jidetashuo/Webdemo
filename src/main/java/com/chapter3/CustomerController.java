package com.chapter3;

import com.annotation.Action;
import com.annotation.Controller;
import com.annotation.Inject;
import com.chapter2.service.CustomerService;
import com.common.Param;
import com.helper.ServletHelper;
import com.response.Data;

/**
 * Created by wm on 2017/8/6.
 */
@Controller
public class CustomerController {

    @Inject
    CustomerService customerService;

    @Action("GET:/list")
    public Data list(Param param) {
        ServletHelper.setRequestAttribute("zhangsan", "zhangsa");
        //System.out.println(String.valueOf(ServletHelper.getRequestAddtribute("zhangsan")));
//        List<Customer> list = customerService.getList();
        Data data = new Data();
//        data.setModel(list);
        data.setModel(customerService.test());
        return data;
    }


}
