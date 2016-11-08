package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Employee;
@Repository
=======
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Employee;

>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
public class EmployeeDiMapper implements DiMapper<Employee> {

	@Override
	public Map<String, Object> mapColumns(Employee employee) {
		Map<String, Object> mapping = new LinkedHashMap<String, Object>();
		mapping.put("id", employee.getId());
		mapping.put("firstname", employee.getFirstname());
		mapping.put("lastname", employee.getLastname());
		mapping.put("surname", employee.getSurname());
		mapping.put("birthday", employee.getBirthday());
		mapping.put("position", employee.getPosition());
		mapping.put("deleted", employee.getDeleted());
		return mapping;
	}
}