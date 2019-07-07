package com.gp.registration.form.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gp.registration.form.entity.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	public List<Patient> getPatients() {

		Session currentSession= sessionFactory.getCurrentSession();
		
		Query<Patient> theQuery= currentSession.createQuery("from Patient",Patient.class);		
		// execute query and get result list
		List<Patient> Patients = theQuery.getResultList();
		
		return Patients;
	}

	@Override
	public void savePatient(Patient thePatient) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(thePatient);
	}

	@Override
	public Patient getPatient(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Patient thePatient = currentSession.get(Patient.class, theId);
		return thePatient;
	}

	@Override
	public void deletePatient(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query theQuery= currentSession.createQuery("delete from Patient where id=:patientId");
				theQuery.setParameter("patientId", theId);
		
				theQuery.executeUpdate();		
	}

	
}
