package com.cov.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cov.beans.Person;
import com.cov.repo.PersonRepository;

@TestInstance(Lifecycle.PER_CLASS)
class IPersonServiceTest {

	@InjectMocks
	PersonService personService;

	@Mock
	PersonRepository personRepository;

	@BeforeAll
	public void init() {
		MockitoAnnotations.initMocks(this);
		List<Person> person = new ArrayList<>();
		person.add(new Person(1, "pranavi", "varma"));
		person.add(new Person(2, "jahnavi", "varma"));
		person.add(new Person(3, "jyothi", "jampana"));
		List<Person> personList = personService.findAll();
		when(personRepository.findAll()).thenReturn(person);

	}

	@Test
	void testFindAll() {

		List<Person> personList = personService.findAll();
		assertNotNull(personList);
		assertEquals(3, personList.size());

	}

	@Test
	void testFindById() {
		Person personExisting = new Person(2, "jahnavi", "varma");
		when(personRepository.findById(2)).thenReturn(Optional.of(personExisting));

		Person person = personRepository.findById(2).get();
		assertNotNull(person);
		assertSame(person.getFirstname(), "jahnavi");
		assertEquals(person.getId(), 2);
	}

	@Test
	void testInsert() {
		Person person = new Person(4, "gopi", "jampana");
		when(personRepository.save(person)).thenReturn(person);

		assertNotNull(person);

	}

	@Test
	void testUpdate() {
	Person person = new Person(3, "pranaviii", "jampana");
	when(personRepository.save(person)).thenReturn(person);



	Person person1 = personRepository.save(person);
	assertNotNull(person1);
	assertSame(person1.getFirstname(), "pranaviii");
	//assertEquals(person1.getId(), 3);
	//fail("Not yet implemented");
	}
//	@Test
//	void testDelete() {
//		Person personExisting = new Person(2, "jahnavi", "varma");
//		when(personRepository.deleteById(2)).thenReturn(personExisting);
//		
//		Person person = personRepository.deleteById(2).get(2);
//		assertNotNull(person);
//		assertEquals(person.getId(), 2);
//
//	}
	
}