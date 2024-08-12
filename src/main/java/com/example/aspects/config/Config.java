package com.example.aspects.config;

import com.example.aspects.timer.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.example.aspects.annotations","com.example.aspects.aspect","com.example.aspects.timer"})
public class Config {
    @Bean
    public Timer timer() {
        return new Timer();
    }
}
