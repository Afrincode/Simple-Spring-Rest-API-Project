package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Course;
import com.rest.services.CourseService;

@RestController
class MyController 
{
	@Autowired
	private CourseService course_service;
	
//	@GetMapping("/home")
//	public String home()
//	{
//		return "this is home";
//	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		try {
		return this.course_service.getCourses();}
		catch(Exception e) {
			
		}
		return null;
	}
	
	@GetMapping("/courses/{course_id}")
	public Course getCourse(@PathVariable String course_id)
	{
		return this.course_service.getCourse(Long.parseLong(course_id));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return course_service.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.course_service.updateCourse(course);
	}
}
