package com.felipe.cursomc.servvices.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -5013750193700138633L;

	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
