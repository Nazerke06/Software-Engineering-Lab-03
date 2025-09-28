package com.example.Lab_3.controllers;

import com.example.Lab_3.models.Student;
import com.example.Lab_3.services.StudentLists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController{

    @Autowired
    private StudentLists studentLists;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("items", studentLists.getAllItems());
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        studentLists.addStudent(new Student(
                student.getId(),
                student.getName(),
                student.getSurname(),
                student.getExam()
        ));
        return "redirect:/";
    }

}
