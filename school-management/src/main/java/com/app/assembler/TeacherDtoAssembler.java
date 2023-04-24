package com.app.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dto.TeacherDto;
import com.app.entity.Teacher;

@Component
public class TeacherDtoAssembler {

	@Autowired
	private SubjectDtoAssembler subjectDtoAssembler;
	
	public TeacherDto toDto(Teacher teacher) {
		
		TeacherDto teacherDto=new TeacherDto();
		teacherDto.setId(teacher.getId());
		teacherDto.setFirst_name(teacher.getFirst_name());
		teacherDto.setLast_name(teacher.getLast_name());
		
		return teacherDto;
	}
	
	public Teacher fromDto(TeacherDto teacherDto) {
		
		Teacher teacher=new Teacher();
		teacher.setId(teacherDto.getId());
		teacher.setFirst_name(teacherDto.getFirst_name());
		teacher.setLast_name(teacherDto.getLast_name());
		
		return teacher;
	}
}
