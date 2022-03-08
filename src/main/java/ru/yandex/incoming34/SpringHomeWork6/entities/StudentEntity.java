package ru.yandex.incoming34.SpringHomeWork6.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {
	
	
	@Id
	@Column(name = "id")
	Long studentId;
	@Column(name = "name")
	String studentName;
	
	public Long getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
