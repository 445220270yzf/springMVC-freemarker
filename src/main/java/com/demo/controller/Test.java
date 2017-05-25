package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/5/25.
 */
@Controller
@RequestMapping("test")
public class Test {

    @RequestMapping("jsp")
    public String goJsp(ModelMap mm){

        mm.put("msg","This is jsp");
        return "index";
    }

    @RequestMapping("ftl")
    public String goFtl(ModelMap mm){
        mm.put("msg","This is Ftl");
        return "FirstPage";
    }
}
