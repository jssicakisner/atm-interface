package com.bankingapp.atm.service;

import java.util.List;

import com.bankingapp.atm.domain.Appointment;

public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
