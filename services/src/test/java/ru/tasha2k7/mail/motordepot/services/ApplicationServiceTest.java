package ru.tasha2k7.mail.motordepot.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.tasha2k7.mail.motordepot.datamodel.Application;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-context.xml")
public class ApplicationServiceTest {
	
	@Inject
	private ApplicationService applicationService;
	
	@Test
	public void getByStatusTest() {
		Application application = applicationService.getByStatus(Application.ApplicationStatus.executed) ;
		Assert.assertNotNull("application for id=1 should not be null", applicationService.getByStatus(Application.ApplicationStatus.executed ));		
		Assert.assertEquals(Application.ApplicationStatus.executed, application.getStatus());
	}
}
