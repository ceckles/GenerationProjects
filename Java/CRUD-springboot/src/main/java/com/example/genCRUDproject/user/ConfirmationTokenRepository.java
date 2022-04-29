package com.example.genCRUDproject.user;/*
 * Package: com.example.genCRUDproject.user
 * File:    ConfirmationTokenRepository
 * Author:  chadeckles
 * Date:    6/16/21, 11:35 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.user
 * Info   :
 *
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, Long> {

    Optional<ConfirmationToken> findConfirmationTokenByConfirmationToken(String token);
}

