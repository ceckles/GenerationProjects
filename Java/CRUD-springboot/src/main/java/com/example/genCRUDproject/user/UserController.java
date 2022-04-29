package com.example.genCRUDproject.user;/*
 * Package: com.example.genCRUDproject.user
 * File:    UserController
 * Author:  chadeckles
 * Date:    6/16/21, 12:08 PM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.user
 * Info   :
 *
 */

import com.example.genCRUDproject.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final ConfirmationTokenService confirmationTokenService;

    @GetMapping("/sign-in")
    String signIn() {
        return "sign-in";
    }

    @GetMapping("/sign-up")
    String signUpPage(User user) {
        return "sign-up";
    }

    @GetMapping("/dashboard")
    String dashboardPage(User user){
        return "dashboard";
    }

    @PostMapping("/sign-up")
    String signUp(@Valid User user) {
        userService.signUpUser(user);
        return "redirect:/sign-in";
    }

    @PostMapping("/sign-in")
    String signIn(User user){
        //userService.
        return "sign-in";
    }

    @GetMapping("/sign-up/confirm")
    String confirmMail(@RequestParam("token") String token) {
        Optional<ConfirmationToken> optionalConfirmationToken = confirmationTokenService.findConfirmationTokenByToken(token);
        optionalConfirmationToken.ifPresent(userService::confirmUser);
        return "redirect:/sign-in";
    }
}
