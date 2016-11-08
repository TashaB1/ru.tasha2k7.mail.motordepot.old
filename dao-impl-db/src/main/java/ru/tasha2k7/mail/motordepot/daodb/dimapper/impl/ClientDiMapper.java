package ru.tasha2k7.mail.motordepot.daodb.dimapper.impl;

import java.util.LinkedHashMap;
import java.util.Map;

<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Client;
@Repository
=======
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Client;

>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
public class ClientDiMapper implements DiMapper<Client>{

	@Override
	public Map<String, Object> mapColumns(Client client) {
		Map<String, Object> mapping = new LinkedHashMap<String, Object>();
		mapping.put("id", client.getId());
		mapping.put("name_client", client.getNameClient());
		mapping.put("address", client.getAddress());
		mapping.put("number_phone", client.getNumberPhone());
		mapping.put("deleted", client.getDeleted());
		return mapping;
	}

}
