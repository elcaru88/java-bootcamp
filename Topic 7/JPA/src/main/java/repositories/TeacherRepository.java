package repositories;

import model.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {

	Teacher findByFirstLastName(String firstName, String lastName);
}
