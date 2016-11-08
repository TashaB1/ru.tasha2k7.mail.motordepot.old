package ru.tasha2k7.mail.motordepot.daodb.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.ClientDao;
import ru.tasha2k7.mail.motordepot.daodb.dimapper.ClientDiMapper;
import ru.tasha2k7.mail.motordepot.datamodel.Client;

@Repository
public class ClientDaoImpl extends GenericDaoImpl<Client, Long> implements ClientDao{

	@Inject
	private ClientDiMapper clientDiMapper;

}
