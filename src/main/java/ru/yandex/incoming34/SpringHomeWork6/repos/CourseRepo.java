package ru.yandex.incoming34.SpringHomeWork6.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.SpringHomeWork6.entities.CourseEntity;

@Repository
public interface CourseRepo extends CrudRepository<CourseEntity, Long>{

}
