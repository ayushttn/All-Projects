package com.example.form.controller;

import com.example.form.bean.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/form/add.htm")
public class AjaxController {
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Form add(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Form form = new Form();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");

        form.setFirstName(firstName);
        form.setLastName(lastName);
        form.setAge(age);
        form.setAddress(address);
        form.setGender(gender);

        return form;
    }
}
