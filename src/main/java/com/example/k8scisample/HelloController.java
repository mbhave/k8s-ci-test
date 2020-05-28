package com.example.k8scisample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Madhura Bhave
 */
@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "hello world!";
	}
}
