package cn.itcast.elasticsearch.controller;

import cn.itcast.elasticsearch.pojo.Item;
import cn.itcast.elasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@Controller
public class HelloController {
    @Autowired(required = false)
    private UserService userService;

   /* @GetMapping("hello")
    public ResponseEntity<List<Item>> hello(){
       return ResponseEntity.ok(this.userService.queryByPriceBetween());
    }*/
    /*@GetMapping("hello")
    @ResponseBody
    public List<Item> hello(){
       return this.userService.queryByPriceBetween();
    }*/
    @GetMapping("hello")
    public List<Item> hello(){
        return this.userService.queryByPriceBetween();
    }
}
