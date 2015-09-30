package restApp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting,Long>{
	
	Meeting findByTimeSlot(String timeSlot);

}
