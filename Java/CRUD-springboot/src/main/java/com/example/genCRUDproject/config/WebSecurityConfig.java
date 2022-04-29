package com.example.genCRUDproject.config;/*
 * Package: com.example.genCRUDproject.config
 * File:    WebSecurityConfig
 * Author:  chadeckles
 * Date:    6/16/21, 11:59 AM
 * Project: gen-CRUD-project
 * Package: com.example.genCRUDproject.config
 * Info   :
 *
 */

import com.example.genCRUDproject.entity.UserRole;
import com.example.genCRUDproject.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@AllArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //this section was a HUGE....HUGE pain in the rear!! be careful you will lock everything down even images!
            http
                .authorizeRequests()
                    .antMatchers("/sign-up/**", "/sign-in/**","/dashboard/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/sign-in")
                    .defaultSuccessUrl("/dashboard")
                    .permitAll()
                .and()
                    .logout()
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/sign-in")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID");
    }

    //workaround to allow access when not logged in to image, css and the h2-console
    @Override
    public void configure(WebSecurity web) throws Exception {
        //removed h2-console from the restricted list so I can get access to it without being logged in!!!
        web
                .ignoring()
                .antMatchers("/h2-console/**","/*.css", "/*.jpg", "/*.svg");
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(bCryptPasswordEncoder);
    }

}
