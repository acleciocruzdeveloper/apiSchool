package com.api.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(value = "/alunos")
    public String listAlunos(){
        return "Todos alunos";
    }
}