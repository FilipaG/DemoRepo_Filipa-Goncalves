/**
 * Perform the operation value1-value2 and display the result on the console.
 * @author FilipaG
 */
public class MinusCmd implements ICommand{
//minus (value1) (value2): Realiza a opera��o value1-value2 e mostra o resultado na consola.

	/**
	 * Return the command's name. 
	 */
	@Override
	public String getName() {
		return "minus";
	}
	
	/**
	 * If value1 and value2 are numbers, perform the operation, perform the operation value1-value2 and display the result 
	 * on the console
	 */
	public void execute(String[] split) {
		if ((split.length==3)&&(isNumeric(split[1])&&isNumeric(split[2]))){   // s� � feito se os valores inseridos forem num�ricos	
			double result = (Double.parseDouble(split[1]) - Double.parseDouble(split[2])); 
			System.out.println("Result: " + result);   
				// porque os valores inseridos podem ser double
		}
		else
			System.out.println("Use 'help' to view every command");
	}
		
	/**
	 * Verify if the string is a number.
	 * @param str
	 * @return true if the string is a number; false otherwise;
	 */
	private static boolean isNumeric(String str)    // para testar se os valores s�o num�ricos
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }                                             
	  catch(NumberFormatException nfe)  
	  {  
		  System.out.println("NumberFormatException");
		  return false;  
	  }  
	  return true;  
	}
}
