package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{



    @GetMapping("/")  //this had been ("/employeeform") in ex 2_03, from which this HomeController and other classes
                        // were borrowed to make this project.  The SecurityConfiguration class of this project 4_02
                        // requires a mapping to the "/" of localhost since that's where it looks once the login is approved
    public String loadFormPage(Model model)
    {
        model.addAttribute("employee", new Employee() );
        return "employeeform";
    }

    @PostMapping("/employeeform")
    public String loadFromPage(@ModelAttribute Employee employee, Model model)
    {
        model.addAttribute("employee", employee);
        return "confirmemployee";

    }

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
}
