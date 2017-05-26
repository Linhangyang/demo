package com.linable.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HangYang.Lin
 *         on 2017/5/9.
 */
@SpringBootApplication
public class LinableApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(LinableApplication.class);
        application.run(args);
    }

}
