package com.iqmsoft.boot.webflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iqmsoft.boot.webflow.beans.PersonFormBean;
import com.iqmsoft.boot.webflow.person.entity.Person;
import com.iqmsoft.boot.webflow.person.service.PersonService;


@Controller("personController")
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonFormBean createNew() {
        return new PersonFormBean ();
    }

    public String savePerson( PersonFormBean personFormBean ) {
    	
    	System.out.println("Save Person " + personFormBean);
    	
        personService.save ( new Person 
        		( personFormBean.getFirstName (), personFormBean.getLastName ()
        				, personFormBean.getAge()) );
        return "success";
    }
    
    public String savePerson1() {
      
        return "success";
    }

}
