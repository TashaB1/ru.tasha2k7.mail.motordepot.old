package ru.tasha2k7.mail.motordepot.datamodel;

import java.util.Date;

import ru.tasha2k7.mail.motordepot.annotation.DBTableName;

@DBTableName(name = "application")
public class Application extends AbstractModel {

	public enum ApplicationStatus {
		distributed, 	// распределена
		notDistributed, // нераспределена
		executed, 		// исполнена
		notExecuted, 	// неисполнена
		canceled 		// отменена
	}

	private Integer numberApplication;
	private Date dateApplication;

	private Long clientId;
	private Long tripId;

	private Double weightCargoKg;
	private Double lengthCargoM;
	private Double widthCargoM;
	private Double heigthCargoM;

	private Boolean markDeliveryCargo;
	private Date dateDeliveryCargo;

	private Long dispatcherId;
	private Long driverId;

	private String note;

	private ApplicationStatus status;

	private Client client;
	private Trip trip;
	private Driver driver;
	private Dispatcher dispatcher;

	public Integer getNumberApplication() {
		return numberApplication;
	}

	public void setNumberApplication(Integer numberApplication) {
		this.numberApplication = numberApplication;
	}

	public Date getDateApplication() {
		return dateApplication;
	}

	public void setDateApplication(Date dateApplication) {
		this.dateApplication = dateApplication;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getTripId() {
		return tripId;
	}

	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}

	public Double getWeightCargoKg() {
		return weightCargoKg;
	}

	public void setWeightCargoKg(Double weightCargoKg) {
		this.weightCargoKg = weightCargoKg;
	}

	public Double getLengthCargoM() {
		return lengthCargoM;
	}

	public void setLengthCargoM(Double lengthCargoM) {
		this.lengthCargoM = lengthCargoM;
	}

	public Double getWidthCargoM() {
		return widthCargoM;
	}

	public void setWidthCargoM(Double widthCargoM) {
		this.widthCargoM = widthCargoM;
	}

	public Double getHeigthCargoM() {
		return heigthCargoM;
	}

	public void setHeigthCargoM(Double heigthCargoM) {
		this.heigthCargoM = heigthCargoM;
	}

	public Boolean getMarkDeliveryCargo() {
		return markDeliveryCargo;
	}

	public void setMarkDeliveryCargo(Boolean markDeliveryCargo) {
		this.markDeliveryCargo = markDeliveryCargo;
	}

	public Date getDateDeliveryCargo() {
		return dateDeliveryCargo;
	}

	public void setDateDeliveryCargo(Date dateDeliveryCargo) {
		this.dateDeliveryCargo = dateDeliveryCargo;
	}

	public Long getDispatcherId() {
		return dispatcherId;
	}

	public void setDispatcherId(Long dispatcherId) {
		this.dispatcherId = dispatcherId;
	}

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public ApplicationStatus getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Dispatcher getDispatcher() {
		return dispatcher;
	}

	public void setDispatcher(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}

}
