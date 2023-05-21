package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController{
	
	@GetMapping("/login")
	public String getHello() {
		//hello.htmlに画面遷移
		return "login";
	}
}