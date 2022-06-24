package com.RestfulService.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserDaoService Service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return Service.findAll();
    }

    @GetMapping("/user/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id){
        User user = Service.findOne(id);
        if(user==null){
            throw new UserNotFoundException("id-" + id);
        }
        EntityModel<User> resource = EntityModel.of(user);

        WebMvcLinkBuilder linkto = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        resource.add(linkto.withRel("all-users"));
        return resource;

    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = Service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        User user = Service.deleteById(id);
        if(user==null){
            throw new UserNotFoundException("id-" + id);
        }
    }
}
