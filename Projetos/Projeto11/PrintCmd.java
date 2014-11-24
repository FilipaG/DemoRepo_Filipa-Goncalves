
/**
 * Displays the console message passed as parameter on the console .
 * @author FilipaG
 */
public class PrintCmd implements ICommand{

	/**
	 * Return the command's name. 
	 */
	@Override
	public String getName() {
		return "print";
	}

	@Override
	public void execute(String[] split) 
	{
		System.out.print("Print ");
		for (int idx = 1; idx < split.length; idx++)
			System.out.print(split[idx] + ((idx==split.length-1) ? "\n" : " "));
		
	}
}
