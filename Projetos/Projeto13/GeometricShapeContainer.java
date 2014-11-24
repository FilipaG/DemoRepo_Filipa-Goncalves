/**
 * Implements a container of shapes (2D and 3D Shape).
 * @author FilipaG
 *
 */
public class GeometricShapeContainer extends GeometricShape{
	private GeometricShape[] shapes;
	private int numShapes;
	
	/**
	 * Constructor have the following parameters
	 * @param name  (name of the shape)
	 * @param maxShape  (maximum number of shapes that can be insert in the container)
	 */
	public GeometricShapeContainer(String name, int maxShape) {
		super(name);
		if (maxShape>0)     // a dimensão do contentor tem de ser positiva
			shapes = new GeometricShape[maxShape];
	}

	/**
	 * Adds a geometric shape to the container, until is full.
	 * @param shape
	 */
	public void add(GeometricShape shape){
		if(numShapes < shapes.length) {    //só adiciona as formas geométricas caso o contentor ainda não estiver cheio
			shapes[numShapes] = shape;
			numShapes++;
		}
		else
			System.out.println("This container is full.");
	}
	
	/**
	 * List all the printable Shapes on the console
	 */
	public void listShapes(){
		System.out.println("Shapes");
		for(int idx = 0; idx < numShapes; idx++)
			shapes[idx].printShape();    // imprime todas as formas geométricas armazenadas em Shape
	}
	
	/**
	 * List only the 2D Shapes on the console
	 */
	public void list2DShapes(){
		System.out.println("2D Shapes");
		for(int i = 0; i < numShapes; i++)
			if(shapes[i] instanceof TwoDimensionalShape)
				shapes[i].printShape();  // imprime as formas geométricas 2D armazenadas em Shape
		
	}
	
	/**
	 * List only the 3D Shapes on the console
	 */
	public void list3DShapes(){
		System.out.println("3D Shapes");
		for(int i = 0; i < numShapes; i++)
			if(shapes[i] instanceof ThreeDimensionalShape)
				shapes[i].printShape();   // imprime as formas geométricas 3D armazenadas em Shape
	}
}
