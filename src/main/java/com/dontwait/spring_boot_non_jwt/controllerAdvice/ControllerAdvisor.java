package com.dontwait.spring_boot_non_jwt.controllerAdvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dontwait.spring_boot_non_jwt.dto.ErrorResponseDto;
import com.dontwait.spring_boot_non_jwt.exceptions.FieldRequiredExeption;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> handleArthmeticException(
			ArithmeticException ex, 
			WebRequest request) {

        ErrorResponseDto err = new ErrorResponseDto();
        err.setError(ex.getMessage());
        List<String> details = new ArrayList<String>();
        details.add("So nguyen khong chia het cho 0");
        err.setDetails(details);

        return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler(FieldRequiredExeption.class)
	public ResponseEntity<Object> handleFieldRequiredException(
			FieldRequiredExeption ex, 
			WebRequest request) {

        ErrorResponseDto err = new ErrorResponseDto();
        err.setError(ex.getMessage());
        List<String> details = new ArrayList<String>();
        details.add("Check again name or numberOfBasement because u have null field");
        err.setDetails(details);

        return new ResponseEntity<>(err, HttpStatus.BAD_GATEWAY);
    }
}
