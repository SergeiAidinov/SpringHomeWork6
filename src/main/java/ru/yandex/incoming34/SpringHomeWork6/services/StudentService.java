package ru.yandex.incoming34.SpringHomeWork6.services;

import java.util.Map;
import java.util.Optional;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import ru.yandex.incoming34.SpringHomeWork6.entities.StudentEntity;
import ru.yandex.incoming34.SpringHomeWork6.repos.StudentRepo;

@Component
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	DataSource dataSource;

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public StudentService(DataSource dataSource) {
		this.dataSource = dataSource;
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public Iterable<StudentEntity> getAllStudents() {
		return studentRepo.findAllStudents();
	}

	public Optional<StudentEntity> getStudentById(Long studentId) {
		return studentRepo.findStudentById(studentId);
	}

	public void deleteStudentById(Long studentId) {
		Map<String, Long> namedParameters = Map.of("studentId", studentId);
		String sql = "DELETE FROM students WHERE id = :studentId";
		namedParameterJdbcTemplate.update(sql, namedParameters);

	}

	public void unsubscribeStudent(Long studentId, Long courseId) {
		Map<String, Long> namedParameters = Map.of("studentId", studentId, "courseId", courseId);
		String sql = "DELETE FROM link_student_course WHERE student_id = :studentId AND course_id = :courseId";
		namedParameterJdbcTemplate.update(sql, namedParameters);

	}

}
