package com.example.restfulAPI;/*
 * Package: com.example.restfulAPI
 * File:    StudentService
 * Author:  chadeckles
 * Date:    6/15/21, 1:53 PM
 * Project: restfulAPI
 * Package: com.example.restfulAPI
 * Info   :
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){

        return studentRepository.findAll();
    }
    public Student getStudent(Long studentId){
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException("Student not found"));
        return student;
    }

    public void addStudent(Student student){
        Optional<Student> studenOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studenOptional.isPresent()){
            throw new IllegalStateException("Student already exists");
        }

        //Adding a password hash to user Testing
        String rawPassword = student.getPassword();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(rawPassword);
        student.setPassword(encodePassword);
        //System.out.println(encodePassword);
        System.out.println(student.getDecodedPassword());

        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean exists = studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("student with id not found");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email, LocalDate dob, String password){
        //Get Student if exist and change data if differs
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException("Student not found"));
        if(!student.getName().equals(name) && name.length() > 0){ student.setName(name);}
        if(!student.getEmail().equals(email) && email.length() > 0){ student.setEmail(email);}
        //if(!student.getDob().equals(dob) && !name.equals("")){ student.setDob(dob);}

        student.setName(name);
    }
}
