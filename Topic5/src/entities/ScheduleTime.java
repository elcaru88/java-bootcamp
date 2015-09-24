package entities;

import java.sql.Time;

public class ScheduleTime {
	
	private String day;
	private Time initialHour;
	private Time finishHour;
	public ScheduleTime(String day, Time initialHour, Time finishHour) {
		super();
		this.day = day;
		this.initialHour = initialHour;
		this.finishHour = finishHour;
	}
	
	public ScheduleTime() {
		// TODO Auto-generated constructor stub
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Time getInitialHour() {
		return initialHour;
	}
	public void setInitialHour(Time initialHour) {
		this.initialHour = initialHour;
	}
	public Time getFinishHour() {
		return finishHour;
	}
	public void setFinishHour(Time finishHour) {
		this.finishHour = finishHour;
	}
	
	

}
