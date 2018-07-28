package com.esoft.eSchool.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandle {

	@ExceptionHandler({ BeanValidationException.class})
    public ResponseEntity<String> handleException() {
        
		return new ResponseEntity<String>("ERROR", HttpStatus.OK);
		
		
		
    }
	
	
}
