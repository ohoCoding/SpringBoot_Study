package com.gominno.www;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // Spring boot 의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
public class Application {
    public static void main (String []args){
        SpringApplication.run(Application.class, args);
    }
}
