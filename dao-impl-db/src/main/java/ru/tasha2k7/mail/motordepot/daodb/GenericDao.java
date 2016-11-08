package ru.tasha2k7.mail.motordepot.daodb;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {

	T getById(final PK id);
	
	PK insert(final T obj); //Вставьте объект в таблицу, связанной с конкретным DAO.
	
	void update(final T obj);
		
	void delete(final PK id);
	
	void deleteAll(T obj);
	
	List<T> getAll();

   // Long getLength(Criterion criterion);  import org.hibernate.criterion.Criterion;
	
}
