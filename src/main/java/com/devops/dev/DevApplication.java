package com.devops.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DevApplication {


   @GetMapping("/devop")
	public String showmessage(){

		return" Willkomen Devops Team";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}

}
