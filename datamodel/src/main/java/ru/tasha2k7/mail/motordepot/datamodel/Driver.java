package ru.tasha2k7.mail.motordepot.datamodel;

import java.util.List;

import ru.tasha2k7.mail.motordepot.annotation.DBTableName;

@DBTableName(name = "driver")
public class Driver extends AbstractModel {

	public enum DriverStatus {
		free,				//свободен
		acceptedExecution, 	// заявка принята к исполнению
		onWay,  			//(onTrip)  в пути (на рейсе)
		absent  			//отсутствует
	}

	private Long employeeId;
	private String numberDriverLicense;
	private String categoryDriverLicense;

	private Long carId;
	private DriverStatus status;

	private List<Application> application;
	private Car car;
	private Employee employee;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getNumberDriverLicense() {
		return numberDriverLicense;
	}

	public void setNumberDriverLicense(String numberDriverLicense) {
		this.numberDriverLicense = numberDriverLicense;
	}

	public String getCategoryDriverLicense() {
		return categoryDriverLicense;
	}

	public void setCategoryDriverLicense(String categoryDriverLicense) {
		this.categoryDriverLicense = categoryDriverLicense;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public DriverStatus getStatus() {
		return status;
	}

	public void setStatus(DriverStatus status) {
		this.status = status;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
