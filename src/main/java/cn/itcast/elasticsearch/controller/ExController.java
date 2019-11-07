package cn.itcast.elasticsearch.controller;

import cn.itcast.elasticsearch.pojo.JtSelfRegisterDay;
import cn.itcast.elasticsearch.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ExController {
    @Autowired(required = false)
    private ExService exService;
    @GetMapping("hello1")
    @ResponseBody
    public List<JtSelfRegisterDay> hello1(){
        //return this.exService.queryByMeid();
        return this.exService.queryByCityAndMonth();
    }

    @GetMapping("hello2")
    @ResponseBody
    public Iterable<JtSelfRegisterDay> hello2(){
        //return this.exService.queryByMeid();
        return this.exService.testQuery();
    }

    @GetMapping("hello3")
    @ResponseBody
    public Page<JtSelfRegisterDay> hello3(){
        //return this.exService.queryByMeid();
        return this.exService.testNativeQuery();
    }

    @GetMapping("hello4")
    @ResponseBody
    public Page<JtSelfRegisterDay> hello4(){
        //return this.exService.queryByMeid();
        return this.exService.testSort();
    }
}
