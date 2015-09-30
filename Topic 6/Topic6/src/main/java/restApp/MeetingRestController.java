package restApp;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/meeting")
public class MeetingRestController {

	private final MeetingRepository meetingRepository;
	AttendeeRepository attendeeRepository ;
	RoomRepository roomRepository ;

	@Autowired
	public MeetingRestController(MeetingRepository meetingRepository,
			AttendeeRepository attendeeRepository ,
	RoomRepository roomRepository ) {
		this.meetingRepository = meetingRepository;
		this.attendeeRepository = attendeeRepository;
		this.roomRepository = roomRepository;
		
	}

	@RequestMapping(method = RequestMethod.GET)
	List<String> listMeeting() {

		List<String> list = new ArrayList<String>();
		for (Meeting meeting : meetingRepository.findAll()) {
			list.add(meeting.toString());
		}
		return list;
	}

	//trate de hacerlo asi method = RequestMethod.DELETE
	//pero tira error
	@RequestMapping(value = "delete/{meetingId}", method = RequestMethod.GET)
	void deleteMeeting(@PathVariable long meetingId) {

		meetingRepository.delete(meetingId);
		listMeeting();
	}
	
	

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	List<String> createMeeting(@RequestParam(value="timeSlot", required = true) String timeSlot,
			@RequestParam(value="room" , required = true) String room,
			@RequestParam(value="attendee" , required = true) String attendee) {
		
		
		meetingRepository.save(new Meeting(timeSlot, roomRepository.findByRoomNumber(room), attendeeRepository.findByLastName(attendee)));
		return listMeeting();

	}
	
	//no anda
	@RequestMapping(value = "/update/{meetingId}", 
			method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	 public void updateMeeting(@PathVariable long meetingId,
			 @RequestBody Meeting meeting,
		HttpServletRequest request, HttpServletResponse response) {
		meetingRepository.save(meeting);
	}
	
/*
 *   @RequestMapping(value = "/{id}",
            method = RequestMethod.PUT,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Update a hotel resource.", notes = "You have to provide a valid hotel ID in the URL and in the payload. The ID attribute can not be updated.")
    public void updateHotel(@ApiParam(value = "The ID of the existing hotel resource.", required = true)
                                 @PathVariable("id") Long id, @RequestBody Hotel hotel,
                                 HttpServletRequest request, HttpServletResponse response) {
//        checkResourceFound(this.hotelService.getHotel(id));
  //      if (id != hotel.getId()) throw new DataFormatException("ID doesn't match!");
        this.hotelService.updateHotel(hotel);
    }
 */
	

}
