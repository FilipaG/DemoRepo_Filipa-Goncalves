package sess�o07_10;

public class Lab05p1 {
     public static void main(String[] args) 
     {
    	 int[] numbers = {1,3,5,7,9};   //Declara��o, Instancia��o e Afecta��o de valores
    	 int count = 0;  
    	 for (int idx = 0; idx < numbers.length; idx ++)
    	 {
    	    System.out.print((count == 0)?(numbers[idx]):("." + numbers[idx])); // n�o coloca "." antes do primeiro elemento do array 
    		count ++;
    	 } 
     }
}