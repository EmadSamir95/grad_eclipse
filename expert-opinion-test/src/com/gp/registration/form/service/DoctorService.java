package com.gp.registration.form.service;

import java.util.List;

import com.gp.registration.form.entity.Doctor;

public interface DoctorService {

	public List<Doctor> getDoctors();

	public void saveDoctor(Doctor theDoctor);

	public Doctor getDoctor(int theId);

	public void deleteDoctor(int theId);
}
