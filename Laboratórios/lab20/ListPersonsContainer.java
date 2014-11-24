package lab20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;

import lab20.Person;
import lab20.PersonsContainer;

/**
 * Class that implements the interface {@link PersonsContainer} for keep in the memory 
 * {@link Person} objects using one {@link List}.
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
public class ListPersonsContainer implements PersonsContainer
{
	private List<Person> _persons = new ArrayList<>();
	

	public ListPersonsContainer(){
		super();
	}


	@Override
	public boolean add(Person person) {
		if (_persons.contains(person))  // a forma mais fácil de encontar uma Person numa base de dados 
			return false;			  //é pelos seus números de identificação, uma vez que são únicos
		else{ 
			_persons.add(person);
			return true;
		}
	}

	@Override
	public Collection<Person> getAll() {
		return _persons;
	}

	@Override
	public Person getByNif(String nif) {
		for (int idx=0;idx<_persons.size(); idx++){
			if(_persons.get(idx).getNif()== nif)  //Se já existe um objecto com este nif, apresenta os dados da Person
				//System.out.println(_persons.get(idx).getName());   //só para testar a impressão
				return _persons.get(idx);
		}	         
		return null;  // caso não exista, retorna null
	}
	
	public static void main (String[] args){
		ListPersonsContainer _container = new ListPersonsContainer();
		Person p1 = new Person("123456", "Ricardo Sousa", 25);
		
		_container.add(p1);
		Person person = _container.getByNif(p1.getNif());

		System.out.println(p1.getNif());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
