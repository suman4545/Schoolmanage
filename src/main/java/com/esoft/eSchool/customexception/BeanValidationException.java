package com.esoft.eSchool.customexception;

public class BeanValidationException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	
	public BeanValidationException(String msg) {
	super();
	this.msg=msg;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
