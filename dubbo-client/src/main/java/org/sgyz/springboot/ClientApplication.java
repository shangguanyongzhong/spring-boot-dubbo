package org.sgyz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by P0093203 on 2017/4/26.
 */
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        ConsumerService consumerService= run.getBean(ConsumerService.class);
                consumerService.printMessage();

    }
}