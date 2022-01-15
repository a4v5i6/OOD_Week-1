package observer;

public class MapObserver implements Observer {

	private WindowManager windowManager;
	private String content;
	
	public MapObserver(WindowManager windowManager) {
		this.windowManager = windowManager;
		this.windowManager.register(this);
	}

	
	public void update(String content) {
		this.content = content;
		display();

	}
	public void display() {
		System.out.println("Maps Observer content updated " + windowManager.getContent());
	}

}
