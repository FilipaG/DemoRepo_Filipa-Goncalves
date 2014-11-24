import java.text.DecimalFormat;


public abstract class GeometricShape {

	protected String name;    
	DecimalFormat decimal = new DecimalFormat("#.00");  // para que os resultados apareçam com duas casas decimais
	
	/**
	 *  * Constructor have the following parameters
	 * @param name  (name of the shape)
	 */
	public GeometricShape(String name) {
		this.name = name;
	}

	/**
	 * List all the printable Shapes on the console
	 */
	public void listShapes() {	//lista todas as formas geométricas
	}

	public void printShape() {   // imprime a informação da forma geométrica
	}

}
