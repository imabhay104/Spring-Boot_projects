package com.project.ScheduleMaker.schedule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;

@Entity
@Table(name = "TIMETABLE")
public class Timetable {
	@Id
	@GeneratedValue
	private int id;
    @OneToMany(mappedBy = "timetable", cascade = CascadeType.ALL)
	 @JsonManagedReference
	private List<Schedule> list=new ArrayList<>();
    @Future(message = "Please Enter date in Future")
	private LocalDate date;
	public Timetable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Timetable(int id,List<Schedule> list, LocalDate date) {
		super();
		this.id=id;
		this.list = list;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Schedule> getList() {
		return list;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setList(List<Schedule> list) {
		this.list = list;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
