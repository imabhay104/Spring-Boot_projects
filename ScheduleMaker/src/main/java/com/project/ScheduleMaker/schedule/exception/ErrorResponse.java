package com.project.ScheduleMaker.schedule.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
	private String message;
	private LocalDateTime dateTime;
	private int status;
	public ErrorResponse(String message, LocalDateTime dateTime, int status) {
		super();
		this.message = message;
		this.dateTime = dateTime;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public int getStatus() {
		return status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
