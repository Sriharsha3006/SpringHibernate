package com.uwyo.responsestatus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Student Not Found")
public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8324130489309452429L;

}
