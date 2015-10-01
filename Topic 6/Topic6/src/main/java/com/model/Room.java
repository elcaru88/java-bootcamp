package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long roomId;
	
	private String roomNumber;
	

	public Room(){}

	public Room(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNumber=" + roomNumber + "]";
	}
	
}
