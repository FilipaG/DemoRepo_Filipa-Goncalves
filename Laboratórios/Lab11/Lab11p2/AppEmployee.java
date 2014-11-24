package Lab11p2;

import java.util.Scanner;

public class AppEmployee {
	final static int UNITS_PT = 250;   //unidades montadas por empregados em part-time
	final static int UNITS_FT = 700;    //unidades montadas por empregados em full-time
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		EmployeeBonus b = new EmployeeBonus();
		System.out.println("Enter department: ");
		int dept = kbd.nextInt();     
		double bonus = 0;      //bonus inicial
		
		switch (dept)
		{
		case 1:      //Departamento de Vendas
			System.out.print("Enter sales: ");
			double sales = kbd.nextDouble();
			bonus = b.getBonus(sales);
			break;
		
		case 2:       //Departamento de Produção
			System.out.print("Enter number of units produced: ");
			int numUnits = kbd.nextInt();
			bonus = b.getBonus(numUnits);
			break;
		
		case 3:        //Departamento de montagem
			System.out.print("Enter # of pieces completed: ");
			int pieces = kbd.nextInt();
			System.out.print("Full-time (1) or Part-Time (2)? ");
			int empType = kbd.nextInt();
			int bonusLimit = (empType == 1) ? UNITS_FT : UNITS_PT;
			bonus = b.getBonus(pieces, bonusLimit);
			break;
		
		default:
		System.out.print("Error! ");
		}
		System.out.println("Bonus Amount: " + bonus + "€");
		}
}
