package lab20;
	/**
	 * Class that defines the Person object.
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
	public class Person
	{
		private final String _nif;          // nºcontribuinte
		private String _name;				// nome
		private int _age;					// idade
		
		/**
		 * Creates an instance of {@link Person}.
		 * @param nif The person's nif number.
		 * @param name The person's name.
		 * @param age The person's age.
		 */
		public Person(String nif, String name, int age)   // construtor
		{
			_nif = nif;
			_name = name;
			_age = age;
		}
		
		/**
		 * @return The person's nif number.
		 */
		public String getNif() { return _nif; }
		
		/**
		 * @return The person's name.
		 */
		public String getName() { return _name; }
		
		/**
		 * Set the person's name.
		 * @param name The new name.
		 */
		public void setName(String name) { _name = name; }  //Alterar o nome
		
		/**
		 * @return The person's age.
		 */
		public int getAge() { return _age; }
		
		/**
		 * Increments the person's age.
		 */
		public void incrementAge() { _age++; }     // aumenta a idade ao longo dos anos
	}

