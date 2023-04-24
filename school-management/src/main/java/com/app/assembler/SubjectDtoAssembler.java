package com.app.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dto.SubjectDto;
import com.app.entity.Subject;

@Component
public class SubjectDtoAssembler {

	@Autowired
	private StudentDtoAssembler studentDtoAssembler;
	
	public List<SubjectDto> toDtos(List<Subject> subjects){
		
		List<SubjectDto> subjectDtos=new ArrayList<>();
		subjects.forEach(subject ->subjectDtos.add(toDto(subject)));
//		for(int i=0;i<subjects.size();i++) {
//			subjectDtos.add(toDto(subjects.get(i)));
//		}
		return subjectDtos;
	}
	public SubjectDto toDto(Subject subject) {
		
		SubjectDto subdto=new SubjectDto();
		subdto.setId(subject.getId());
		subdto.setName(subject.getName());
		subdto.setStudents(studentDtoAssembler.toDtos(subject.getStudents()));
		return subdto;
	}
	
	public Subject fromDto(SubjectDto subjectDto) {
		
		Subject subject=new Subject();
		subject.setId(subjectDto.getId());
		subject.setName(subjectDto.getName());
		
		return subject;
	}
}
