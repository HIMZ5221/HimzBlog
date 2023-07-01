package com.blog.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.blog.app.**.mapper")
public class HimzBlogWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HimzBlogWebServiceApplication.class, args);
	}
	
	@GetMapping("/")
	public String login1() {
		return "home/profile";
	}
	@GetMapping("/login")
	public String login2() {
		return "login";
	}
}
