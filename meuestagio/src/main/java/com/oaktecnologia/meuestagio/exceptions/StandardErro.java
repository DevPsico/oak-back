package com.oaktecnologia.meuestagio.exceptions;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class StandardErro {

	@JsonFormat(pattern = "HH:mm - dd/MM/yyyy")
	private LocalDateTime timestemp;
	private Integer status;
	private String message;
	private String path;

	public StandardErro(LocalDateTime timestemp, Integer status, String message, String path) {
		super();
		this.timestemp = timestemp;
		this.status = status;
		this.message = message;
		this.path = path;
	}
}