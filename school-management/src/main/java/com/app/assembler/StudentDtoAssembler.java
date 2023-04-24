package com.app.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.dto.StudentDto;
import com.app.entity.Student;

@Component
public class StudentDtoAssembler {

	public List<StudentDto>toDtos(List<Student> students){
		
		List<StudentDto> studentDtos=new ArrayList<>();
		students.forEach(student -> studentDtos.add(toDto(student)));
		return studentDtos;
	}
	
	public StudentDto toDto(Student student) {
		
		StudentDto studentDto=new StudentDto();
		studentDto.setId(student.getId());
		studentDto.setName(student.getName());
		
		return studentDto;
	}
	
	public Student fromDto(StudentDto studentDto) {
		
		Student student=new Student();
		student.setId(studentDto.getId());
		student.setName(studentDto.getName());
		
		return student;
	}
}
