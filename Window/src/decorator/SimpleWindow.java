package decorator;

public class SimpleWindow implements Window {



	@Override
	public void draw() {
		System.out.println("Drawing Simple window");

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A simple window" ;
	}

}
