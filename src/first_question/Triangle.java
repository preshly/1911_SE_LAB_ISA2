package first_question;

public class Triangle implements Shape{
	
	private Double base;
	private Double height;
	private Double area;
	
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		this.area = (this.base * this.height)/2;
		System.out.println("Base: " +this.base + " Height: " +this.height);
		System.out.println("Area of Rectangle: " + this.area);
	}
}
