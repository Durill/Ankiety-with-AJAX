package com.example.Ankiety;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxRestController {

    @RequestMapping(value="/user/add_user", method = RequestMethod.POST)
    public String addUser(@Param("formName") String formName, @Param("email") String email){
        System.out.println(formName);
        System.out.println(email);

        if(formName!=null){
            return "everything is good";
        }else {
            return "sth is fucked";
        }
    }
}
