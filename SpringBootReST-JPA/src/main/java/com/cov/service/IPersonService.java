package com.cov.service;

import java.util.List;

import com.cov.beans.Person;
import com.cov.exception.InvalidPersonIdException;

public interface IPersonService {

	List<Person> findAll();

	Person findById(int id) throws InvalidPersonIdException;

	Person insert(Person person);

	Person update(Person person) throws InvalidPersonIdException;

	Person delete(int id) throws InvalidPersonIdException;

}