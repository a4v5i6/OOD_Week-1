package observer;

public class GraphObserver implements Observer {
	
	private WindowManager windowManager;
	private String content;
	
	public GraphObserver(WindowManager windowManager) {
		this.windowManager = windowManager;
		this.windowManager.register(this);
	}

	
	public void update(String content) {
		this.content = content;
		display();

	}
	public void display() {
		System.out.println("Graph Observer content updated " + windowManager.getContent());
	}

}
