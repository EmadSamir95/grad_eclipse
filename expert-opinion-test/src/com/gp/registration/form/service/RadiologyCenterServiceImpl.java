package com.gp.registration.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gp.registration.form.dao.RadiologyCenterDAO;
import com.gp.registration.form.entity.RadiologyCenter;
@Service
public class RadiologyCenterServiceImpl implements RadiologyCenterService {

	@Autowired
	private RadiologyCenterDAO radiologyCenterDAO;
	
	@Transactional
	@Override
	public List<RadiologyCenter> getRadiologyCenters() {
		// TODO Auto-generated method stub
		return radiologyCenterDAO.getRadiologyCenters();
	}

	@Transactional
	@Override
	public void saveradiologyCenter(RadiologyCenter theRadiologyCenter) {

		radiologyCenterDAO.saveRadiologyCenter(theRadiologyCenter);
	}

	@Transactional
	@Override
	public RadiologyCenter getRadiologyCenter(int theId) {

		return radiologyCenterDAO.get(theId);
	}

	@Transactional
	@Override
	public void deleteRadiologyCenter(int theId) {

		radiologyCenterDAO.deleteRadiologyCenter(theId);
	}

}
