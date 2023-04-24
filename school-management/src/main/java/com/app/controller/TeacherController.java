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

import com.app.entity.Teacher;
import com.app.exception.TeacherException;
import com.app.sevice.TeacherService;

@RestController
public class TeacherController {

	 @Autowired
	 TeacherService teacherService;
	
	 @GetMapping("/teacher")
	 public ResponseEntity<Teacher> getTeacher(@RequestParam Integer teacherId) throws TeacherException{
		 
		 return new ResponseEntity<Teacher>(teacherService.getTeacher(teacherId), HttpStatus.OK);
	 }
		
	 @PostMapping("/teacher")
	 public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher){
		 
		 return new ResponseEntity<Teacher>(teacherService.addTeacher(teacher), HttpStatus.CREATED);
	 }
		
	 @PutMapping("/teacher")
	 public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher){
		 
		 return new ResponseEntity<Teacher>(teacherService.updateTeacher(teacher), HttpStatus.OK);
	 }
		
	 @DeleteMapping("/teacher")
	 public ResponseEntity<Teacher> removeTeacher(@RequestParam Integer teacherId) throws TeacherException{
		 
		 return new ResponseEntity<Teacher>(teacherService.removeTeacher(teacherId), HttpStatus.OK);
	 }
	 
	 @PutMapping("/teacher/subjects")
	 public ResponseEntity<Teacher> mappedSubjectsToTeacher(@RequestBody List<Integer> subjectIds,@RequestParam Integer teacherId) throws TeacherException {
			
		return new ResponseEntity<Teacher>(teacherService.mapSubjectsToTeacher(subjectIds, teacherId), HttpStatus.OK);
	 }
}
