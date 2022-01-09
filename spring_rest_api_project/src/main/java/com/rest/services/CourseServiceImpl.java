package com.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.CourseDao;
import com.rest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	//List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
		
		
		
		
//		list=new ArrayList<>();
//		list.add(new Course(123,"Java"));
//		list.add(new Course(124,"Spring"));
//		list.add(new Course(125,"Spring MVC"));
	}
	
	@Override
	public List<Course> getCourses() 
	{
		return this.courseDao.findAll();
		//return list;
	}

	
	@Override
	public Course getCourse(long course_id)
	{
		
		
		
//		for(Course cour:list)
//		{
//			if(cour.getId()==course_id)
//			{
//				return cour;
//			}
//		}
//	return null;
		
		return courseDao.getOne(course_id);
	}

	@Override
	public Course addCourse(Course course) {
		
		
//		list.add(course);
		
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		
		
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				//e.setId(course.getId());
//				e.setTitle(course.getTitle());
//			}
//		});
		courseDao.save(course);  //there is no option called update so we can update by calling save(entity)
		return course;
	}

}
