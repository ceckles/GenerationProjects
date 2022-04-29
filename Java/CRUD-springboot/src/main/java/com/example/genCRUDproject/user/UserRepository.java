package com.example.genCRUDproject.user;/*
 * Package: com.example.genCRUDproject.user
 * File:    UserRepository
 * Author:  chadeckles
 * Date:    6/16/21, 11:19 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.user
 * Info   :
 *
 */

import com.example.genCRUDproject.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
