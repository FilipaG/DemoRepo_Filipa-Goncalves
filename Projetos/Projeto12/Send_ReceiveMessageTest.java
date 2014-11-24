import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * User:
 * - is identity by is name.
 * - it can receive an send messages.
 * - only saves the last message.
 * 
 * Message:
 * - its identity by the user writer and its message.
 */
public class Send_ReceiveMessageTest
{
	private Users user1;
	private Users user2;
	private Users user3;
	private Users user4;
	private String message;
	private Message writeMessage; 
	
	@Before
	public void test()
	{
		//Arrange
		user1 = new Users("user1",5);
		user2 = new Users("user2", 5);
		user3 = new Users("user3", 5);
		user4 = new Users("user4", 5);
		
		user1.userRegister(user1); 
		user1.userRegister(user2);
		user1.userRegister(user3);
		user1.userRegister(user4);

		message = "olá a todos!";
		writeMessage = user1.writeMessage(message);
	}
	
	/**
	 * This test verify if the received message and the send message are equal.
	 */
	//verifica se a mensagem enviada é igual à mensagem recebida
	@Test
	public void sendMessage_equalsTo_receivedMessageTest()
	{
		//Act
		user1.sendMessage(writeMessage);
		//Assert
		Assert.assertTrue( user2.getLastMessage().equals(writeMessage) );	
	}
	
	/**
	 * This test verify that is not possible register multiples users with the same name
	 */
	@Test
	public void doNotAllowTwoUserWithSameNameTest()
	{
		//Arrange
		Users uNew1 = new Users("user1", 5);
		//Assert
		Assert.assertFalse( user1.userRegister(uNew1) );  // porque é um objeto já registado
	}
	
	/**
	 * This test verify that is not possible to register more user than the arrays capacity
	 */
	@Test
	public void DoNotAllowRegisterMoreUsersThanArrayCapacityTest()
	{
		//Arrange
		Users user5 = new Users("user5",5);
		Users user6 = new Users("user6", 5);
		
		//Act
		user1.userRegister(user5); 
		user1.userRegister(user6);
		
		//Assert
		Assert.assertFalse( user1.userRegister(user6) );  // porque é o contentor de followers já está cheio
	}
	
	/**
	 * This test verify that the printed message have the information expected.
	 */
	@Test
	public void AllInformationInPrintMessage_Test()
	{
		//Arrange
			String msg = "To user2 From: " + writeMessage.getSender().username + " " + writeMessage.getMessage();
			
		//Act
			user1.sendMessage(writeMessage);  // criação de uma mensagem com a informação da mensagem inserida
			user2.getLastMessage();
			String msgActual = user2.printMessage();
			
			Assert.assertEquals(msg,msgActual);
				
		
		
	}
}






