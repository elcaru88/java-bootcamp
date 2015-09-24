package entities;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare (Student o1,Student o2) {
		
        int res =  o1.getLastName().compareToIgnoreCase(o2.getLastName());
        if (res != 0)
            return res;
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }
}
