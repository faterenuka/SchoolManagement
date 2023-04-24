package com.app.sevice;

import java.util.List;

import com.app.entity.Student;
import com.app.exception.StudentException;

public interface StudentService {

	public Student getStudent(Integer studentId) throws StudentException;
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student removeStudent(Integer studentId) throws StudentException;

	public Student mapSubjectsToStudent(List<Integer>subjectIds,Integer studentId) throws StudentException;

	Student removeSubjectFromStudent(Integer studentId, List<Integer> subjectId) throws StudentException;


}
