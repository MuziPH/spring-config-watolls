package com.pluralsight.configservergit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                configure ->
                        configure.anyRequest()
                                .permitAll()
                );
        httpSecurity.csrf(csrf -> csrf.disable());
        return httpSecurity.build();
    }
}
