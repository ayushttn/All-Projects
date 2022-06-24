package com.springmvc.service;

import com.springmvc.dto.UserDto;
import com.springmvc.model.Address;
import com.springmvc.model.ContactNumber;
import com.springmvc.model.User;
import com.springmvc.repositories.AddressRepo;
import com.springmvc.repositories.ContactRepo;
import com.springmvc.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ContactRepo contactRepo;

    @Autowired
    private ModelMapper modelMapper;

    public User createUser(UserDto userDto, List<String> address, List<Long> contacts){
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setAge(userDto.getAge());
        user.setGender(userDto.getGender());
        List<Address> addresses = new ArrayList<>();
        //userRepo.save(user);
        for (String s : address) {
            Address address1 = new Address();
            address1.setAddress(s);
            addresses.add(address1);
            address1.setUser(user);
//            addressRepo.save(address1);
        }
        //addressRepo.saveAll(addresses);
        List<ContactNumber> contactNumbers = new ArrayList<>();
        for (Long contact : contacts) {
            ContactNumber contactNumber = new ContactNumber();
            contactNumber.setContactNo(contact);
            contactNumbers.add(contactNumber);
            contactNumber.setUser(user);
            //contactRepo.save(contactNumber);
        }
        user.setAddress(addresses);
        user.setContactNo(contactNumbers);
        userRepo.save(user);
        return user;
    }

    public List<UserDto> getAll(){
        List<User> allUsers = userRepo.findAll();
        List<UserDto> allUser = new ArrayList<>();
        for(User u: allUsers){
            UserDto userDto = new UserDto();
            modelMapper.map(u, userDto);
            List<Address> addresses = addressRepo.findAddressByUser(u);
            String address = new String();
            for (Address a:addresses){
                address += a.getAddress() + ", ";
            }
            userDto.setAddress(address);
            List<ContactNumber> contactNumbers = contactRepo.findAllByUser(u);
            String contactNo = new String();
            for (ContactNumber c: contactNumbers){
                contactNo += c.getContactNo() + ", ";
            }
            userDto.setContactNo(contactNo);
            allUser.add(userDto);
        }
        return allUser;
    }
}
