package cn.itcast.elasticsearch.controller;

import cn.itcast.elasticsearch.pojo.Test;
import cn.itcast.elasticsearch.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {
    @Autowired(required = false)
    private TestService testService;

    @GetMapping("/hai1")
    @ResponseBody
    public Iterable<Test> hai1(){
        //return this.exService.queryByMeid();
        return  this.testService.testQuery();
    }
    @GetMapping("/hai")
    @ResponseBody
    public List<Test> hai(){
        //return this.exService.queryByMeid();
       // List<Page<Test>> h1=this.testService.testDoubleQuery()


      return  this.testService.testDoubleQuery();
    }

   /* public Page<Test> hai(){
        //return this.exService.queryByMeid();
        List<Page<Test>> Lt1 = this.testService.testDoubleQuery();
        for (Page<Test> Pt:Lt1) {
            return Pt;
        }
        return Pt;
    }*/


    /*public String hai(){
        return "successful";
    }*/
}
