package com.bankingapp.atm.service;

import java.security.Principal;

import com.bankingapp.atm.domain.PrimaryAccount;
import com.bankingapp.atm.domain.SavingsAccount;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
