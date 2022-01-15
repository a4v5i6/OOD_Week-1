package decorator;

public class VerticalScrollBarDecorator extends WindowDecorator{

	public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}
	public void draw() {
		super.draw();
		drawVerticalBar();
	}
	private void drawVerticalBar() {
		System.out.println("Vertical bar drawn");
	}
	public String getDescription() {
		return super.getDescription() + ", Vertical scroll bars included";
	}

}
