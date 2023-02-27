package com.api.school.service;

import com.api.school.model.StudentModel;
import com.api.school.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public StudentModel registryStudent(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

}
