package com.ponentmapping;

import com.ponentmapping.entities.Address;
import com.ponentmapping.entities.Employee;
import com.ponentmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentmappingApplicationTests {

    @Autowired
    EmployeeRepository repository;

    @Test
    public void create() {
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("Ayush");
        Address address = new Address();
        address.setCity("New Delhi");
        address.setStreetAddress("Burari");
        address.setState("Delhi");
        address.setZipcode("110084");
        address.setCountry("India");
        employee.setAddress(address);
        repository.save(employee);
    }

}
