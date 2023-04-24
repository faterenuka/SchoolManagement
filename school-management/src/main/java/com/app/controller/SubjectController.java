package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.assembler.SubjectDtoAssembler;
import com.app.dto.SubjectDto;
import com.app.entity.Subject;
import com.app.exception.SubjectException;
import com.app.sevice.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@Autowired
	SubjectDtoAssembler assembler;
	
	@GetMapping("/Subject")
    public ResponseEntity<SubjectDto> getSubject(@RequestParam Integer subjectId) throws SubjectException{
    	
		Subject subject=subjectService.getSubject(subjectId);
    	return new ResponseEntity<SubjectDto>(assembler.toDto(subject), HttpStatus.OK);
   
	 //return null;	
	}
	
	@GetMapping("/subject/{name}")
	public ResponseEntity<List<SubjectDto>> getSubject(@PathVariable("name") String subjectName) {
		
		return new ResponseEntity<List<SubjectDto>>(assembler.toDtos(subjectService.getSubject(subjectName)), HttpStatus.OK);
	}
	@PostMapping("/Subject")
	public ResponseEntity<Subject> addSubject(@RequestBody Subject subject){
		
		return new ResponseEntity<Subject>(subjectService.addSubject(subject), HttpStatus.CREATED);
	}
	
	@PutMapping("/Subject")
	public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject){
		
		return new ResponseEntity<Subject>(subjectService.updateSubject(subject), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/Subject")
	public ResponseEntity<Subject> removeSubject(@RequestParam Integer subjectId) throws SubjectException{
		
		return new ResponseEntity<Subject>(subjectService.removeSubject(subjectId), HttpStatus.ACCEPTED);
	}
}
