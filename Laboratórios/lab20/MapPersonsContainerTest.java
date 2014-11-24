package lab20;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MapPersonsContainerTest {

	private MapPersonsContainer _container;
	
	@Before
	public void beforeTests()
	{
		_container = new MapPersonsContainer();
	}
	
	@Test
	public void shouldAddOnePersonToContainer()
	{
		// Arrange
		Person p1 = new Person("654321", "Filipa Gonçalves", 31);
		// Act
		// Assert
		Assert.assertTrue(_container.add(p1));
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
		Person p3 = new Person("123456", "Filipa Gonçalves", 31);
		
		// Act
		_container.add(p1);
		_container.add(p2);

		Collection<Person> persons =  _container.getAll();

		// Assert
		Assert.assertFalse(_container.add(p3));
		Assert.assertNotNull(persons);			// verifica que a lista não está vazia
		Assert.assertEquals(2, persons.size());   // verifica tamanho da lista
		
		Assert.assertTrue(persons.contains(p1));
		Assert.assertTrue(persons.contains(p2));
	}
}
