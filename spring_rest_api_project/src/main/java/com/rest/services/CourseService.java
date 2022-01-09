package com.rest.services;
import java.util.List;

import com.rest.entities.*;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long course_id);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);

}
