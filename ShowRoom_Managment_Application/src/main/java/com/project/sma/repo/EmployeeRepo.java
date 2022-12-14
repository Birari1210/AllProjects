package com.project.sma.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.sma.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>
{
      	
}
