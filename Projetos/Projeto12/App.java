

// Para enviar as mensagens � necess�rio em primeiro lugar definir um emissor.
// Um emissor pode registar v�rios utilizadores, at� um m�ximo estabelecido previamente.	
	import java.util.Scanner;

	public class App {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			// afeta��o das vari�veis a objectos do tipo Users
			Users user1 = new Users("user1", 10);   
			Users user2 = new Users("user2", 10);
			Users user3 = new Users("user3", 10);
			Users user4 = new Users("user4", 10);
			Users user5 = new Users("user5", 10);
			
			// Registo de users
			user1.userRegister(user1);
			user1.userRegister(user2);
			user1.userRegister(user3);
			user2.userRegister(user1);
			user2.userRegister(user2);
			user2.userRegister(user3);
			
			System.out.println("Message: ");         //escrita da mensagem
			String msg = scanner.nextLine();         //inser��o da linha de instru��es
			
			// cria��o de uma mensagem com a informa��o da mensagem inserida
			Message writemsg = new Message(user1, msg);   
			user1.sendMessage(writemsg);
			user3.getLastMessage();
			user3.printMessage();
			user2.getLastMessage();	
			user2.printMessage();
			user1.getLastMessage();
			user1.printMessage();
			
			System.out.println("Message: ");
			String msg2 = scanner.nextLine();   //inser��o da linha de instru��es
			Message writemsg2 = user2.writeMessage(msg2);
			user2.sendMessage(writemsg2);  // cria��o de uma mensagem com a informa��o da mensagem inserida
			user3.getLastMessage();
			user3.printMessage();
			user2.getLastMessage();	
			user2.printMessage();
			user1.getLastMessage();
			user1.printMessage();
			
			scanner.close();
		}
	
	
}
