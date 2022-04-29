package com.example.genCRUDproject.user;/*
 * Package: com.example.genCRUDproject.user
 * File:    ConfirmationToken
 * Author:  chadeckles
 * Date:    6/16/21, 11:27 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.user
 * Info   : create Token and unique link for user registration
 *
 */

import com.example.genCRUDproject.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class ConfirmationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String confirmationToken;

    private LocalDate createdDate;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    ConfirmationToken(User user) {
        this.user = user;
        this.createdDate = LocalDate.now();
        this.confirmationToken = UUID.randomUUID().toString();
    }
}
