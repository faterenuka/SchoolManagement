package com.app.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.entity.Student;
import com.app.entity.Subject;
import com.app.exception.StudentException;
import com.app.repo.StudentRepo;
import com.app.repo.SubjectRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	SubjectRepo subjectRepo;
	
	@Override
	public Student getStudent(Integer studentId) throws StudentException {
		
		return studentRepo.findById(studentId).orElseThrow(() -> new StudentException("Student not found with is : "+studentId));
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student removeStudent(Integer studentId) throws StudentException {
		
		Student student=getStudent(studentId);
	    studentRepo.delete(student);
		return student;
	}

	@Override
	public Student mapSubjectsToStudent(List<Integer> subjectIds, Integer studentId) throws StudentException {
		
		Student student=getStudent(studentId);
		List<Subject>subjects=subjectRepo.findAllById(subjectIds);
		student.getSubjects().addAll(subjects);
		return studentRepo.save(student);
	}

	@Override
	public Student removeSubjectFromStudent(Integer studentId, List<Integer> subjectIds) throws StudentException {
	
		Student student=getStudent(studentId);
		List<Subject>subjects=student.getSubjects();
		for(int i=0;i<subjects.size();i++) {
			for(int j=0;j<subjectIds.size();j++) {
				if(subjectIds.get(j)==subjects.get(i).getId()) {
					subjects.remove(i);
				}
			}
		}
		return studentRepo.save(student);
	}

}
