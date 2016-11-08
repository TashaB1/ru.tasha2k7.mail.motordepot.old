package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Employee;

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