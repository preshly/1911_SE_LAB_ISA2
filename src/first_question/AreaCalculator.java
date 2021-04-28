package first_question;

public class AreaCalculator {
	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	public AreaCalculator() {
		this.circle = new Circle(2.0);
		this.rectangle = new Rectangle(2.0, 3.0);
		this.triangle = new Triangle(2.0, 5.0);
	}
	
	public void circleArea() {
		this.circle.calculateArea();
	}
	
	public void rectangleArea() {
		this.rectangle.calculateArea();
	}
	
	public void triangleArea() {
		this.triangle.calculateArea();
	}

}
