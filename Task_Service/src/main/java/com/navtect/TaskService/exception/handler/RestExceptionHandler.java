package com.navtect.TaskService.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.navtect.TaskService.exception.custom.DataBaseGatewayNotConnectedException;
import com.navtect.TaskService.exception.custom.InvalidEmployeeIDException;
import com.navtect.TaskService.exception.custom.InvalidTaskIDException;
import com.navtect.TaskService.exception.custom.NoTaskFoundException;
import com.navtect.TaskService.exception.custom.TaskNotFoundException;
import com.navtect.TaskService.model.ErrorModel;


@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(DataBaseGatewayNotConnectedException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_GATEWAY.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(InvalidTaskIDException exception) {
		return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorModel> handlerException(InvalidEmployeeIDException exception) {
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