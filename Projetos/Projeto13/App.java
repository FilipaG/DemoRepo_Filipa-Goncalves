
public class App {

	public static void main (String[] args){
		
	GeometricShape square = new Square("Square", 3);
	GeometricShape cube = new RectangularPrism("Cube", 5, 5, 5);
	GeometricShape rectangularPrism = new RectangularPrism("NotACube",3,4,5);
	GeometricShape circle = new Circle("Circle", 4);
	GeometricShape cone = new Cone("Cone", 4, 6);
	GeometricShape sphere = new Sphere("Sphere", 6);
	GeometricShape triangle = new Triangle("Triangle", 3, 6);
	GeometricShape rectangle = new Rectangle("Rectangle", 4, 5);
	GeometricShapeContainer tds = new GeometricShapeContainer("Shapes", 8);
		
	tds.add(square);
	tds.add(cube);
	tds.add(rectangularPrism);
	tds.add(circle);
	tds.add(cone);
	tds.add(sphere);
	tds.add(triangle);
	tds.add(rectangle);
	
	tds.listShapes();
	System.out.println("\n");
	
	tds.list2DShapes();
	System.out.println("\n");
	
	tds.list3DShapes();
	}
}

