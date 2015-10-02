package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Room;

public interface RoomRepository extends  CrudRepository<Room,Long>{
	
	Room findByRoomNumber(String roomNumber);
}
