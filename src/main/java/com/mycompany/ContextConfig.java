package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ComponentScan("com.mycompany")
public class ContextConfig {
    @Bean
    public Random random(){
        return new Random();
    }

}
