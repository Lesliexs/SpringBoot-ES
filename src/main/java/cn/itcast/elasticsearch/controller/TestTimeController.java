package cn.itcast.elasticsearch.controller;


import cn.itcast.elasticsearch.pojo.OrderImes;
import cn.itcast.elasticsearch.pojo.Register;
import cn.itcast.elasticsearch.service.TestTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class TestTimeController {
    @Autowired(required = false)
    private TestTimeService testTimeService;
    @GetMapping("/time")
    @ResponseBody
    public List<Register> hai(){
        //return this.exService.queryByMeid();
        // List<Page<Test>> h1=this.testService.testDoubleQuery()
        Timestamp d1 = new Timestamp(System.currentTimeMillis());
        List<Register> Li=this.testTimeService.testTimeQuery();
        Timestamp d2 = new Timestamp(System.currentTimeMillis());
        System.out.println(d2.getTime()-d1.getTime());
        return  Li;







    }

    @GetMapping("/time1")
    @ResponseBody
    public Page<OrderImes> hai1() {
        Timestamp d1 = new Timestamp(System.currentTimeMillis());
        Page<OrderImes> Li = this.testTimeService.testQuery();
        Timestamp d2 = new Timestamp(System.currentTimeMillis());
        System.out.println(d2.getTime() - d1.getTime());
        return Li;
    }

}
