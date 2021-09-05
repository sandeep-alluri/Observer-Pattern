

public class Subscriber1 implements Observer{

	@Override
	public void update(Message message) {
		System.out.println("Subscriber1 :: " + message.getMessageContent());
		
	} 
	
}
