package com.springmvc.repositories;

import com.springmvc.model.ContactNumber;
import com.springmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepo extends JpaRepository<ContactNumber, Long> {

    List<ContactNumber> findAllByUser(User user);
}
