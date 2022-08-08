package com.duongnv.controller;

import com.duongnv.dto.Student;
import com.duongnv.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class DeMoController {

    @PostMapping("/input")
    @ResponseBody
    public Student demo(@RequestBody Student student) {
        if(student.getName().equals("error")) {
            throw new CustomException("Invalid student name");
        }
        return student;
    }
}
