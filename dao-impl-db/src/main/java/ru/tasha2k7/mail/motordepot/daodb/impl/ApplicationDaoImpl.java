package ru.tasha2k7.mail.motordepot.daodb.impl;

import java.util.List;

import javax.inject.Inject;

<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ru.tasha2k7.mail.motordepot.daodb.ApplicationDao;
<<<<<<< HEAD
import ru.tasha2k7.mail.motordepot.daodb.dimapper.impl.ApplicationDiMapper;
=======
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;
>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
import ru.tasha2k7.mail.motordepot.datamodel.Application;

@Repository
public class ApplicationDaoImpl extends GenericDaoImpl<Application, Long> implements ApplicationDao {

<<<<<<< HEAD
	@Inject
	private ApplicationDiMapper applicationDiMapper;
	
=======
	
	public ApplicationDaoImpl(DiMapper<Application> diMapper) {
		super(diMapper);
	}
	
	@Autowired
>>>>>>> 088f4c8f978dd05463ab6809e8e6228391bc6292
	@Inject
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Application> getAllByClientId(Long clientId) {
		return jdbcTemplate.query("select * from application where client_id = ?", new Object[] { clientId },
				new BeanPropertyRowMapper<>(Application.class));
	}

	@Override
	public List<Application> getAllByDriverId(Long driverId) {
		return jdbcTemplate.query("select * from application where driver_id = ?", new Object[] { driverId },
				new BeanPropertyRowMapper<>(Application.class));
	}

	@Override
	public List<Application> getAllByDispatcherId(Long dispatcherId) {
		return jdbcTemplate.query("select * from application where dispatcher_id = ?", new Object[] { dispatcherId },
				new BeanPropertyRowMapper<>(Application.class));
	}

	@Override
	public List<Application> getAllByTripId(Long tripId) {
		return jdbcTemplate.query("select * from application where trip_id = ?", new Object[] { tripId },
				new BeanPropertyRowMapper<>(Application.class));
	}

	@Override
	public void setStatusApplication(Application application, String status) {
		// TODO Auto-generated method stub

	}

	@Override
	public Application getStatusApplication(Application.ApplicationStatus status) {
		return jdbcTemplate.queryForObject("select * from application where status = ?",
				new Object[] { status.toString() }, new BeanPropertyRowMapper<>(Application.class));
	}
	
/*	public void update(Application application) {
        Object[] objects = new Object[] {
        		application.getId(),
        		application.getNumberApplication(),
        		application.getDateApplication(),
        		application.getClient().getId(),
        		application.getTrip().getId(),
        		application.getWeightCargoKg(),
        		application.getLengthCargoM(),
        		application.getWidthCargoM(),
        		application.getHeigthCargoM(),
        		application.getMarkDeliveryCargo(),
        		application.getDateDeliveryCargo(),
        		application.getDispatcher().getId(),
        		application.getDriver().getId(),
        		application.getNote(),
        		application.getStatus().toString()
        };
        jdbcTemplate.update(SQL_UPDATE, objects);
    }
	public static final String SQL_UPDATE = "UPDATE application SET " + Item.NAME_COLUMN + " = ?" + COMMA + Item.WAREHOUSE_ID_COLUMN + " = ?" + " WHERE " + Item.ID_COLUMN + " = ?";
	*/
}
