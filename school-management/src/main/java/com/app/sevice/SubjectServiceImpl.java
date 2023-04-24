package com.app.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.entity.Subject;
import com.app.exception.SubjectException;
import com.app.repo.SubjectRepo;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectRepo subjectRepo;
	
	@Override
	public Subject getSubject(Integer subjectId) throws SubjectException {
		
		return subjectRepo.findById(subjectId).orElseThrow(() -> new SubjectException("Subject is not found with id: "+subjectId));
	}

	@Override
	public Subject addSubject(Subject subject) {
		
		return subjectRepo.save(subject);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		
		return subjectRepo.save(subject);
	}

	@Override
	public Subject removeSubject(Integer subjectId) throws SubjectException {
		Subject subject=getSubject(subjectId);
		subjectRepo.delete(subject);
		return subject;
	}

	@Override
	public List<Subject> getSubject(String subjectName) {
		
		return subjectRepo.findByName(subjectName);
	}

}
