package io.pivotal.spinnakersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpinnakerBootSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpinnakerBootSampleApplication.class, args);
	}
}

@RestController
class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
}