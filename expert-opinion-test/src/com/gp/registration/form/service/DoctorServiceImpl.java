package com.gp.registration.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gp.registration.form.dao.DoctorDAO;
import com.gp.registration.form.entity.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDAO doctorDAO;
	
	@Transactional
	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorDAO.getDoctors();
	}

	@Transactional
	@Override
	public void saveDoctor(Doctor theDoctor) {

		doctorDAO.saveDoctor(theDoctor);
	}
	
	@Transactional
	@Override
	public Doctor getDoctor(int theId) {
		// TODO Auto-generated method stub
		return doctorDAO.getDoctor(theId);
	}

	@Transactional
	@Override
	public void deleteDoctor(int theId) {

		doctorDAO.deleteDoctor(theId);
	}

}
