package com.meeting.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meeting {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		private int roomNumber;
		
		private String time;
		
		public Meeting( int roomNumber, String time) {
			super();
			this.roomNumber = roomNumber;
			this.time = time;
		}
		
		public Meeting() {
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public int getRoomNumber() {
			return roomNumber;
		}
		
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		
		public String getTime() {
			return time;
		}
		
		public void setTime(String time) {
			this.time = time;
		}
		
		@Override
		public String toString() { 
			return "Meeting [id=" + id + ", roomNumber=" + roomNumber + ", time=" + time +"]";
		}

}
