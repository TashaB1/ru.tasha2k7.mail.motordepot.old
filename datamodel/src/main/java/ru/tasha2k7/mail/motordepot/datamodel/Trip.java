package ru.tasha2k7.mail.motordepot.datamodel;

import java.util.Date;
import java.util.List;

import ru.tasha2k7.mail.motordepot.annotation.DBTableName;

@DBTableName(name = "trip")
public class Trip extends AbstractModel {

	private String pointDeparture;
	private Date dateDeparture;
	private String destination;
	private String dateDestination;

	private List<Application> application;

	public String getPointDeparture() {
		return pointDeparture;
	}

	public void setPointDeparture(String pointDeparture) {
		this.pointDeparture = pointDeparture;
	}

	public Date getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(Date dateDeparture) {
		this.dateDeparture = dateDeparture;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDateDestination() {
		return dateDestination;
	}

	public void setDateDestination(String dateDestination) {
		this.dateDestination = dateDestination;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}

}
