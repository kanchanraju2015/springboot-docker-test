package com.briz.springbootdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerExampleApplication.class, args);
	}
	@RequestMapping("/test")
	public String test()
	{
		return "This is docker test";
	}
	@RequestMapping("/docker")
	public String docker()
	{
		return "Hello Mr Docker";
	}
	@RequestMapping("/{name}")
	public String name(@PathVariable String name)
	{
		return "Hello MR !!! "+name;
	}}
