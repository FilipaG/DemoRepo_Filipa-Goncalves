/**
 * Performs the operation value1 + value2 and displays the result on the console .
 * @author FilipaG
 *
 */
public class SumCmd implements ICommand{

/**
 * Return the command's name. 
 */
	@Override
	public String getName() {
		return "sum";
	}

	/**
	 * If value1 and value2 are numbers, perform the operation, perform the operation value1+value2 and display the result 
	 * on the console
	 */
	@Override
	public void execute(String[] split) {
		if ((split.length==3)&&(isNumeric(split[1])&&isNumeric(split[2]))){   // só é feito se os valores inseridos forem numéricos	
			double result = (Double.parseDouble(split[1]) + Double.parseDouble(split[2])); 
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
	private static boolean isNumeric(String str)    // para testar se os valores são numéricos
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
