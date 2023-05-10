package com.Employee.Employee.common;

import com.Employee.Employee.customError.Not_Found_Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Not_Found_Exception.class)
    public ResponseEntity<CustomErrorResponse> handleNotFoundException(Not_Found_Exception ex){
        CustomErrorResponse error =new CustomErrorResponse();
        error.setTimestamp(LocalDateTime.now());
        error.setMessage(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.toString());
        error.setError("Not_Found_Employee");
        return new ResponseEntity<CustomErrorResponse>(error,HttpStatus.NOT_FOUND);
    }
}
