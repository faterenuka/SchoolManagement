package com.app.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Subject;
import com.app.entity.Teacher;
import com.app.exception.TeacherException;
import com.app.repo.SubjectRepo;
import com.app.repo.TeacherRepo;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepo teacherRepo;
	
	@Autowired
	SubjectRepo subjectRepo;
	
	@Override
	public Teacher getTeacher(Integer teacherId) throws TeacherException {
		
		return teacherRepo.findById(teacherId).orElseThrow(() -> new TeacherException("Teacher not found with id: "+teacherId));
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher removeTeacher(Integer teacherId) throws TeacherException {
		
		Teacher teacher=getTeacher(teacherId);
		teacherRepo.delete(teacher);
		return teacher;
	}

	@Override
	public Teacher mapSubjectsToTeacher(List<Integer> subjectIds, Integer teacherId) throws TeacherException {
		
		Teacher teacher=getTeacher(teacherId);
		List<Subject> subjects=subjectRepo.findAllById(subjectIds);
		teacher.getSubjects().addAll(subjects);
		return teacherRepo.save(teacher);
	}

}
