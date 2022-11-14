package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Mono;

@Client("https://google.com")
public interface GoogleClient {
	
	@Get("/maps")
	Mono<Void> broken();
	
	@Get("/drive")
	Mono<String> works();
}
