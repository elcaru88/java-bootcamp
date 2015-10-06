package com.meeting.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meeting.model.Meeting;
import com.meeting.repository.MeetingRepository;


@RestController
@RequestMapping("/meeting")
class MeetingController {
	
	private final MeetingRepository meetingRepository;
	
	@Autowired
	MeetingController(MeetingRepository meetingRepository) {
		this.meetingRepository = meetingRepository;
	}
	
	@RequestMapping(value="/listar" , method = RequestMethod.GET)
	List<String> listMeetings() {
		List<String> list = new ArrayList<String>();
		for (Meeting m : meetingRepository.findAll()) {
			list.add(m.toString());
		}
		return list;
	}
	
	@RequestMapping(value ="delete/{id}", method = RequestMethod.DELETE)
	 void deleteCliente(@PathVariable int id) {
		meetingRepository.delete(id);
	}
	
   
	@RequestMapping(value ="/update/{id}", method = RequestMethod.PUT  )
	public @ResponseBody
	void addMeeting( @PathVariable("id") int id, @RequestBody Meeting meeting) {
		meetingRepository.save(meeting);
	}
	
	 @RequestMapping(value = "/create", method = RequestMethod.POST)
	 void createMeeting(
	   @RequestParam(value="timeSlot", required = true) String timeSlot,
	   @RequestParam(value="room" , required = true) int room)
	   {
	    meetingRepository.save(new Meeting( room , timeSlot));
	 }
	 
	 @RequestMapping(value = "/addAtendee", method = RequestMethod.POST)
	 void addAtendee(
	   @RequestParam(value="dni", required = true) int dni,
	   @RequestParam(value="name" , required = true) String name)
	   {
	    meetingRepository.save(new Meeting( dni , name));
	 }
}

	  
	
	
	
	
	


