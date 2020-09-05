package com.wzj.hivue;

import com.wzj.hivue.aspect.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.wzj.hivue"})
public class HivueApplication {
    @Bean(name="myAspect")
    public MyAspect initMyAspect(){
        return new MyAspect();
    }
    public static void main(String[] args) {
        SpringApplication.run(HivueApplication.class, args);
    }

}
