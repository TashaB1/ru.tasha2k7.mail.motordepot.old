package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Driver;

public class DriverDiMapper implements DiMapper<Driver>{

	@Override
	public Map<String, Object> mapColumns(Driver driver) {
		Map<String, Object> mapping = new LinkedHashMap<String, Object>();
		mapping.put("id", driver.getId());
		mapping.put("employee_id", driver.getEmployee().getId());
		mapping.put("number_driver_license", driver.getNumberDriverLicense());
		mapping.put("category_driver_license", driver.getCategoryDriverLicense());
		mapping.put("car_id", driver.getCar().getId());
		mapping.put("status", driver.getStatus().toString());
		return mapping;
	}

}