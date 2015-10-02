package repositories;

import model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByRegistrationNumber(int registrationNumber);

}
