package com.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Long>{

}
