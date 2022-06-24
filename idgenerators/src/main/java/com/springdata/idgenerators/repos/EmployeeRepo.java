package com.springdata.idgenerators.repos;

import com.springdata.idgenerators.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
