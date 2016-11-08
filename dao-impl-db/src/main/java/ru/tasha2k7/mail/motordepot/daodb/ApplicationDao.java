package ru.tasha2k7.mail.motordepot.daodb;

import java.util.List;

import ru.tasha2k7.mail.motordepot.datamodel.Application;

public interface ApplicationDao extends GenericDao<Application, Long>{

	List<Application> getAllByClientId(Long clientId);
	
	List<Application> getAllByDriverId(Long driverId);
	
	List<Application> getAllByDispatcherId(Long dispatcherId);
	
	List<Application> getAllByTripId(Long tripId);
	
	public void setStatusApplication(Application application, String status);
	
	Application getStatusApplication(Application.ApplicationStatus status);
}