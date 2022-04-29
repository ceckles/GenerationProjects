package com.example.genCRUDproject.user;/*
 * Package: com.example.genCRUDproject.user
 * File:    EmailService
 * Author:  chadeckles
 * Date:    6/16/21, 11:54 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.user
 * Info   :
 *
 */

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailSenderService {

    private JavaMailSender javaMailSender;

    @Async
    public void sendEmail(SimpleMailMessage email) {
        javaMailSender.send(email);
    }
}
