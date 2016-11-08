package ru.tasha2k7.mail.motordepot.daodb.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import ru.tasha2k7.mail.motordepot.annotation.analyzer.DBTableNameAnalyzer;
import ru.tasha2k7.mail.motordepot.daodb.GenericDao;
import ru.tasha2k7.mail.motordepot.daodb.dimapper.ApplicationDiMapper;
import ru.tasha2k7.mail.motordepot.daodb.dimapper.DiMapper;

@Repository
public abstract class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

	@Inject
	private JdbcTemplate jdbcTemplate;
	private final String dbTableName = new DBTableNameAnalyzer().getDBTableName(this.getGenericEntityClass());

	@Inject
	private DiMapper diMapper;	

	@SuppressWarnings("unchecked")
	protected Class<T> getGenericEntityClass() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		return (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}

	@Override
	public T getById(PK id) {
		return jdbcTemplate.queryForObject("select * from " + dbTableName + " where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<>(this.getGenericEntityClass()));
	}

	@SuppressWarnings("unchecked")
	@Override
	public PK insert(T obj) {
		SimpleJdbcInsert simpleJdbcInsert;
		Map<String, Object> map = diMapper.mapColumns(obj);

		if (map.containsKey("id")) {
			simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName(dbTableName);
			simpleJdbcInsert.execute(map);
			return (PK) map.get("id");
		} else {
			simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName(dbTableName)
					.usingGeneratedKeyColumns("id");
			return (PK) simpleJdbcInsert.executeAndReturnKey(map);
		}
	}

	@Override
	public void update(T obj) {		

	}

	@Override
	public void delete(PK id) {
		jdbcTemplate.update("delete from " + dbTableName + " where id = ?", id);
	}

	@Override
	public void deleteAll(T obj) {
		jdbcTemplate.update("delete from " + dbTableName);
	}

	
	@Override
	public List<T> getAll() {
		return jdbcTemplate.query("select * from " + dbTableName,
				new BeanPropertyRowMapper<>(this.getGenericEntityClass()));
	}

}
