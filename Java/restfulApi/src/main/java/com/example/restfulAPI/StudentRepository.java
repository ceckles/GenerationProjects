package com.example.restfulAPI;/*
 * Package: com.example.restfulAPI
 * File:    StudentRepository
 * Author:  chadeckles
 * Date:    6/15/21, 1:54 PM
 * Project: restfulAPI
 * Package: com.example.restfulAPI
 * Info   :
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findStudentByEmail(String email);
}
