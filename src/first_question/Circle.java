package first_question;

public class Circle implements Shape{
	
	private Double radius;
	private Double area;
	
	public Circle(Double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		this.area = Math.PI * this.radius * this.radius;
		System.out.println("Radius: " + this.radius);
		System.out.println("Area of circle is: " +  this.area);
	}
	
}
