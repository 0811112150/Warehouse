package com.nyb.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableSpringDataWebSupport
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
