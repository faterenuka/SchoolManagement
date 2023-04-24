package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.exception.StudentException;
import com.app.sevice.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
    public ResponseEntity<Student> getStudent(@RequestParam Integer studentId) throws StudentException{
    	
    	return new ResponseEntity<Student>(studentService.getStudent(studentId), HttpStatus.OK);
    }
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.updateStudent(student), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/student")
    public ResponseEntity<Student> removeStudent(@RequestParam Integer studentId) throws StudentException{
    	
    	return new ResponseEntity<Student>(studentService.removeStudent(studentId), HttpStatus.OK);
    }
	
	@PutMapping("/student/subjects")
	public ResponseEntity<Student> mappedSubjectsToStudents(@RequestBody List<Integer> subjectIds,@RequestParam Integer studentId) throws StudentException {
		
		return new ResponseEntity<Student>(studentService.mapSubjectsToStudent(subjectIds, studentId), HttpStatus.OK);
	}
}
