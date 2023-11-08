package com.mybank;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

	Optional<Loan> findByAccountNumber(long accountNumber);
	
	

}
