package com.Kajanthan.MyWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String greet()
    {
        return "Hello Kajanthan";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "About section";
    }
}
