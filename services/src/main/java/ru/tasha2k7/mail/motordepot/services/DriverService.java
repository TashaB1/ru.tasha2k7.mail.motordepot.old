package ru.tasha2k7.mail.motordepot.services;

import ru.tasha2k7.mail.motordepot.datamodel.Application;
import ru.tasha2k7.mail.motordepot.datamodel.Car;
import ru.tasha2k7.mail.motordepot.datamodel.Driver;

public interface DriverService {

	String getByStatus(Long id);

	void markDeliveryTrip(Application application);

	void markconditionVehical(Car car);

	void updateStatus(Driver driver);
}
