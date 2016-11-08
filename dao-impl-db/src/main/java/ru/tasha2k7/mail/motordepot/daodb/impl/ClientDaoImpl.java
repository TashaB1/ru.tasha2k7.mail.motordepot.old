package ru.tasha2k7.mail.motordepot.daodb.impl;

<<<<<<< HEAD
import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.ClientDao;
import ru.tasha2k7.mail.motordepot.daodb.dimapper.ClientDiMapper;
=======
import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.ClientDao;
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
import ru.tasha2k7.mail.motordepot.datamodel.Client;

@Repository
public class ClientDaoImpl extends GenericDaoImpl<Client, Long> implements ClientDao{

<<<<<<< HEAD
	@Inject
	private ClientDiMapper clientDiMapper;
=======
	public ClientDaoImpl(DiMapper<Client> diMapper) {
		super(diMapper);
	}	
>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292

}
