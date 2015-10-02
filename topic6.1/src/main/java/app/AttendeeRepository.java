package app;

import org.springframework.data.repository.CrudRepository;

public interface AttendeeRepository extends CrudRepository<Attendee, Long> {
	Attendee findByAttendeeId(long attendeeId);

}
