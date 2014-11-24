
public class ThreeDimensionalShape extends GeometricShape implements IVolume{
	
	/**
	 *  * Constructor have the following parameters
	 * @param name  (name of the shape)
	 */
	public ThreeDimensionalShape(String name){
		super (name);
	}

	/**
	 * Calculate the area oh the shape
	 */
	@Override
	public double calculateVolume() {
		return 0;
	}
}
