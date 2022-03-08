package ru.yandex.incoming34.SpringHomeWork6.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.yandex.incoming34.SpringHomeWork6.entities.StudentEntity;

@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Long>{

}
