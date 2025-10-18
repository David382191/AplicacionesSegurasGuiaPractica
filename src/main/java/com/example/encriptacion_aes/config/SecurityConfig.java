/** 

package com.example.encriptacion_aes.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()    // Desactiva la protección CSRF (para pruebas)
                .authorizeHttpRequests()
                .anyRequest().permitAll();  // Permite acceder a cualquier URL sin login
        return http.build();
    }
}*/