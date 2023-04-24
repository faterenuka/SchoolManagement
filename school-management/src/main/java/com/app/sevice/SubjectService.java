package com.app.sevice;

import java.util.List;

import com.app.entity.Subject;
import com.app.exception.SubjectException;

public interface SubjectService {

    public Subject getSubject(Integer subjectId) throws SubjectException;
	
	public Subject addSubject(Subject subject);
	
	public Subject updateSubject(Subject subject);
	
	public Subject removeSubject(Integer subjectId) throws SubjectException;

	public List<Subject> getSubject(String subjectName);

}
