package com.gp.registration.form.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gp.registration.form.entity.RadiologyCenter;

@Repository
public class RadiologyCenterDAOImpl implements RadiologyCenterDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<RadiologyCenter> getRadiologyCenters() {
	
		Session currentSession = sessionFactory.getCurrentSession();		
		Query<RadiologyCenter> theQuery = currentSession.createQuery("from RadiologyCenter", RadiologyCenter.class);		
		List<RadiologyCenter> radiologyCenters = theQuery.getResultList(); 
		return radiologyCenters;
	}

	@Override
	public void saveRadiologyCenter(RadiologyCenter theRadiologyCenter) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theRadiologyCenter);
	}

	
	@Override
	public RadiologyCenter get(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		RadiologyCenter theRadiologyCenter = currentSession.get(RadiologyCenter.class, theId);
		return theRadiologyCenter;
	}

	@Override
	public void deleteRadiologyCenter(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query theQuery = currentSession.createQuery("delete from RadiologyCenter WHERE id=:radiologyCenterId");
			theQuery.setParameter("radiologyCenterId", theId);
			theQuery.executeUpdate();
	}

	
	
}
