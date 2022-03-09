package ru.yandex.incoming34.SpringHomeWork6.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public abstract class StudentAbstract {
	
	@Id
	@Column(name = "id")
	private Long studentId;
	
	public Long getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "name")
	private String studentName;
}
