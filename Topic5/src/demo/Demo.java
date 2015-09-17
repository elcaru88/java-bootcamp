package demo;

import java.sql.Date;
import java.util.Collections;
import java.util.Scanner;

import data.DataCourse;
import data.DataNotes;
import data.DataStudent;
import data.DataTeacher;
import entities.Course;
import entities.Student;
import entities.StudentComparator;
import entities.Teacher;

public class Demo {
	
	public static void main(String[] args) {
		
		// STUDENTS //
		
		DataStudent ds = new DataStudent();
		ds.add(new Student( "Tomas" , "Fontanarrosa" , 1 , Date.valueOf("1993-08-18")));
		ds.add(new Student( "Ruben" , "Lenten" , 2 , Date.valueOf("1993-04-12")));
		ds.add(new Student( "Juan" , "Gomez" , 3 , Date.valueOf("1912-12-02")));
		ds.add(new Student( "Maria" , "Fox" , 4 , Date.valueOf("1993-08-05")));
		ds.add(new Student( "Juana" , "Fontanarrosa" , 5 , Date.valueOf("1993-06-06")));
		ds.add(new Student( "Victoria" , "Gonzales" , 6 , Date.valueOf("1993-05-07")));
		ds.add(new Student( "Ruben" , "Garcia" , 7 , Date.valueOf("1991-04-08")));
		ds.add(new Student( "Julian" , "Alvarez" , 8 , Date.valueOf("1998-02-09")));
		ds.add(new Student( "Julia" , "Tagse" , 9 , Date.valueOf("1995-08-10")));
		ds.add(new Student( "Simon" , "Ponce" , 10 , Date.valueOf("1993-09-10")));
		ds.add(new Student( "Guillermo" , "Fernandez" , 11 , Date.valueOf("1993-11-11")));
		ds.add(new Student( "Milagros" , "Puaje" , 12 , Date.valueOf("1993-12-12")));
		ds.add(new Student( "Bianca" , "Terme" , 13 , Date.valueOf("1993-01-15")));
		ds.add(new Student( "Cristian" , "Quers" , 14 , Date.valueOf("1996-08-11")));
		ds.add(new Student( "Luis" , "Adles" , 15 , Date.valueOf("1994-05-30")));
		ds.add(new Student( "Agustin" , "Fontanarrosa" , 16 , Date.valueOf("1996-04-29")));
		ds.add(new Student( "Florencia" , "Louias" , 17 , Date.valueOf("1994-02-26")));
		ds.add(new Student( "Guillermina" , "Thomson" , 18 , Date.valueOf("1992-02-23")));
		ds.add(new Student( "Laura" , "Arpse" , 19 , Date.valueOf("1991-01-23")));
		ds.add(new Student( "Virginia" , "Keser" , 20 , Date.valueOf("1997-09-11")));
		
		DataTeacher dt = new DataTeacher();
		dt.add( new Teacher( 1 , "Alicia" , "Guitierrez" ,  Date.valueOf("1965-09-11")));
		dt.add( new Teacher( 2 , "Juan" , "Perez" ,  Date.valueOf("1965-09-22")));
		dt.add( new Teacher( 3 , "Pedro" , "Master" ,  Date.valueOf("1963-04-12")));
		
		DataCourse dc = new DataCourse();
		
		dc.add( new Course( "JAVA" , dt.getById(1) , 5 ));
		dc.add( new Course( "C++" , dt.getById(2) , 4 ));
		dc.add( new Course( "PHP" , dt.getById(2) , 1 ));
		dc.add( new Course( "SQL" , dt.getById(3) , 9 ));
		dc.add( new Course( "LINUX" , dt.getById(1) , 5 ));
		
		for (int i = 1; i < 20; i++) {
			dc.addStudent( "JAVA", i );
			dc.addStudent("C++", i);
			dc.addStudent("PHP", i);
			dc.addStudent("SQL", i);
			dc.addStudent("LINUX",i);
		}
		
		// ASIGNAR NOTAS A UN ALUMNO
		DataNotes dn = new DataNotes();
		
		dn.setFirstPartial( "JAVA" , ds.getByRegistrationNumber(1).getRegistrationNumber() ,6);
		
		dn.setFinalNote("JAVA" ,1, 10);
		dn.setFinalNote("SQL",1, 5);
		dn.setFinalNote("PHP",1, 7);
		dn.setFinalNote("LINUX",1, 8);
		dn.setFinalNote("C++",1, 1);
		
		
		
		System.out.println(" Ingrese Nombre del Curso");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String courseName = scan.next();
		
		Course course = dc.getByName(courseName);
		
		Collections.sort( course.getStudents() , new StudentComparator());
		
		System.out.println(course.getInfo());
		
		System.out.println("INGRESE ID DE ALUMNO: \n");
		
		int registrationNumber = Integer.parseInt(scan.next());
		
		System.out.println(dn.getFinalNotesByRegistrationNumber(registrationNumber));
		
		System.out.println(" EXIT ");
		
		
		

	}

}
