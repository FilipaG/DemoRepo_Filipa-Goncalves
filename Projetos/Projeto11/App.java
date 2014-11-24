

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		IComplexCommand container = new CommandContainer(5);
		
		ICommand printCmd = new PrintCmd();
		ICommand sumCmd = new SumCmd();
		ICommand minusCmd = new MinusCmd();
		ICommand exitCmd = new ExitCmd();
		
		container.addCommand(printCmd);
		container.addCommand(sumCmd);
		container.addCommand(minusCmd);
		container.addCommand(exitCmd);
		
		System.out.println("Use '" + container.getName() + "' to view every command\n");  
		//nome do container: Help
		
		String cmd;
		
		while(true){
			
			cmd = scanner.nextLine();   //inserção da linha de instruções
			
			System.out.println();
			
			container.execute(cmd.split(" "));   //executa a linha de instrução fazendo um split sobre a mesma
			
			System.out.println();
		}
	}
}
