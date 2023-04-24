package com.app.sevice;

import java.util.List;

import com.app.entity.Teacher;
import com.app.exception.TeacherException;

public interface TeacherService {

    public Teacher getTeacher(Integer teacherId) throws TeacherException;
	
	public Teacher addTeacher(Teacher teacher);
	
	public Teacher updateTeacher(Teacher teacher);

	public Teacher removeTeacher(Integer teacherId) throws TeacherException;

	public Teacher mapSubjectsToTeacher(List<Integer>subjectIds,Integer teacherId) throws TeacherException;

}
