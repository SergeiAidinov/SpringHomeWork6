package ru.yandex.incoming34.SpringHomeWork6.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.SpringHomeWork6.entities.StudentAbstract;
import ru.yandex.incoming34.SpringHomeWork6.entities.StudentEntity;

@Repository
public interface StudentRepo extends CrudRepository<StudentAbstract, Long>{
	
	@Query(nativeQuery = true, value ="SELECT id, name FROM students")
	Iterable<StudentEntity> findAllStudents();

	@Query(nativeQuery = true, value ="SELECT id, name FROM students WHERE id = :id")
	Optional<StudentEntity> findStudentById(@Param("id") Long studentId);

}
