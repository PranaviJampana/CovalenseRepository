package com.cov.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cov.beans.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}