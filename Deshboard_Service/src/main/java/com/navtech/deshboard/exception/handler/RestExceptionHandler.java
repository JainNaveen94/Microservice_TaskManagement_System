package com.navtech.deshboard.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.navtech.deshboard.exception.custom.DatabaseGatewayNotFoundConnectionException;
import com.navtech.deshboard.exception.custom.EmployeeNotFoundException;
import com.navtech.deshboard.exception.custom.InvalidEmployeeIDException;
import com.navtech.deshboard.exception.custom.InvalidTaskIDException;
import com.navtech.deshboard.exception.custom.NoTaskFoundException;
import com.navtech.deshboard.exception.custom.TaskNotFoundException;
import com.navtech.deshboard.model.ErrorModel;




@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(InvalidEmployeeIDException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(EmployeeNotFoundException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(DatabaseGatewayNotFoundConnectionException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_GATEWAY.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_GATEWAY);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(InvalidTaskIDException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(TaskNotFoundException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(NoTaskFoundException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(Exception exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
	}

}
