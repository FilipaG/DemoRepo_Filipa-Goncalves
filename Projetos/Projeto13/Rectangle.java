
public class Rectangle extends TwoDimensionalShape implements IArea, IPrintableShape{
	
	private int width;   //largura do retângulo
	private int height;   // altura do rectângulo
	
	/**
	 * The constructor has the following parameters
	 * @param name  name of the shape
	 * @param w  width of the rectangle
	 * @param h  height of the rectangle
	 */
	public Rectangle(String name, int w, int h) {
		super(name);
		this.width = w;
		this.height = h;
	}

	/**
	 * print the area of the rectangle
	 */
	@Override
	public void printShape() {
		System.out.println("The volume of " + name + " (2D Shape) is: " + calculateArea());	
	}

	/**
	 * Calculate the area of the rectangle
	 */
	@Override
	public double calculateArea() {
		return width * height;
	}
}
