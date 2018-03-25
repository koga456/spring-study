package com.example.api;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Member;
import com.example.Message;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@GetMapping
	@ResponseBody
	@CrossOrigin
	Message getMessage(@RequestParam("name") String str) {
		
		System.out.println("Get Start");
		Message message = new Message();
		message.setMessage("こんにちは" + str);
		
		return message;
	}
	
	@PostMapping
	@ResponseBody
	@CrossOrigin
	Message postMessage(@RequestBody Member member) {
		System.out.println("Post Start");
		Message message = new Message();
		message.setMessage("こんにちは" + member.getName());
		
		return message;
    }
}
