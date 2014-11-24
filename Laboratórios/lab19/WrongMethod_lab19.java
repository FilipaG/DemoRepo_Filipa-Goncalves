package lab19;

import java.util.ArrayList;
import java.util.List;

public class WrongMethod_lab19 {
	
	public static void wrongMethod(){
		List<Integer> list = new ArrayList<Integer>(); // instanciação de um arrayList
		list.add(1);                                   // adiciona-se vários elementos ao arrayList
		list.add(2);
		list.add(new Integer(4));
		list.add(3);
		list.add(2);
		int sum = 0, count = 0, size = list.size();  //size = 4 (4 elementos)
		for(Integer i : list){    
		sum+= i; // somar todos os elementos da lista (1 + 2 + 4 + 3 + 2 = 12 = sum)
		++count;       // count = nº de elementos
		}
		System.out.println("Sum: " + sum);
		System.out.println("Count: " + count);
		System.out.println("Size: " + size);
		}
	
	public static void main (String[] args){
		wrongMethod();
	}
}
