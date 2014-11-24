/**
 * Receiver - any user that wishes to be notified when the state of another user changes, 
 * in this case, want to be notified when the other user sends messages
 * @author Filipa
 */
public interface Receiver {
	/**
	 * Allows the receiver to receive the message
	 * @param msg
	 */
	void receiveMessage(Message msg);

}
