package Lab09p3;

import java.util.Scanner;

public class Point {
	public double abcissa;
	public double ordenada;
	
	public Point(double x, double y){   //construtor
		this.abcissa = x;
		this.ordenada = y;
	}
	
	public  Point addAPointToThePoint(Point p){    //Adiciona ao ponto as coordenadas de p;
		double x = (this.abcissa + p.abcissa);       //somar as abcissas 
		double y = (this.ordenada + p.ordenada);   // somar as ordenadas
		return new Point(x,y);
	}	
		
	public boolean isTheSamePoint(Point p){  //Indica se o ponto p é igual ao ponto (têm a mesma abcissa e a mesma ordenada);
		
		return(haveTheSameAbscissa(p)&&haveTheSameOrdinate(p))?(true):(false);     
	}	
		
	public boolean haveTheSameAbscissa(Point p){     //Indica se têm a mesma abscissa;
		return (this.abcissa == p.abcissa)?(true):(false);
	}
	
	public boolean haveTheSameOrdinate(Point p){     //Indica se têm a mesma ordenada;
		return (this.ordenada == p.ordenada)?(true):(false);
	}
	
	public Point getBetweenPoint(Point p){     //Retorna um ponto intermédio; 
	  double x = (this.abcissa + p.abcissa)/2;        // Pm = ((x1+x2)/2; (y1+y2)/2)
	  double y = (this.ordenada + p.ordenada)/2;
	  
	  return new Point(x , y);
	}
	
	
	
	

}
