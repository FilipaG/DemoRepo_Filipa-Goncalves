
/**
 * Defines the class Message whose objects represent text messages send between users and the user writer.
 * @author FilipaG
 *
 */
public class Message {
	private Users sender;
	private String message;
	
	public Message (Users sender, String msg){
		this.sender = sender;
		message = msg;
		
	}
	
	/**
	 * Returns the name of the user who sends the message
	 * @return  sender
	 */
	public Users getSender() {     // obtém o emissor da mensagem
		return sender;
	}

	/**
	 * Returns the text of the message
	 * @return message 
	 */
	public String getMessage(){   // Obtem a o texto da Mensagem
		return message;
	}

}
