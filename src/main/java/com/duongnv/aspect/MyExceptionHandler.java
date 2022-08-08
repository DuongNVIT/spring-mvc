package com.duongnv.aspect;

import com.duongnv.dto.ErrorResponseDTO;
import com.duongnv.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

    private ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();

    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponseDTO customeExceptionHandler(CustomException exception) {
        errorResponseDTO.setMessage(exception.getMessage());
        errorResponseDTO.setStatus(HttpStatus.BAD_REQUEST.value());
        return errorResponseDTO;
    }

}
