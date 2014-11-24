package lab19;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class insertElementLinkedList {
/**
 * Adds the numbers obtained through the console to the LinkedList until the input number are 0.
 * @return numbers - the linkedList with all numbers
 */
	public static LinkedList<Integer> addToLinkedList() {
		Scanner kbd = new Scanner(System.in);
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		int number = kbd.nextInt();    //variável afetada ao valor inserido na consola
		
		while (number != 0) {        // enquanto o número for diferente de 0 adiciona-o à LinkedList
			numbers.add(number);
			number = kbd.nextInt();
		}
		kbd.close();
		return numbers;
	}
	
	/**
	 * Print all the elements in the list
	 * @param numbers
	 */
	public static void printList(List<Integer> numbers) {
		for (Integer integer : numbers) {
		System.out.print(integer + " ");
		}
	}
	
	public static void usingListMethods() {
		LinkedList<Integer> numbers = addToLinkedList();        	//    Output Esperado
		printList(numbers);											//	1 2 3 4 5 6 7 8 9
		System.out.println("\nFIRST ELEMENT: " + numbers.getFirst()); //	FIRST ELEMENT: 1
		System.out.println("LAST ELEMENT: " + numbers.getLast()); 	//	LAST ELEMENT: 9
		System.out.println("CONTAINS 6: " + numbers.contains(6));	//	CONTAINS 6: true
		System.out.println("REMOVE 4: " + numbers.remove(4));       //	REMOVE 4: 5          remover o 4ºelemento da Lista
		numbers.addFirst(234);
		printList(numbers);											//	234 1 2 3 4 6 7 8 9
	}
	
	
	public static void main (String[] args){
		usingListMethods();
	}
}
