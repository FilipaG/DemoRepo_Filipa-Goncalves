/**
 * Sender -- any user whose state may be of interest, and in whom another user may register an 
 * interest
 * @author Filipa
 *
 */
public interface Sender {
	
	/**
	 * This method stores the users 
	 * @param User
	 */
	public boolean userRegister(Users user) ;
		
	/**
	 * Verify if the user is already registered
	 * @param user user's name
	 * @return true if the user is already registered, false otherwise
	 */
	public boolean isRegister(Users user);
	
	/**
	 * The sender send the message to the receivers 
	 * @param msg
	 * @return
	 */
	public void sendMessage(Message msg);
}

