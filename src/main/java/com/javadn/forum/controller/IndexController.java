package com.javadn.forum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")//匹配路经，/ 表示任何路经都不输入的时候默认访问的页面
    public String index(){
        return "index";
    }
}
