package com.axione.validateur.stoc.rest.model;

import java.util.Arrays;
import java.util.List;

public class ResponseTemplate <T>{
	
	String status;
	String code;
	List<T> response;
			
	
	public ResponseTemplate(String status, String code, List<T> response) {
		this.status = status;
		this.code = code;
		this.response = response;
	}
	
	public ResponseTemplate( List<T> response) {
		this.status = "OK";
		this.code = "1000";
		this.response = response;
	}
	
	public ResponseTemplate( T response) {
		this.status = "OK";
		this.code = "1000";
		this.response = Arrays.asList(response);
	}
	
	public ResponseTemplate(String status, String code ,T response) {
		this.status = status;
		this.code = code;
		this.response = Arrays.asList(response);
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<T> getResponse() {
		return response;
	}
	public void setResponse(List<T> response) {
		this.response = response;
	}
	
	

}
