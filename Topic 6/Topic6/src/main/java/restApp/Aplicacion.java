package restApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Aplicacion.class);
	}


	@Bean
	public CommandLineRunner attendees(AttendeeRepository attendeeRepository) {
		return (arg) -> {

			attendeeRepository.save(new Attendee("sanchez", "roberto"));
			attendeeRepository.save(new Attendee("costel", "juan"));
			attendeeRepository.save(new Attendee("martinez", "ian"));
			attendeeRepository.save(new Attendee("fernandez", "edgard"));
			};
	}
	
	@Bean
	public CommandLineRunner rooms(RoomRepository roomRepository) {
		return (arg) -> {

			roomRepository.save(new Room("1-A"));
			roomRepository.save(new Room("2-B"));
			roomRepository.save(new Room("2-C"));
			roomRepository.save(new Room("1-D"));
			};
	}
	
}