package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {


    /**
     * Showing form
     * @return
     */
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    /**
     * Process value in form wen pressing submit
     * @return
     */
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }





}
