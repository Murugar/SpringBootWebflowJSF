package com.iqmsoft.boot.webflow.person.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.boot.webflow.person.entity.Person;

import java.util.List;


public interface PersonService {

    @Transactional(readOnly = true)
    List<Person> findAll ();

    @Transactional(readOnly = true)
    Page<Person> findAll ( Pageable pageable );

    @Transactional
    Person save ( Person entity );

    @Transactional(readOnly = true)
    Person findOne ( Long aLong );

    @Transactional(readOnly = true)
    long count ();

    @Transactional(readOnly = true)
    boolean exists ( Long aLong );

    @Transactional
    void delete ( Long aLong );

    @Transactional
    void deleteAll ();
}
