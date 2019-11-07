package cn.itcast.elasticsearch.controller;

import cn.itcast.elasticsearch.service.RegisterService;
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @GetMapping("/Register")
    @ResponseBody
    public String register(){
        return this.registerService.testAgg();
    }
}
