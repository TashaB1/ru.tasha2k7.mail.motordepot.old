package ru.tasha2k7.mail.motordepot.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.tasha2k7.mail.motordepot.datamodel.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-context.xml")
public class ClientServiceTest {

	@Inject
	private ClientService clientService;

	@Test
	public void getByIdTest() {
		Client client = clientService.getById(1l);

		Assert.assertNotNull("book for id=1 should not be null", client);
		Assert.assertEquals(new Long(1), client.getId());
	}
}
