package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Dispatcher;
@Repository
=======
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Dispatcher;

>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
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