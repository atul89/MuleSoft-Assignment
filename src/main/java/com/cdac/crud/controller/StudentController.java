package com.cdac.crud.controller;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cdac.crud.entities.Student;
import com.cdac.crud.service.StudentService;
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService StudentService;

	@GetMapping("/register")
	public String showRegisterPage() {
		return "register";
	}

	@PostMapping("savestudent")
	public String registerStudent(@ModelAttribute Student student, Model model) {
		Integer stuId = StudentService.saveStudent(student);
		String message = "Student Registered Successfully, Stu Id : " + stuId;
		model.addAttribute("message", message);
		return "register";
	}

	
	@GetMapping("/show")
	public String showAllStudents(Model model) {
		List<Student> Student= StudentService.getAllStudent();
		model.addAttribute("Student", Student);
		return "show_Student";
	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("stuId") Integer stuId, Model model) {
		StudentService.deleteStudentById(stuId);
		List<Student> Student = StudentService.getAllStudent();
		model.addAttribute("Student", Student);
		return "show_Student";
	}

	@GetMapping("/edit")
	public String showEdit(@RequestParam("stuId") Integer stuId, Model model) {
		Optional<Student> Student = StudentService.getOneStudent(stuId);
		model.addAttribute("Student", Student);
		return "edit_student";
	}

	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student Student,Model model) {
		Integer stuId = StudentService.updateStudent(Student);
		String message = "Student Updated, Id : " + stuId;
		List<Student> stu = StudentService.getAllStudent();
		model.addAttribute("student", stu);
		model.addAttribute("message", message);
		return "show_student";
	}
}
