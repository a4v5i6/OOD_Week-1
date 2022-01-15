package observer;
import java.util.ArrayList;
import java.util.List;
public class WindowManager implements Subject {
	private List<Observer> observers;
	private String content;
	
	public WindowManager() {
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer observer) {
        if(observer == null ) 
        	throw new NullPointerException("Null Observer");
        
        if(!observers.contains(observer)) 
            observers.add(observer);	
	}
	public void unregister(Observer observer) {
    	if(observers.contains(observer)) 
            observers.remove(observer);
	}
	public void notifyAllObservers() {
		for ( Observer observer : observers) {
			observer.update(content);
		}
	}
	public void contentChanged() {
		notifyAllObservers();
	}
	public String getContent() {
		return content;
	}
	public void setContent(String message) {
		this.content = message;
		contentChanged();
	}
}
