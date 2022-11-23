package com.cdac.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
	private Integer studentId;
	 @Column(name = "studentname")
		private String studentName;
	 @Column(name = "studentemail")
		private String studentEmail;
	 @Column(name = "studentMobileno")
		private long studentMobileno;
	 @Column(name = "studentAddress")
		private String studentAddress;
	public Integer getStuId() {
		return studentId;
	}
	public void setStuId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public long getStudentMobileno() {
		return studentMobileno;
	}
	public void setStudentMobileno(long studentMobileno) {
		this.studentMobileno = studentMobileno;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	       
}
//-	id
//-	name
//-	email
//-	mobileno
//-	presentAddress

