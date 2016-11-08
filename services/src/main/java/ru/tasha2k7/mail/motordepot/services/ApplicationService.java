package ru.tasha2k7.mail.motordepot.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ru.tasha2k7.mail.motordepot.datamodel.Application;
import ru.tasha2k7.mail.motordepot.datamodel.Car;

public interface ApplicationService {
	
	@Transactional
	Long save(Application application);
	
	@Transactional
    void saveAll(List<Application> applications);
	
	List<Application> getAll();
	
	List<Application> getAppClient(Long clientId);
	
	List<Application> getAppDriver(Long driverId);
	
	Boolean MatchingSpecificationsVehicle(Application application, Car car);
	
	void appoint(Application application);  //назначить
	
	void canceled(Long id);				
	
	Application getByStatus(Application.ApplicationStatus status);		
	
}
