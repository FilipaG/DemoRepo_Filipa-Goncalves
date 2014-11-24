package lab20;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import lab20.Person;
import lab20.PersonsContainer;

/**
 * Test cases for {@link ListPersonsContainer} class.
 * 
 * @author Challenge.IT
 *
 * Copyright (c) 2014, Challenge.IT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is distributed in the hope that it will be useful for learning purposes, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 * */
public class ListPersonsContainerTest 
{
	private PersonsContainer _container;
			
	@Before
	public void beforeTests()
	{
		_container = new ListPersonsContainer();
	}
	
	@Test
	public void shouldAddOnePersonToContainer()
	{
		// Arrange
		
		// Act
		
		// Assert
		Assert.assertTrue(_container.add(new Person("123456", "Ricardo Sousa", 25)));
	}
	
	@Test
	public void shouldGetOnePersonByNifFromTheContainer()
	{
		// Arrange
		Person p1 = new Person("123456", "Ricardo Sousa", 25);
		
		// Act
		_container.add(p1);
		Person person = _container.getByNif(p1.getNif());
		
		// Assert
		Assert.assertNotNull(person);
		Assert.assertEquals(p1.getNif(), person.getNif());
		Assert.assertEquals(p1.getName(), person.getName());
		Assert.assertEquals(p1.getAge(), person.getAge());
	}
	
	@Test
	public void shouldGetAllPersonsFromTheContainer()
	{
		// Arrange
		Person p1 = new Person("123456", "Ricardo Sousa", 25);
		Person p2 = new Person("1234", "Diogo Matos", 25);
		
		// Act
		_container.add(p1);
		_container.add(p2);

		List<Person> persons = (List<Person>) _container.getAll();

		// Assert
		Assert.assertNotNull(persons);			// verifica que a lista não está vazia
		Assert.assertEquals(2, persons.size());   // verifica tamanho da lista
		
		Assert.assertEquals(p1.getNif(), persons.get(0).getNif());
		Assert.assertEquals(p1.getName(), persons.get(0).getName());
		Assert.assertEquals(p1.getAge(), persons.get(0).getAge());

		Assert.assertEquals(p2.getNif(), persons.get(1).getNif());
		Assert.assertEquals(p2.getName(), persons.get(1).getName());
		Assert.assertEquals(p2.getAge(), persons.get(1).getAge());
	}
}
