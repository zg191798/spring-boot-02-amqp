package com.atguigu.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1.RabbitAutoConfiguration
 * 2.RabbitProperties封装了
 */
@EnableRabbit  // 开启基于注解的RabbitMQ模式
@SpringBootApplication
public class SpringBoot02AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02AmqpApplication.class, args);
    }

}

