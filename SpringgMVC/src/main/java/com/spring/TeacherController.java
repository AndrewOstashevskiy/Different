package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    @RequestMapping("/showFormT")
    public String showForm(Model model){
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "teacher-form";
    }

    @RequestMapping("/ProcessTeacherForm")
    public String ProcessTeacherForm(@ModelAttribute("teacher") Teacher teacher){
        return "teacher-conform";
    }
}
