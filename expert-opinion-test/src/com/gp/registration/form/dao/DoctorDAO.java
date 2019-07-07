package com.gp.registration.form.dao;

import java.util.List;

import com.gp.registration.form.entity.Doctor;


public interface DoctorDAO {
	public List <Doctor> getDoctors();

	public void saveDoctor(Doctor theDoctor);

	public Doctor getDoctor(int theId);

	public void deleteDoctor(int theId);
}
