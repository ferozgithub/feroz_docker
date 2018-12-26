package edu.feroz.docker.example.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloRestEndpoint {

	@GetMapping
	public String hello() {
		return "Hello endpoint invoked";
	}
}
