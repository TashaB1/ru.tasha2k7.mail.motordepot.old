package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Car;

public class CarDiMapper implements DiMapper<Car>{

	@Override
	public Map<String, Object> mapColumns(Car car) {
		Map<String, Object> mapping = new LinkedHashMap<String, Object>();
		mapping.put("id", car.getId());
		mapping.put("make_model", car.getMakeModel());
		mapping.put("number_registration", car.getNumberRegistration());
		mapping.put("capacity_carrying_kg", car.getCapacityCarryingKg());
		mapping.put("length_dimensions_m", car.getLengthDimensionsM());
		mapping.put("width_dimensions_m", car.getWidthDimensionsM());
		mapping.put("heigth_dimensions_m", car.getHeigthDimensionsM());
		mapping.put("condition_vehical", car.getConditionVehical());		
		mapping.put("inspection_date", car.getInspectionDate());
		mapping.put("deleted", car.getDeleted());
		return mapping;
	}

}
