
public interface IComplexCommand {

	/**
	 * This method stores the commands that will be performed on the string inserted on the console 
	 * @param Command
	 */
	void addCommand(ICommand printCmd);

	/**
	 * Return the command's name. 
	 */
	String getName();

	/**
	 * Perform the operation of the chosen command, if all information inserted is valid.
	 */
	void execute(String[] split);



}
