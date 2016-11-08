package ru.tasha2k7.mail.motordepot.services.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ru.tasha2k7.mail.motordepot.daodb.ClientDao;
import ru.tasha2k7.mail.motordepot.datamodel.Client;
import ru.tasha2k7.mail.motordepot.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Inject
    private ClientDao clientDao;

    @Override
    public Client getById(Long id) {
        return clientDao.getById(id);

    }

	@Override
	public Long Registration(Client client) {
		// TODO Auto-generated method stub
		return null;
	}
}
