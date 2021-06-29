package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Classe controlada pelo Spring
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody //
	public String hello() {
		return "Hello World!";
	}

}
