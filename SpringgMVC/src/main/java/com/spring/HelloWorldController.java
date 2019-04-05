package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/processForm2")
    public String procForm(HttpServletRequest request, Model model){
        String name = request.getParameter("stName");
        name = name.toUpperCase();
        String res = "Yo! "+name;
        model.addAttribute("message", res);
        return "helloworld";
    }


}
