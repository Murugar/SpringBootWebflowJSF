package com.iqmsoft.boot.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.iqmsoft.boot.webflow.person.entity.Address;
import com.iqmsoft.boot.webflow.person.entity.Country;
import com.iqmsoft.boot.webflow.person.entity.Person;
import com.iqmsoft.boot.webflow.person.service.PersonService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.iqmsoft.boot.webflow.person.repository" })
@EntityScan(basePackages = {"com.iqmsoft.boot.webflow.person.entity"})
public class SpringWebflowJsfApplication implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebflowJsfApplication.class, args);
    }

    @Override
    public void run ( String... args ) throws Exception {
        Person person = new Person ( "Hans", "Mustermann", 29);
        Address address = new Address ( "Hauptstrasse 12", "70179", "Stuttgart", Country.GERMANY, "12345", "test@example.com" );
        person.getAddresses ().add ( address );
        personService.save ( person );
        person = new Person ( "Sabine", "Huber", 30);
        address = new Address ( "Mainstreet 1a", "55555", "London", Country.GB, "12345", "dummy@example.com" );
        person.getAddresses ().add ( address );
        personService.save ( person );
        
        person = new Person ( "Sabine1", "Huber1" , 30);
        address = new Address ( "Mainstreet 1a", "55555", 
        		"London", Country.GB, "12345", "dummy1@example.com" );
        person.getAddresses ().add ( address );
        personService.save ( person );
        
        person = new Person ( "Sabine2", "Huber2", 30);
        address = new Address ( "Mainstreet 1a", "55555", 
        		"London", Country.GB, "12345", "dummy2@example.com" );
        person.getAddresses ().add ( address );
        personService.save ( person );
        
    }
}
