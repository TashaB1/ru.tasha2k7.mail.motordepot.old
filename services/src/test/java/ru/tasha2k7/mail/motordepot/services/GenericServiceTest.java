package ru.tasha2k7.mail.motordepot.services;

import org.junit.Assert;
import org.junit.Ignore;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.MetaDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.tasha2k7.mail.motordepot.daodb.impl.GenericDaoImpl;
import ru.tasha2k7.mail.motordepot.daodb.util.GetAllTableNames;
import ru.tasha2k7.mail.motordepot.datamodel.Client;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-context.xml")
public class GenericServiceTest {
	
	@Inject
    private JdbcTemplate jdbcTemplate;
	
	@Inject
	private GenericService<Client, Long> genericService;
	
		
	@Test
	@Ignore
    public void getByIdTest() {
        Client client = genericService.getById(1l);

        Assert.assertNotNull("client for id=1 should not be null", client);
        Assert.assertEquals(new Long(1), client.getId());
    }

 

}
