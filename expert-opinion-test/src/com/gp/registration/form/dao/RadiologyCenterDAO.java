package com.gp.registration.form.dao;

import java.util.List;

import com.gp.registration.form.entity.RadiologyCenter;

public interface RadiologyCenterDAO {

	public List<RadiologyCenter> getRadiologyCenters();

	public void saveRadiologyCenter(RadiologyCenter theRadiologyCenter);

	public RadiologyCenter get(int theId);

	public void deleteRadiologyCenter(int theId); 
}
