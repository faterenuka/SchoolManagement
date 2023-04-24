package com.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentException.class) 
	public ResponseEntity<MyErrorDetails> studentExceptionHandler(StudentException e,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(e.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(TeacherException.class) 
	public ResponseEntity<MyErrorDetails> teacherExceptionHandler(TeacherException e,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(e.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(SubjectException.class) 
	public ResponseEntity<MyErrorDetails> subjectExceptionHandler(SubjectException e,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(e.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(Exception.class) 
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception e,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(e.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
}
