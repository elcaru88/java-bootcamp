package com.pruebas.dao;

import java.util.List;

public interface GenericDAO <T> {

	public boolean addEntity(T entity);
	public T getEntity (int id);
	public List<T> getEntities ();
	public boolean updateEntity (T entity);
}
