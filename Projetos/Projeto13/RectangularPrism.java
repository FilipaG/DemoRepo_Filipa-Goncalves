
public class RectangularPrism extends ThreeDimensionalShape implements IVolume, IPrintableShape{

	private int width;   //largura da base
	private int height;  // altura 
	private int length;	 // comprimento da base 
	
	/**
	 * The constructor has the following parameters
	 * @param name name of the shape
	 * @param w  width of the RectangularPrism
	 * @param h  height of the RectangularPrism
	 * @param l  length of the RectangularPrism
	 */
	public RectangularPrism(String name, int w, int h, int l) {
		super(name);
		this.height = h;
		this.length = l;
		this.width = w;
	}

	/**
	 * print the volume of the RectangularPrism
	 */
	@Override
	public void printShape() {
		System.out.println("The volume of " + name + " (3D Shape) is: " + calculateVolume());	
		
	}

	/**
	 * Calculate the volume of the RectangularPrism
	 */
	@Override
	public double calculateVolume() {
		double baseArea = width * length;
		return baseArea * height;
	}

}
