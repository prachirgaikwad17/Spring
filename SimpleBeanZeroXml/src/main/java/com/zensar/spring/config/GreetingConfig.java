package com.zensar.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      //replacement to xml 
@ComponentScan(basePackages = "com.zensar.spring")
public class GreetingConfig {

}
