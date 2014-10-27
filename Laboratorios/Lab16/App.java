package lab16;

public class App {

	public static void main(String[] args) {
		int []a = {1,5,6,7,6,8,4,1,5};
		SerieTransform u1 = new SerieTransform("My Transformation", 1);
		u1.addTransformation(new Unique());    
		u1.executePrint(a);
		SerieTransform u2 = new SerieTransform("My Transformation", 1);
		u2.addTransformation(new AscendingSort());    
		u2.executePrint(a);
		SerieTransform u3 = new SerieTransform("My Transformation", 1);
		u3.addTransformation(new Inverse());    
		u3.executePrint(a);

	}

}
