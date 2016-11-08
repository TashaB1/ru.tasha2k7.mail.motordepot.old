package ru.tasha2k7.mail.motordepot.datamodel;

import java.util.Date;
import java.util.List;

import ru.tasha2k7.mail.motordepot.annotation.DBTableName;

@DBTableName(name = "employee")
public class Employee extends AbstractModel {

	private String firstname;
	private String lastname;
	private String surname;
	private Date birthday;
	private String position;
	private Date deleted;

	private List<Driver> driver;
	private List<Dispatcher> dispatcher;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	public List<Driver> getDriver() {
		return driver;
	}

	public void setDriver(List<Driver> driver) {
		this.driver = driver;
	}

	public List<Dispatcher> getDispatcher() {
		return dispatcher;
	}

	public void setDispatcher(List<Dispatcher> dispatcher) {
		this.dispatcher = dispatcher;
	}

}
