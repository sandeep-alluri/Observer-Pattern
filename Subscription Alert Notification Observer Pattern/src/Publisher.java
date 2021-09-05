import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{
	
	private List<Observer> observers = new ArrayList<>();

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(Message m) {
		for(Observer o: observers) {
            o.update(m);
        }
		
	} 
	
}
