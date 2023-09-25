package com.bankingapp.atm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {
    
    List<SavingsTransaction> findAll();
}
