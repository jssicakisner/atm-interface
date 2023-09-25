package com.bankingapp.atm.dao;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {
    SavingsAccount findByAccountNumber (int accountNumber);
}
