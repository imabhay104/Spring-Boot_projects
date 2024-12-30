package com.project.ScheduleMaker.schedule;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {
	@Id
	@GeneratedValue
	private int id;
	private String taskName;
	private Boolean done;
	@ManyToOne
	 @JoinColumn(name = "timetable_id")
    @JsonBackReference 
    private Timetable timetable;
	
	public Schedule() {
			}
	
	public Timetable getTimetable() {
		return timetable;
	}

	public void setTimetable(Timetable timetable ) {
		this.timetable = timetable;
	}

	public Schedule(int id,String taskName, Boolean done) {
		super();
		this.id=id;
		this.taskName = taskName;
		this.done = done;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public Boolean getDone() {
		return done;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setDone(Boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "Schedule [taskName=" + taskName + ", done=" + done + "]";
	}
	
	

}
