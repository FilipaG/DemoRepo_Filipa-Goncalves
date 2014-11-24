
public class Circle extends TwoDimensionalShape implements IArea, IPrintableShape{
	private int radius;   //raio do círculo
	
	/**
	 * The constructor has the following parameters
	 * @param name name of the shape
	 * @param rad  radius of the circle
	 */
	public Circle(String name, int rad) {
		super(name);
		this.radius = rad;
	}

	/**
	 * print the area of the circle
	 */
	@Override
	public void printShape() {
		System.out.println("The area of " + name + " (2D Shape) is: " + decimal.format(calculateArea()));	
	}

	/**
	 * Calculate the area of the circle
	 */
	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	
	
}
