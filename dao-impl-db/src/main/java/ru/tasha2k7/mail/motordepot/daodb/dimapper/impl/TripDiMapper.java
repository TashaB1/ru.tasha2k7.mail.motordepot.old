package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Trip;
@Repository
=======
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Trip;

>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
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

