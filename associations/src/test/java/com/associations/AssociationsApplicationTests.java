package com.associations;

import com.associations.entities.Customer;
import com.associations.entities.PhoneNumber;
import com.associations.repos.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class AssociationsApplicationTests {

    @Autowired
    CustomerRepository repository;

    @Test
    public void create() {
        Customer customer = new Customer();
        customer.setName("Ayush");
        PhoneNumber ph1 = new PhoneNumber();
        ph1.setNumber("9811206442");
        ph1.setType("MobileNo");
        customer.addPhoneNumber(ph1);
        PhoneNumber ph2 = new PhoneNumber();
        ph2.setNumber("7011155722");
        ph2.setType("PhoneNo");
        customer.addPhoneNumber(ph2);
        repository.save(customer);
    }

    @Test
    public void testLoadCustomer(){

    }

    @Test
    public void testDelete(){
    }

}
