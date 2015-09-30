package restApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;

@Entity
public class Meeting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long meetingId;
	
	private String timeSlot;
	
	@OneToOne
	private Room room;
	
	@OneToOne
	private Attendee attendee;
	
	public Meeting() {}

	public Meeting(String timeSlot, Room room, Attendee attendee) {
		this.timeSlot = timeSlot;
		this.room = room;
		this.attendee = attendee;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Attendee getAttendee() {
		return attendee;
	}

	public void setAttendee(Attendee attendee) {
		this.attendee = attendee;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", timeSlot=" + timeSlot
				+ ", room=" + room + ", attendee=" + attendee + "]";
	}

}
