

public class TestObserver { 
	
	public static void main(String[] args) 
    {
		
		Subscriber1 s1 = new Subscriber1();
		Subscriber2 s2 = new Subscriber2();
	    Subscriber3 s3 = new Subscriber3();
	     
	    Publisher p = new Publisher();
	    
	    p.attach(s1);
	    p.attach(s2);
        
        p.notifyUpdate(new Message(" This is my First Message -: Subscriber1 and Subscriber2 will receive the update"));   
         
        p.detach(s1);
        p.attach(s3);
        
        System.out.println("\n*****************************************************\n");
         
        p.notifyUpdate(new Message("This is my Second Message -: Subscriber2 and Subscriber3 will receive the update"));  
	    
		
    }
	
    
}
	
 
