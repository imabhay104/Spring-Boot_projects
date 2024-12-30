package com.project.ScheduleMaker.schedule;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.ScheduleMaker.schedule.exception.InavlidDataException;

import jakarta.validation.Valid;

@RestController
public class Resource {
	private  SchedulerRpository schedulerRpository;
	private  TimeTableRpository timetableRpository;
	
	public Resource(SchedulerRpository schedulerRpository, TimeTableRpository timetableRpository) {
		super();
		this.schedulerRpository = schedulerRpository;
		this.timetableRpository = timetableRpository;
	}
	
	@GetMapping("/all")
	public List<Timetable> allTimetable()
	{
		return timetableRpository.findAll();
	}
	
	@GetMapping("/timetable/{id}")
	public Optional<Timetable> getById(@PathVariable int id)
	
	{
		return timetableRpository.findById(id);
		
	}
	@DeleteMapping("/timetable/{id}")
	public void DeleteById(@PathVariable int id)
	
	{		Timetable t1=timetableRpository.findById(id).get();
		 timetableRpository.delete(t1);
		
	}
	@PostMapping("/timetable")
	public ResponseEntity<Timetable> saveTimetable(@Valid @RequestBody Timetable timetable,BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
			throw new InavlidDataException("Date in Past");
		}
		else
			{timetableRpository.save(timetable);
			
			URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(timetable.getId()).toUri();
			
			return ResponseEntity.created(location).build();
			
			}
	}
}
	
	

