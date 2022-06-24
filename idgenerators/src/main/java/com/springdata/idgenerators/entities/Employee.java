package com.springdata.idgenerators.entities;

import com.springdata.idgenerators.CustomIdGenerator;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Employee {
    //@TableGenerator(name = "employee_gen" ,table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
    @GenericGenerator(name="emp_id", strategy = "com.springdata.idgenerators.CustomIdGenerator")
    @GeneratedValue(generator =  "emp_id")
    @Id
    //@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
