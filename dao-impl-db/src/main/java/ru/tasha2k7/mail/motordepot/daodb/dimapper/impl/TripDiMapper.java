package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Trip;

public class TripDiMapper implements DiMapper<Trip> {

	@Override
	public Map<String, Object> mapColumns(Trip trip) {
		Map<String, Object> mapping = new LinkedHashMap<String, Object>();
		mapping.put("id", trip.getId());
		mapping.put("point_departure", trip.getPointDeparture());
		mapping.put("date_departure", trip.getDateDeparture());
		mapping.put("destination", trip.getDestination());
		mapping.put("date_destination", trip.getDateDestination());		
		return mapping;
	}
}

