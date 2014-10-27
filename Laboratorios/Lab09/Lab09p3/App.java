package Lab09p3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira as coordenadas dos pontos p1 e p2:");
		System.out.print("x1=");
		int x1 = input.nextInt();
		System.out.print("y1=");
		int y1 = input.nextInt();
		Point p1 = new Point(x1, y1);  //criação do objecto p1 do tipo Point
		System.out.print("x2=");
		int x2 = input.nextInt();
		System.out.print("y2=");
		int y2 = input.nextInt();
		Point p2 = new Point(x2, y2);    //criação do objecto p2 do tipo Point
		System.out.println("p1 = (" + p1.abcissa + " , " + p1.ordenada + " ) e p2 = ("+ p2.abcissa + " , " + p2.ordenada + " )");
		
		Point p3 = p1.addAPointToThePoint(p2);
		System.out.println("p1 + p2 = (" + p3.abcissa + " , " + p3.ordenada +" )");
		System.out.println("p1 = p2? " + p1.isTheSamePoint(p2));
		System.out.println("p1 e p2 têm a mesma abcissa? " + p1.haveTheSameAbscissa(p2));
		System.out.println("p1 e p2 têm a mesma ordenada? " + p1.haveTheSameOrdinate(p2));
		
		Point p4 = p1.getBetweenPoint(p2);
		System.out.println("Ponto intermédio entre o ponto 1 e 2 tem coordenadas: "); 
		System.out.println("p4 = (" + p4.abcissa + " , " + p4.ordenada +" )");
	}
}
