
public class Circle implements Shape{
private float raduis;

	public Circle() {
	super();
	System.out.println("Changes r made");
	raduis=3.4f;
}

	public Circle(float raduis) {
	super();
	this.raduis = raduis;
}

	@Override
	public void draw() {
		System.out.println("Circle is drawn with radius"+PI);	
		
	}

	@Override
	public void move() {
		System.out.println("Circle is moved");	
		
	}

}
