package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 1 level controll mapping.
 */
@Controller
@RequestMapping("/hello")
public class SilyController {

    @RequestMapping("/showForm")
    public String displayForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm3")
    public String procForm3(@RequestParam("stName") String name, Model model){
        name = name.toUpperCase();
        String res = "Hey My Friend! "+ name;
        model.addAttribute("message", res);
        return "helloworld";
    }
}
