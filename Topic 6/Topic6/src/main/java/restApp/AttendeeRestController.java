package restApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendee")
public class AttendeeRestController {

	private final AttendeeRepository attendeeRepository;
	

	@Autowired
	AttendeeRestController(AttendeeRepository attendeeRepository) {
		this.attendeeRepository = attendeeRepository;

	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> attendeesList() {

		List<String> list = new ArrayList<String>();
		for (Attendee attendee : attendeeRepository.findAll()) {
			list.add(attendee.toString());

		}

		return list;
	}


	@RequestMapping(value = "/{lastName}", method = RequestMethod.GET)
	String getAttendee(@PathVariable("lastName") String lastName) {
			return attendeeRepository.findByLastName(lastName).toString();
	}
}
