package com.gp.registration.form.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gp.registration.form.entity.Doctor;
@Repository
public class DoctorDAOImpl implements DoctorDAO {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Doctor> getDoctors() {
		// get the current hibernate session
		Session currentSession = sessionfactory.getCurrentSession();
		
		// create a query
		Query<Doctor> theQuery = 
				currentSession.createQuery("from Doctor", Doctor.class);

		// execute query and get result list
		List<Doctor> Docotrs = theQuery.getResultList();
		return Docotrs;
	}

	@Override
	public void saveDoctor(Doctor theDoctor) {
		Session currentSession = sessionfactory.getCurrentSession();
		currentSession.saveOrUpdate(theDoctor);
	}

	@Override
	public Doctor getDoctor(int theId) {
		Session currentSession = sessionfactory.getCurrentSession();
		Doctor theDoctor = currentSession.get(Doctor.class, theId);
		return theDoctor;
	}

	@Override
	public void deleteDoctor(int theId) {
		Session currentSession = sessionfactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query theQuery = currentSession.createQuery("delete from Doctor where id=:doctorId");
			theQuery.setParameter("doctorId", theId);
			theQuery.executeUpdate();		

	}

}
