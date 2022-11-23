package com.cdac.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.cdac.crud.entities.Student;
import com.cdac.crud.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository stuRepo;
	
	public Integer saveStudent(Student student) {
		Student stu =  stuRepo.save(student);
		return stu.getStuId();
	}
	
	public List<Student> getAllStudent() {
		List<Student> Student = stuRepo.findAll();
		return Student;
	}
	public void deleteStudentById(Integer id) {
		stuRepo.deleteById(id);
	}
	public Optional<Student> getOneStudent(Integer id) {
		return stuRepo.findById(id);
	}
	public Integer updateStudent(Student Student) {
		Student e = stuRepo.save(Student);
		Integer StuId = e.getStuId();
		return StuId;
	}
}
