package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FileUploadController {

    @RequestMapping("/file")

    public String file(){
        System.out.print("================请求路径===跳转file页面====="+"\n");
        return "file";

    }


}

