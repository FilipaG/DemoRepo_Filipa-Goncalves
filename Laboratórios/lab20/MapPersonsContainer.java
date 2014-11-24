package lab20;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class that implements the interface {@link PersonsContainer} for keep in the memory 
 * * {@link Person} objects using one {@link Map}.
 */

public class MapPersonsContainer implements PersonsContainer {

	public Map<String, Person> personContainerMap= new TreeMap<>();
	
		
	@Override
	public boolean add(Person person) { // como não permite chaves duplicadas
		if (personContainerMap.containsKey(person.getNif()))  // as chaves são os nif
			return false;     //não foi adicionado
		else{
			personContainerMap.put(person.getNif(), person); 
		// adiciona-se ao contentor o novo objecto com a sua chave
			return true;   // foi adicionado
		}
	}

	@Override
	public Collection<Person> getAll() {   //obter todos os elementos
		return personContainerMap.values();
	}

	@Override
	public Person getByNif(String nif) {   //obter a partir da chave
		return personContainerMap.get(nif); 
		// Retorna o valor (objecto Person) da chave que está a ser verificada, ou null caso 
		// não contenha esta chave.		
	}
}
