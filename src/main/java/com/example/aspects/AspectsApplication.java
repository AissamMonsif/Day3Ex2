package com.example.aspects;

import com.example.aspects.config.Config;
import com.example.aspects.timer.Timer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectsApplication {

    public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Timer timer = context.getBean("timer", Timer.class);

		timer.waitSeconds(3);
    }


}
