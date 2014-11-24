package Lab10p1;

public class Employee {
	private int id;        //identifica��o do empregado
	private String name;    //nome do empregado
	private double salary;   // sal�rio
	public Employee(int id, String name){   //Construtor
		this.id = id;
		this.name = name;
		this.salary = 0;    // valor inicial do sal�rio = 0
	}
	public String getName(){    //m�todo que nos permite obter o name do empregado
		return this.name;
	}
	public int getId(){     //m�todo que nos permite obter a id do empregado
		return this.id;
	}
	public double getSalary(){   //m�todo que nos permite obter o salary do empregado
		return this.salary;
	}
	public static void increaseSalary(Employee e, double value){       // incremento no sal�rio
		e.salary += value;
	}
}
	
