package com.springdata.idgenerators;

import com.springdata.idgenerators.entities.Employee;
import com.springdata.idgenerators.repos.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdgeneratorsApplicationTests {

    @Autowired
    EmployeeRepo er;

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setName("John");
        er.save(employee);
    }
}
