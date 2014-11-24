
public class Cone extends ThreeDimensionalShape implements IVolume, IPrintableShape{

	private int radius;   //raio da base
	private int height;   //altura do cone
	
	/**
	 * The constructor has the following parameters
	 * @param name  name of the 3D shape
	 * @param r  radius of the base
	 * @param h  height oh the cone
	 */
	public Cone(String name, int r, int h) {
		super(name);
		this.radius = r;
		this.height = h;
	}

	/**
	 * print the volume of the cone
	 */
	@Override
	public void printShape() {
		System.out.println("The Volume of " + name + " (3D Shape) is: " + decimal.format(calculateVolume()));		
	}

	/**
	 * Calculate the volume of the cone
	 */

	@Override
	public double calculateVolume() {
		double baseArea = Math.PI*Math.pow(radius, 2);
		return (height * baseArea)/3;
	}
}
