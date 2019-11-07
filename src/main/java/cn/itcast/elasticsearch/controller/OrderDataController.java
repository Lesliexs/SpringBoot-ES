package cn.itcast.elasticsearch.controller;

import cn.itcast.elasticsearch.service.OrderDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderDataController {
    @Autowired
    private  OrderDataService orderDataService;
    @GetMapping("/OrderData")
    @ResponseBody
    public String orderData(){
        return this.orderDataService.testSubAgg();
    }

}
