package com.iqmsoft.boot.webflow.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.boot.webflow.person.entity.Person;


public interface PersonRepository extends JpaRepository<Person,Long> {
}
