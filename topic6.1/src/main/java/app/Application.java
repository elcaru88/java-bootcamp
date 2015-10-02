package app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner attendee(AttendeeRepository attendeeRepository) {
		return(arg)->{
			attendeeRepository.save(new Attendee("Camilo","Aldao"));
			attendeeRepository.save(new Attendee("Cesar","Galian"));

		};
		
	}
	
	@Bean
	public CommandLineRunner room(RoomRepository roomRepository) {
		return(arg)->{
			roomRepository.save(new Room("Room A"));
			roomRepository.save(new Room("Room B"));

		};
		
	}
	

}
