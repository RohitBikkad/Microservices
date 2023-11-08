package com.mybank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepo;
	@Autowired
	private LoanApiClient loanApiClient;
	@Autowired
	private CardApiClient cardApiClient;

	@GetMapping("/{accountNumber}")
	public AccountResponseDto accounts(@PathVariable long accountNumber) {
		Account account = accountRepo.findByAccountNumber(accountNumber).get();
		LoanResponseDto responseLoanDto = loanApiClient.getLoan(accountNumber);
		CardResponseDto cardResponseDto = cardApiClient.getCard(accountNumber);
		
		

		AccountResponseDto accountResponseDto = new AccountResponseDto();
		accountResponseDto.setAccount(account);
		accountResponseDto.setLoanResponseDto(responseLoanDto);
		accountResponseDto.setCardResponseDto(cardResponseDto);
		return accountResponseDto;
	}
//	
//	@Autowired
//	private AccountRepository accountRepository;
//	
//	@GetMapping("/{accountNumber}")
//	public AccountResponseDto accounts(@PathVariable long accountNumber) {
//		Account account = accountRepository.findByAccountNumber(accountNumber).get();
//		
//		 AccountResponseDto accountResponseDto = new AccountResponseDto();
//		 
//		accountResponseDto.setAccount(account);
//		 return accountResponseDto;
//	}

}
