
public class Triangle extends TwoDimensionalShape implements IArea {
	private int base;   // base do triângulo
	private int height;   // altura do triângulo
	
	
	/**
	 * The constructor has the following parameters
	 * @param name  name of the shape
	 * @param b base of the triangle
	 * @param h height of the triangle
	 */
	public Triangle(String name, int b, int h) {
		super(name);
		this.base = b;
		this.height = h;
	}

	/**
	 * Calculate the area of the triangle
	 */
	@Override
	public double calculateArea() {
		return (height * base)/2;
	}

	
}
