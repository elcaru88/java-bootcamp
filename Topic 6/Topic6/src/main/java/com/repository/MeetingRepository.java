package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Meeting;

public interface MeetingRepository extends CrudRepository<Meeting,Long>{
	
	Meeting findByTimeSlot(String timeSlot);

}
