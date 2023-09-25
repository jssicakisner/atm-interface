package com.bankingapp.atm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long> {
    
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
