package window;
import decorator.*;
import observer.*;
//import observer.*;
public class WindowTest {

	public static void main(String[] args) {
		
		Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
		
		System.out.println(decoratedWindow.getDescription());
		
		
		WindowManager windowManager = new WindowManager();
		
		GraphObserver graphObserver = new GraphObserver(windowManager);
		MapObserver mapObserver = new MapObserver(windowManager);
		
		System.out.println("\nMap Content detected");
		windowManager.setContent("Map Content");
		
		windowManager.unregister(mapObserver);
		
		System.out.println("\nGraph Content detected");
		
		Window decoratedHorizontalWindow = new VerticalScrollBarDecorator(new HorizontalScrollBarDecorator(new SimpleWindow()));
		
		System.out.println(decoratedHorizontalWindow.getDescription());
		
		windowManager.setContent("Graph Content");
		
	}

}
