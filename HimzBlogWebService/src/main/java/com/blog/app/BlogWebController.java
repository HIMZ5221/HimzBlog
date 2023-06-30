package com.blog.app;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class BlogWebController {
	
	@GetMapping("mainPage")
	public String mainPage() {
		return "/home/profile";
	}
	
	@GetMapping("email")
	public String email() {
		return "/home/email";
	}
}
