
public class TwoDimensionalShape extends GeometricShape implements IArea{

	/**
	 *  * Constructor have the following parameters
	 * @param name  (name of the shape)
	 */
		public TwoDimensionalShape(String name){
			super(name);
		}

		/**
		 * Calculate the area oh the shape
		 */
		@Override
		public double calculateArea() {
			return 0;
		}

}
