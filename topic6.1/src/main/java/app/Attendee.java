package app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long attendeeId;
	
	private String firstName;
	private String lastName;
	
	public Attendee() {
		
	}

	public Attendee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Attendee [attendeeId=" + attendeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
