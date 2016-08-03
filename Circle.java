package session6.assignment3;

public class Circle implements Shape {
	
	double radius = 5;
	
	public void draw() {
		System.out.println("Circle drawn");
	} 
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		System.out.println("Area of the circle with radius "+c.radius+"cm ="+c.getArea());
		

	}

}
