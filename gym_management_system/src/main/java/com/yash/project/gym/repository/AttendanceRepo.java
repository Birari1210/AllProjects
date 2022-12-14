package com.yash.project.gym.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.project.gym.model.Attendance;


public interface AttendanceRepo  extends CrudRepository<Attendance,Integer>{

}
