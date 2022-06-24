package com.springmvc.dto;


import com.springmvc.model.Address;
import com.springmvc.model.ContactNumber;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String address;
    private String contactNo;
}
