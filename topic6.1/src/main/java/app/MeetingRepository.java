package app;

import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, Long>{
	Meeting findByMeetingId(long meetingId);	

}
