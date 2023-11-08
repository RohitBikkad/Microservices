package com.mybank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "card-service")
public interface CardApiClient {

	@GetMapping("/api/card/{accountNumber}")
	public CardResponseDto getCard(@PathVariable long accountNumber);
}