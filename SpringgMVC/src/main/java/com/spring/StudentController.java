package com.spring;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

@Controller
@RequestMapping("/students")
public class StudentController {

    /**
     * Method for sting trimming. It cuts spaces if it's in leading and trailing.
     *
     * @param webDataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    /**
     * Method that calls student form, and translate Student's instance in our form
     *
     * @param model
     * @return
     */

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "st-form";
    }



    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student,
                              BindingResult bindingResult, Model model) {

        String[] skills = student.getSkills();
        model.addAttribute("skill", skills);
        System.out.println("Student name: |" + student.getFirstName() + "|");

        System.out.println("Binding results: "+ bindingResult);

        System.out.println("\n\n\n");

        if (bindingResult.hasErrors()) {
            return "st-form";
        } else {
            return "st-conf";
        }
    }
}
