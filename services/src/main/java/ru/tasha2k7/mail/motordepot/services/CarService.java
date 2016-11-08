package ru.tasha2k7.mail.motordepot.services;

import java.util.List;

public interface CarService {
	
	Boolean getcondition(Long id);
	
	List<Double> SpecificationsVehicle(Long id);
	
}
