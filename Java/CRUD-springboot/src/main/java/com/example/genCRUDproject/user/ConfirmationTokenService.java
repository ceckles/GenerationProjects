package com.example.genCRUDproject.user;/*
 * Package: com.example.genCRUDproject.user
 * File:    ConfirmationTokenService
 * Author:  chadeckles
 * Date:    6/16/21, 11:36 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.user
 * Info   :
 *
 */

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
class ConfirmationTokenService {
    private final ConfirmationTokenRepository confirmationTokenRepository;

    void saveConfirmationToken(ConfirmationToken confirmationToken) {
        confirmationTokenRepository.save(confirmationToken);
    }

    void deleteConfirmationToken(Long id) {
        confirmationTokenRepository.deleteById(id);
    }


    Optional<ConfirmationToken> findConfirmationTokenByToken(String token) {
        return confirmationTokenRepository.findConfirmationTokenByConfirmationToken(token);
    }
}
