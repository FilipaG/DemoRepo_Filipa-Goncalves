package formjava.session9;


public class Point {

	private double x;    // campo da instância da classe Point
	private double y;
	
	static int numPoint = 0;   // contar número de pontos
	
	                          //static - método da classe
	public Point(double x, double y) {    //construtor
		this.x = x;
		this.y = y;
		Point.numPoint++;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	Point add (Point p2)
	{
		/*		
		double newX = this.x + p2.x;
		double newY = this.y + p2.y;
		return new Point (newX, newY);
		*/
		return new Point(this.x + p2.x,this.y + p2.y );
	}
	
	Point sub(Point p2)
	{
		this.x-=p2.x;    //ou this.x+=p2.getX();
		this.y -= p2.y;
		return this;    // em vez de gerar um novo ponto, a soma de dois pontos val alterar o valor do primeiro
	}
	public static void main (String[] args)
	{
		int a = 3;
		int b = 4;
		
		Point p1=new Point (2,3);
		Point p2=new Point (3,4);
		//p1 + p2
		
		p1.add(p2).add(p1).sub(p2);
		double d = p1.x;   //apesar de privado, consigo aceder porque está na mesma classe
	}
}
