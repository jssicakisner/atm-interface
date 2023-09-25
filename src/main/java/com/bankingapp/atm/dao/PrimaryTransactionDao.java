package com.bankingapp.atm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {
    
    List<PrimaryTransaction> findAll();
}
