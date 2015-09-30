package restApp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends  CrudRepository<Room,Long>{
	
	Room findByRoomNumber(String roomNumber);
}
