


public class Users implements Sender, Receiver{
	private Users[] followers;//Constructor with initial capacity
	final String username;
	private Message lastMessage;
	private int numberFollowers= 0;      //nº inicial de users registados
	
	
	/**
	 * The constructor has the following parameter
	 * @param name user's name
	 * @param numFollowers
	 */
	public Users(String name, int maxFollowers) {
		username = name;
		followers = new Users[maxFollowers];  // lista dos seguidores de determinado user
	}

	/**
	 * Return the user's name. 
	 */
	public String getName() {
		return username;
	}

	
	/**
	 * This method stores the users as followers of a specific user
	 * Adds an user/receiver to the set of receiver for this user's messages, provided that it is not
	 * the same as some observer already in the set. 
	 * @param User
	 */
	public boolean userRegister(Users user) 
	{
		if (isRegister(user)){  // se o utilizador já está registado avisa na consola
			System.out.println("User already registered");
			return false;
		}
		
		if(numberFollowers < followers.length)   
	// registar o user, mas apenas se o nº de users for inferior à dimensão do contentor sender
		{
			followers[numberFollowers]= user;
			numberFollowers++;
			return true;   // só retorna true caso tenha sido corretamente adicionado ao contentor sender
		}
		else
			System.out.println("This sender is full.");
		return false;
	}
	
	/**
	 * Verify if the user is already registered
	 * @param user user's name
	 * @return true if the user is already registered, false otherwise
	 */
	public boolean isRegister(Users user){
		for(int idx = 0; idx<numberFollowers; idx++)  // verificar se o utilizador já está registado
			if (followers[idx].username.equals(user.username))
				return true;
		return false;
	}
	

	/**
	 * The sender send the message to the receivers 
	 * @param receiver
	 * @param msg
	 * @return 
	 * @return
	 */
	@Override
	public void sendMessage(Message msg) {    // envia a mesma mensagem para todos os user registados no array
		for(int idx = 0; idx<numberFollowers; idx++)
			this.followers[idx].receiveMessage(msg); 
		//O envio da mensagem pressupõe a rececão da mesma pelos followers user
	}
		
	/**
	 * Allow the User to receive a message.
	 */
	@Override
	public void receiveMessage(Message msg){
		lastMessage =  msg;	   // Guarda a mensagem recebida como LastMessage
	// não a guardei num array porque no enunciado refere que o utilizador apenas guarda 1 (a última)
	}
	
	/**
	 * Allow the user to get the last message
	 * @return
	 */
	public Message getLastMessage(){
		
		return lastMessage;	//Permite que o utilizador veja a última mensagem
	}
	
	/**
	 * Print the last Message received with the sender and receiver information (username) and the text message
	 * @return
	 */
	//Alterei ligeiramente o print da mensagem para que se percebesse quem recebeu a mensagem (testes e aplicação)
	public String printMessage (){
		String viewMessage = "To " + this.username + " From: "+ lastMessage.getSender().username + " " + lastMessage.getMessage();
		System.out.println(viewMessage);
		return viewMessage;
	}

	/**
	 * This Method allows the user to create a message.
	 * @return writemsg
	 */
	 //transforma a String mensagem inserida pelo utilizador na writemsg do Tipo Message, que 
	 //além do texto da mensagem, tem também a informação sobre o user que a enviou.
	public Message writeMessage(String msg) {
		Message writemsg = new Message(this, msg);
		return writemsg;
	}
}
