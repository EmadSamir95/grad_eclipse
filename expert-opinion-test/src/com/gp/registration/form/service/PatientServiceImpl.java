package com.gp.registration.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gp.registration.form.dao.PatientDAO;
import com.gp.registration.form.entity.Patient;
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	@Transactional
	@Override
	public List<Patient> getPatients() {

		return patientDAO.getPatients();
		 
	}

	@Transactional
	@Override
	public void savePatient(Patient thePatient) {

		 patientDAO.savePatient(thePatient);
	}

	@Transactional
	@Override
	public Patient getPatient(int theId) {
		return patientDAO.getPatient(theId);
	}

	@Transactional
	@Override
	public void deletePatient(int theId) {
		
		patientDAO.deletePatient(theId);
	}

}
