package sessão07_10;

public class Lab05p1 {
     public static void main(String[] args) 
     {
    	 int[] numbers = {1,3,5,7,9};   //Declaração, Instanciação e Afectação de valores
    	 int count = 0;  
    	 for (int idx = 0; idx < numbers.length; idx ++)
    	 {
    	    System.out.print((count == 0)?(numbers[idx]):("." + numbers[idx])); // não coloca "." antes do primeiro elemento do array 
    		count ++;
    	 } 
     }
}