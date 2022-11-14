package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

@Controller
public class HelloController {
	
	@Inject GoogleClient client;
	
	@Get("/broken")
	Mono<Void> broken() {
		return client.broken();
	}
	
	@Get("/works")
	Mono<String> works() {
		return client.works();
	}
}
