package com.bankingapp.atm.dao;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {
    
    PrimaryAccount findByAccountNumber (int accountNumber);
}
