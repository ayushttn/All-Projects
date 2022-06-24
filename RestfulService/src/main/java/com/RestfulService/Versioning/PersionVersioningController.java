package com.RestfulService.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersionVersioningController {

    @GetMapping( value = "/v1/header", headers = "X-API-Version=1")
    public PersonV1 paramV1(){
        return new PersonV1("Bob charlie");
    }

    @GetMapping( value = "/v1/param", params = "version=2")
    public PersonV2 paramV2(){
        return new PersonV2(new Name("Bob", "charlie"));
    }

    @GetMapping("/v2")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Ayush", "Tyagi"));
    }
}
