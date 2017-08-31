package com.gayatri.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.gayatri.model.Book;
import com.gayatri.service.BookService;

@Configuration
@ComponentScan(basePackages = "com.gayatri")
public class AppConfig {
	
}
