
public class Square extends TwoDimensionalShape implements IArea, IPrintableShape{

	private int side;   // lado do quadrado
	
	/**
	 * The constructor has the following parameters
	 * @param name  name of the shape
	 * @param side
	 */
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	/**
	 * print the area of the square
	 */
	@Override
	public void printShape() {
		System.out.println("The volume of " + name + " (2D Shape) is: " + calculateArea());
		
	}

	/**
	 * Calculate the area of the square
	 */
	@Override
	public double calculateArea() {
		return Math.pow(side, 2); 
	}
}
