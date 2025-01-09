package com.oaktecnologia.meuestagio.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ValidationError extends StandardErro{
	
	private List<FieldMessage> erros = new ArrayList<>();
	
	public ValidationError(LocalDateTime timestemp, Integer status, String message, String path) {
		super(timestemp, status, message, path);
		// TODO Auto-generated constructor stub
	}
	
	public List<FieldMessage> getErrors(){
		return erros;
	}

	
	public void addErros(String fieldName, String message) {
		this.erros.add(new FieldMessage(fieldName, message));
	}
}
