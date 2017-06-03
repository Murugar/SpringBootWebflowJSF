package com.iqmsoft.boot.webflow.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component("personForm")
public class PersonFormBean implements Serializable {

    private String firstName;

    private String lastName;
    
    private int age;

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }
}
