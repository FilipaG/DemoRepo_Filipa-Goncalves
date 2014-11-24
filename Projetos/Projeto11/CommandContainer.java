
public class CommandContainer implements IComplexCommand, ICommand {
	private int numberCommands = 0;
	private ICommand[] commands;
	
	public CommandContainer(int numCommand) {
		commands = new ICommand[numCommand];  
		// afetação de um array com dimensão igual ao número de comandos adicionados
	}

	/**
	 * Return the command's name. 
	 */
	@Override
	public String getName() {
		return "help";
	}
	
	/**
	 * This method stores the commands that will be performed on the string inserted on the console 
	 * @param Command
	 */
	@Override
	public void addCommand(ICommand Command) 
	{
			if(numberCommands < commands.length)
			{
				commands[numberCommands]=Command;
				numberCommands++;
			}
	}

	/**
	 * Perform the operation of the chosen command, if all information inserted is valid.
	 */
	@Override
	public void execute(String[] split) {
		int count=0;
		if (split[0].equals("help"))   // impressão dos comandos disponíveis para serem executados
		{
			System.out.println(" print (message)\n "
					+ "sum (value1) (value2) \n "
					+ "minus (value1) (value2) \n "
					+ "exit");
		}
		else   // se for escrito qualquer um dos outros comandos executa-os
		{	
			for (int idx=0; idx < numberCommands; idx++){
				if (split[0].equals(commands[idx].getName())){    // se a primeira palavra inserida corresponder a algum dos comandos, executa-os
					commands[idx].execute(split);
					count++;
				}
			}
			if (count==0)   // se não escreveu um comando válido
				System.out.println("Use Help to view every command\n");
		}
	}
}
