package com.mybank;

public class AccountResponseDto {
	private Account account;
	private LoanResponseDto loanResponseDto;
	private CardResponseDto cardResponseDto;


	public CardResponseDto getCardResponseDto() {
		return cardResponseDto;
	}

	public void setCardResponseDto(CardResponseDto cardResponseDto) {
		this.cardResponseDto = cardResponseDto;
	}

	public AccountResponseDto() {
		super();
	}

	public LoanResponseDto getLoanResponseDto() {
		return loanResponseDto;
	}

	public void setLoanResponseDto(LoanResponseDto loanResponseDto) {
		this.loanResponseDto = loanResponseDto;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}