package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Meeting;
import com.repository.AttendeeRepository;
import com.repository.MeetingRepository;
import com.repository.RoomRepository;

@RestController
@RequestMapping("/meeting")
public class MeetingRestController {

	private final MeetingRepository meetingRepository;
	AttendeeRepository attendeeRepository;
	RoomRepository roomRepository;

	@Autowired
	public MeetingRestController(MeetingRepository meetingRepository,
			AttendeeRepository attendeeRepository, RoomRepository roomRepository) {
		this.meetingRepository = meetingRepository;
		this.attendeeRepository = attendeeRepository;
		this.roomRepository = roomRepository;

	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> listMeeting() {

		List<String> list = new ArrayList<String>();
		for (Meeting meeting : meetingRepository.findAll()) {
			list.add(meeting.toString());
		}
		return list;
	}

	@RequestMapping(value = "delete/{meetingId}", method = RequestMethod.DELETE)
	void deleteMeeting(@PathVariable long meetingId) {

		meetingRepository.delete(meetingId);

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	void createMeeting(
			@RequestParam(value = "timeSlot", required = true) String timeSlot,
			@RequestParam(value = "room", required = true) String room,
			@RequestParam(value = "attendee", required = true) String attendee) {

		meetingRepository.save(new Meeting(timeSlot, roomRepository
				.findByRoomNumber(room), attendeeRepository
				.findByLastName(attendee)));

	}

	@RequestMapping(value = "/update/{meetingId}", method = RequestMethod.PUT)
	public void updateMeeting(@PathVariable long meetingId,
			@RequestBody Meeting meeting) {
		meetingRepository.save(meeting);
	}

}
