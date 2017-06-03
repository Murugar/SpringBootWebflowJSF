package com.iqmsoft.boot.webflow.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.iqmsoft.boot.webflow.person.entity.Person;
import com.iqmsoft.boot.webflow.person.repository.PersonRepository;

import java.util.List;


@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll () {
        return personRepository.findAll ();
    }

    @Override
    public Page<Person> findAll ( Pageable pageable ) {
        return personRepository.findAll ( pageable );
    }

    @Override
    public Person save ( Person entity ) {
        return personRepository.save ( entity );
    }

    @Override
    public Person findOne ( Long aLong ) {
        return personRepository.findOne ( aLong );
    }

    @Override
    public long count () {
        return personRepository.count ();
    }

    @Override
    public boolean exists ( Long aLong ) {
        return personRepository.exists ( aLong );
    }

    @Override
    public void delete ( Long aLong ) {
        personRepository.delete ( aLong );
    }

    @Override
    public void deleteAll () {
        personRepository.deleteAll ();
    }
}
