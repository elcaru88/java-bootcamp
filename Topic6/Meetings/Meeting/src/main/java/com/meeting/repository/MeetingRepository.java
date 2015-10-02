package com.meeting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meeting.model.Meeting;

public interface MeetingRepository extends JpaRepository< Meeting, Integer>{
	
	List<Meeting> findById( int id );

}
