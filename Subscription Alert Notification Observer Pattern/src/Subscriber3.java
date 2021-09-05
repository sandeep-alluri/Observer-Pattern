
public class Subscriber3 implements Observer{

	@Override
	public void update(Message message) {
		System.out.println("Subscriber3  :: " + message.getMessageContent());
		
	} 
}
