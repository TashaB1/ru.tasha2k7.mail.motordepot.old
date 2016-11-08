package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Dispatcher;
@Repository
public class DispatcherDiMapper implements DiMapper<Dispatcher>{

	@Override
	public Map<String, Object> mapColumns(Dispatcher dispatcher) {
		Map<String, Object> mapping = new LinkedHashMap<String, Object>();
		mapping.put("id", dispatcher.getId());
		mapping.put("employee_id", dispatcher.getEmployee().getId());
		mapping.put("category", dispatcher.getCategory());		
		return mapping;
	}
}