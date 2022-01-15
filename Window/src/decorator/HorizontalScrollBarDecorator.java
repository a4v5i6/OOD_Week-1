package decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator{

	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}
	public void draw() {
		super.draw();
		drawHorizontalBar();
	}
	private void drawHorizontalBar() {
		System.out.println("Drawn Horizontal Scroll bar");
	}
	public String getDescription() {
		return super.getDescription() + ", horizontal scrollbars included";
	}

}
