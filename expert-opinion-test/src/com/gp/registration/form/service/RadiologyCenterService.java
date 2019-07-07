package com.gp.registration.form.service;

import java.util.List;

import com.gp.registration.form.entity.RadiologyCenter;

public interface RadiologyCenterService {

	public List<RadiologyCenter> getRadiologyCenters();

	public void saveradiologyCenter(RadiologyCenter theRadiologyCenter);

	public RadiologyCenter getRadiologyCenter(int theId);

	public void deleteRadiologyCenter(int theId);
}
