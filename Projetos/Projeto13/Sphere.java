
public class Sphere extends ThreeDimensionalShape implements IVolume {

	private int radius;  // raio da espera
	
	/**
	 * The constructor has the following parameters
	 * @param name  name of the shape
	 * @param r  sphere's radius
	 */
	public Sphere(String name, int r) {
		super(name);
		this.radius = r;
	}

	/**
	 * Calculate the volume of the sphere
	 */	
	@Override
	public double calculateVolume() {
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}

}
