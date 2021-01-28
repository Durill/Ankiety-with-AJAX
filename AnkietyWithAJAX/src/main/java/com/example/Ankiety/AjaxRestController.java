package com.example.Ankiety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxRestController {

    @Autowired
    private FormsRepository formsRepository;

    @RequestMapping(value="/user/add_user", method = RequestMethod.POST)
    public String addUser(@Param("formName") String formName, @Param("email") String email, Forms forms){
        System.out.println(formName);
        System.out.println(email);
        formsRepository.save(forms);

        if(formName!=null){
            return "everything is good";
        }else {
            return "sth is fucked";
        }
    }
}
