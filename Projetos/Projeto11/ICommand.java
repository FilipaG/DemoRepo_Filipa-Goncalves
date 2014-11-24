


public interface ICommand {

	/**
	 * Return the command's name. 
	 */
	public String getName();

	/**
	 * Perform the operation of the chosen command, if all information inserted is valid.
	 */
	public void execute(String[] split);

}
