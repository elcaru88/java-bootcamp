package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Room;
import com.repository.RoomRepository;

@RestController
@RequestMapping("/room")
public class RoomRestController {

	private final RoomRepository roomRepository;

	@Autowired
	RoomRestController(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> attendeesList() {

		List<String> list = new ArrayList<String>();
		for (Room room : roomRepository.findAll()) {
			list.add(room.toString());
		}
		return list;
	}

}
