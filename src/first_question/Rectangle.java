package first_question;

public class Rectangle implements Shape{
	private Double length;
	private Double breadth;
	private Double area;
	
	public Rectangle(Double length, Double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		this.area = this.length * this.breadth;
		System.out.println("Length: " +this.length + " Breadth: " +this.breadth);
		System.out.println("Area of Rectangle: " + this.area);
	}
	
}
