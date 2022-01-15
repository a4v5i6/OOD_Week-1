package decorator;

public abstract class WindowDecorator implements Window{
	
	private final Window decoratedWindow;
	
	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
	public void draw() {
		decoratedWindow.draw();
	}
	public String getDescription() {
		return decoratedWindow.getDescription();
	}

}
