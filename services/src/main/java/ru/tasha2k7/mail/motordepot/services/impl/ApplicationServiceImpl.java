package ru.tasha2k7.mail.motordepot.services.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ru.tasha2k7.mail.motordepot.daodb.ApplicationDao;
import ru.tasha2k7.mail.motordepot.datamodel.Application;
import ru.tasha2k7.mail.motordepot.datamodel.Car;
import ru.tasha2k7.mail.motordepot.services.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationServiceImpl.class);

	@Inject
	private ApplicationDao applicationDao;

	@Override
	public Long save(Application application) {
		if (application.getId() == null) {
			Long id = applicationDao.insert(application);
			LOGGER.info("Application created.");					//id={}, ... ", application.getId(), ... );
			return id;
		} else {
			applicationDao.update(application);
			return application.getId();
		}
	}

	@Override
	public void saveAll(List<Application> applications) {
		for (Application application : applications) {
            save(application);
        }
	}

	@Override
	public List<Application> getAll() {
		return applicationDao.getAll();
	}

	@Override
	public List<Application> getAppClient(Long clientId) {
		return applicationDao.getAllByClientId(clientId);
	}

	@Override
	public List<Application> getAppDriver(Long driverId) {
		return applicationDao.getAllByDriverId(driverId);
	}

	@Override
	public Boolean MatchingSpecificationsVehicle(Application application, Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void appoint(Application application) {
		// TODO Auto-generated method stub
	}

	@Override
	public void canceled(Long id) {
		
		
	}

	@Override
	public Application getByStatus(Application.ApplicationStatus status) {
		return applicationDao.getStatusApplication(status);
	}

}
