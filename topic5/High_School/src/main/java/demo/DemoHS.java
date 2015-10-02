package demo;
import java.sql.SQLException;
import java.util.Scanner;

import conexion.SchoolAction;
import data.Course;
import data.Student;
import data.Students;
import data.Teacher;

public class DemoHS {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SchoolAction st = new SchoolAction();
		System.out.println(st.readStudents().getStudents());
		
		Student std = new Student(7, "Tim", "Boxe", "1889/02/08");
		Student std2 = new Student(8, "Tim", "Boxe", "1889/02/08");
		Student std3=null;
		
//		for (int i = 1; i < 20; i++) {
//			//carga de alumnos pasa con curso
//		}

		
		
		  //TEACHER
		Teacher tc = new Teacher(1, "Mar", "Lupo", "1886-01-05");
		Teacher tc1= new Teacher(2, "Lana", "Impe", "1880-09-08");
		Teacher tc2 = new Teacher(3, "Tara", "Pax", "1884/04/06");
		st.createTeachers(tc);//
		st.createTeachers(tc1);//
		st.createTeachers(tc2);//
		
		System.out.println(st.readTeachers().getTeachers());
		  //COURSE
		Course cr = new Course("C++", tc, 15,"moday 15:30-18:02"); //Agrgar horarios al ACTION
		Course cr1 = new Course("PHYTON", tc1, 10,"tuesday 18:30-20:00");
		Course cr2 = new Course("HTML", tc2, 6,"wednesday 15:30-18:02");//curso no repite teacher por UK
		Course cr3 = new Course("JAVA", tc2, 5,"thursday 16:30-20:30");
		Course cr4 = new Course("CSS3", tc, 3,"friday 16:00-19:00");
		st.createCourse(cr);//
		st.createCourse(cr1);//
		st.createCourse(cr2);//
		st.createCourse(cr3);//
		st.createCourse(cr4);//
		//add students at course
		cr.addStudent(std);
		cr1.addStudent(std);
		cr2.addStudent(std);//al local array
		//add notes
		DemoHS demo = new DemoHS();
		for (int i = 1; i <= 20; i++) {
			
			std3 = new Student(i, "Student"+i, "Lastname"+i, "1889/10/"+ i +"");
			System.out.println(std3.toString());
			st.createStudents(std3);//
			
			st.createNotes(i, "C++",demo.randomNote());
			st.createNotes(i, "PHYTON",demo.randomNote());
			st.createNotes(i, "HTML",demo.randomNote());
			st.createNotes(i, "JAVA",demo.randomNote());
			st.createNotes(i, "CSS3",demo.randomNote());
		}
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nInsert Course");
		String search=in.nextLine();
		st.getCourseInfo(search.toUpperCase());
		
		
		System.out.println("\nInsert StudentID");
		search=in.nextLine();
		st.getStudentInfo(Integer.parseInt(search));
	}
	
	public double randomNote() {
		double note=(Math.random()*5)+5;
		return note;
	}

}
