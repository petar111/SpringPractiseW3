package com.team.spring.practiseapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages="com.team.spring.practiseapp")
@EnableWebMvc
public class MvcConfiguration{
}
