package com.bankingapp.atm.dao;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    
    Role findByName(String name);
}
