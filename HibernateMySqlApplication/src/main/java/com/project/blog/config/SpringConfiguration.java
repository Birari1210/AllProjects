package com.project.blog.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.project.blog.entity")
@ComponentScan(basePackages = "com.project.blog.repository")
public class SpringConfiguration {

	

}
