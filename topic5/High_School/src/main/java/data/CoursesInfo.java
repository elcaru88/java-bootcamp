package data;

import java.util.ArrayList;

public class CoursesInfo {
	ArrayList<CourseInfo> coursedInfo;

	public CoursesInfo() {
		super();
		coursedInfo = new ArrayList<CourseInfo>();
	}
	
	public void addInfo(CourseInfo courseInfo) {
		coursedInfo.add(courseInfo);
	}
	
	public ArrayList<CourseInfo> getInfo() {
		return coursedInfo;
	}

}
