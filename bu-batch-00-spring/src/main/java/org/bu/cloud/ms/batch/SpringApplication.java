package org.bu.cloud.ms.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringApplication {


    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(SpringApplication.class).web(true).run(args);

        Calculator calc = (Calculator) context.getBean("calculator");
        calc.handleData();
    }


    @Bean("calculator")
    public Calculator calculator() {
        Calculator cal = new Calculator();
        cal.setFirst(100);
        cal.setSecond(25);
        return cal;
    }

}
