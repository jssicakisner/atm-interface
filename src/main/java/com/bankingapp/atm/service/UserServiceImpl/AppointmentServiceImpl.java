package com.bankingapp.atm.service.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingapp.atm.dao.AppointmentDao;
import com.bankingapp.atm.domain.Appointment;
import com.bankingapp.atm.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    
    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
       return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    public Appointment findAppointment(Long id) {
        return appointmentDao.findById(id).orElse(null);
    }


    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }
}
