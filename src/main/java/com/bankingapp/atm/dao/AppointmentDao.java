package com.bankingapp.atm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bankingapp.atm.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {
    
    List<Appointment> findAll();
}
