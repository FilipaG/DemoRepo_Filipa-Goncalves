/**
 * Terminates the application. 
 * Note: System.exit(0) (Forces  the application's finish.)
 * @author FilipaG
 */
public class ExitCmd implements ICommand{

	/**
	 * Return the command's name. 
	 */
	@Override
	public String getName() {
		return "exit";
	}
	
	/**
	 * Terminates the application. 
	 */
	@Override
	public void execute(String[] split) {
		System.exit(1);	
	}
}
