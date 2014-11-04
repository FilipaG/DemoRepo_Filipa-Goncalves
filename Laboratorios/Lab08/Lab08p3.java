package sessão09_10;


import java.util.Scanner;

public class Lab08p3 {
	
	public static double specifyRadius() 
	{
		Scanner radius = new Scanner(System.in);
		double rad  = radius.nextDouble();
		return rad;
	}
	
	public static double specifyHeight() 
	{
		Scanner height = new Scanner(System.in);
		double hgt  = height.nextDouble();
		return hgt;
	}
	
	public static double calculateBaseArea(double rad) 
	{
		double baseArea;                         
		baseArea = Math.PI * Math.pow(rad, 2);
		return baseArea;
	}
	
	public static double calculateLateralArea(double rad, double hgt) 
	{
		double lateralArea;
		lateralArea = hgt *2*Math.PI*rad; 
		return lateralArea;
	}
	
	public static double calculateTotalArea(double rad, double hgt) 
	{
		double totalArea;
		totalArea = calculateLateralArea(rad, hgt) + 2 * calculateBaseArea(rad);
		return totalArea;
	}
		
	public static double calculateVolume(double rad, double hgt) 
	{
		double volume;
		volume = hgt*calculateBaseArea(rad);
		return volume;
	
	}
		
	public static void main(String[] args)
	{
		double radius;
		double height;
		double baseArea;
		double lateralArea;
		double totalArea;
		double volume;
		
		System.out.println("Enter the dimensions of the cylinder");
		
		System.out.print("Radius: ");
		radius = specifyRadius();
		
		while (radius < 0){
			System.out.println("Invalid number");
			System.out.print("Radius: ");
			radius = specifyRadius();
		}
			
		System.out.print("Height: ");
		height = specifyHeight();
		while (height < 0){
			System.out.println("Invalid number");
			System.out.print("Height: ");
			height = specifyHeight();
		}
		baseArea = calculateBaseArea(radius);
		volume = calculateVolume(radius, height);
		System.out.println("\nCylinder Characteristics");
		System.out.println("Radius: " + radius);
		System.out.println("Height: " + height);
		System.out.println("Base Area: " + baseArea);
		System.out.println("Volume: " + volume);
	}
}