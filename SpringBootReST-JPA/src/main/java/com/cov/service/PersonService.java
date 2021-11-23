package com.cov.service;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov.beans.Person;
import com.cov.exception.InvalidPersonIdException;
import com.cov.repo.PersonRepository;

@Service
public class PersonService implements IPersonService {
	Logger logger = Logger.getLogger(PersonService.class);
	@Autowired
	PersonRepository personRepository;

	@Override
	public List<Person> findAll() {
		logger.info("finding all persons");
		return personRepository.findAll();
	}

	@Override
	public Person findById(int id) throws InvalidPersonIdException {
		logger.info("finding person with id: " + id);
		Optional<Person> personOptional = personRepository.findById(id);
		if (!personOptional.isPresent()) {
			
			InvalidPersonIdException invalidPersonIdException = new InvalidPersonIdException("Person id not found");
			logger.warn(invalidPersonIdException);

			throw  invalidPersonIdException;

		}
		Person person = personOptional.get();
		logger.info("person found with id " + id + "is" + person.getFirstname() + " " + person.getLastname());
		return person;
	}

	@Override
	public Person insert(Person person) {
		logger.info("inserting a person");
		InvalidPersonIdException invalidPersonIdException = new InvalidPersonIdException("Person id not found");
		
		return personRepository.save(person);
	}

	@Override
	public Person update(Person person) throws InvalidPersonIdException {
		logger.info("updating person ");
		Optional<Person> personOptional = personRepository.findById(person.getId());
		
		if (!personOptional.isPresent()) {
			InvalidPersonIdException invalidPersonIdException = new InvalidPersonIdException("Person id not found");
			logger.warn(invalidPersonIdException);
			throw new InvalidPersonIdException();
		}
		logger.info("person updated " + "is" + person.getFirstname() + " " + person.getLastname());
		return personRepository.save(person);
	}

	@Override
	public Person delete(int id) throws InvalidPersonIdException {
		logger.info("deleting person with id " + id);
		Optional<Person> personOptional = personRepository.findById(id);
		
		if (!personOptional.isPresent()) {
			InvalidPersonIdException invalidPersonIdException = new InvalidPersonIdException("Person id not found");
			logger.warn(invalidPersonIdException);
			throw new InvalidPersonIdException();
		}
		Person person = personOptional.get();
		personRepository.deleteById(id);
		logger.info("person deleted " + "is with id " + id + " " + person.getFirstname() + " " + person.getLastname());
		return person;
	}
}
