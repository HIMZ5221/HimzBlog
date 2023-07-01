package com.blog.app;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class BlogWebController {
	
	//linux 기반에서는 return 맨 앞에 / 을 붙히면 인식못한다
	
	@GetMapping("/mainPage")
	public String mainPage() {
		return "home/profile";
	}
	
	@GetMapping("/email")
	public String email() {
		return "home/email";
	}
}
