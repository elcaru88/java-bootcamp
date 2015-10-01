package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Attendee;

public interface AttendeeRepository extends CrudRepository<Attendee,Long>{
	
	Attendee findByLastName(String lastName);
	
}
