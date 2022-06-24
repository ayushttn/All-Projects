package com.springmvc.repositories;

import com.springmvc.model.Address;
import com.springmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address, Long> {
    List<Address> findAddressByUser(User user);
}
