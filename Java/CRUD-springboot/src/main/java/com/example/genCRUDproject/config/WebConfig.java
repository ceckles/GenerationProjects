package com.example.genCRUDproject.config;/*
 * Package: com.example.genCRUDproject.config
 * File:    WebConfig
 * Author:  chadeckles
 * Date:    6/16/21, 11:58 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.config
 * Info   :
 *
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebConfig {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

