
public class Subscriber2 implements Observer{

	@Override
	public void update(Message message) {
		System.out.println("Subscriber2   :: " + message.getMessageContent());
		
	} 
}
