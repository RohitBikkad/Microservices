package com.mybank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/card")
public class CardController {
	
	@Autowired
	private CardRepository cardRepo;
	
	@GetMapping("/{accountNumber}")
	public CardResponseDto getCard(@PathVariable long accountNumber) {
		Card card = cardRepo.findByAccountNumber(accountNumber).get();
		CardResponseDto cardResponseDto = new CardResponseDto();
		cardResponseDto.setCard(card);
		return cardResponseDto;
	}
}