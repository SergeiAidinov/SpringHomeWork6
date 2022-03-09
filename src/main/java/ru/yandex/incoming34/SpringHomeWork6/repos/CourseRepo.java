package ru.yandex.incoming34.SpringHomeWork6.repos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.SpringHomeWork6.entities.CourseAbstract;
import ru.yandex.incoming34.SpringHomeWork6.entities.CourseEntity;
import ru.yandex.incoming34.SpringHomeWork6.entities.CourseBriefEntity;

@Repository
public interface CourseRepo extends CrudRepository<CourseAbstract, Long>{

	@Query(nativeQuery = true, value = "SELECT id, name FROM courses")
	Iterable<CourseEntity> findAllCoursesWithStudents();

	@Query(nativeQuery = true, value = "SELECT id, name FROM courses")
	Iterable<CourseBriefEntity> findAllCoursesWithoutStudents();

}
