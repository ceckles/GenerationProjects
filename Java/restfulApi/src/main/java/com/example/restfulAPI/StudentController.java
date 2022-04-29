package com.example.restfulAPI;/*
 * Package: com.example.restfulAPI
 * File:    StudentController
 * Author:  chadeckles
 * Date:    6/15/21, 1:53 PM
 * Project: restfulAPI
 * Package: com.example.restfulAPI
 * Info   :
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentservice){
        this.studentService = studentservice;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("{id}")
    public Student getStudent(@PathVariable("id") Long id){
        return studentService.getStudent(id);
    }

    @PostMapping
    public void registerStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("{studentId}")
    public void removeStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required=false) String name,
                              @RequestParam(required=false) String email,
                              @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob, @RequestParam(required=false) String password){
        studentService.updateStudent(studentId,name, email, dob, password);
    }
}
