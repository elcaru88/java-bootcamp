package com.meeting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.meeting.model.Meeting;
import com.meeting.repository.MeetingRepository;



@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.meeting")
public class Aplicacion {

	// para poder ver los toString en consola
	// private static final Logger log =
	// LoggerFactory.getLogger(Aplicacion.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Aplicacion.class);
	}

//	@Bean
//	public CommandLineRunner demo(ClienteRepository clienteRepository) {
//		return (arg) -> {
//			// creo los objetos en la tabla
//			clienteRepository.save(new Cliente("sanchez", "hugo"));
//			clienteRepository.save(new Cliente("costel", "lucas"));
//			clienteRepository.save(new Cliente("martinez", "ian"));
//			clienteRepository.save(new Cliente("fernandez", "edgard"));
//
//		};
//	}
	
	@Bean
	public CommandLineRunner demo(MeetingRepository meetingRepository) {
		return (arg) -> {
			// creo los objetos en la tabla
			System.out.println("aca");
			meetingRepository.save(new Meeting( 12 ,"10:40"));
			meetingRepository.save(new Meeting( 14 ,"18:30"));
			meetingRepository.save(new Meeting( 1 ,"02:00"));
			meetingRepository.save(new Meeting( 2 ,"11:40"));
		};
	}
	
}


	


