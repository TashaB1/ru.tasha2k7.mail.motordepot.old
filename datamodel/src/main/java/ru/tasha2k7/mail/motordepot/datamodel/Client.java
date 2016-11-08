package ru.tasha2k7.mail.motordepot.datamodel;

import java.util.Date;
import java.util.List;

import ru.tasha2k7.mail.motordepot.annotation.DBTableName;

@DBTableName(name = "client")
public class Client extends AbstractModel {

	private String nameClient;
	private String address;
	private String numberPhone;
	private Date deleted;

	private List<Application> application;

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}

}
