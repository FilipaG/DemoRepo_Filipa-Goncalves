package Lab10p1;

public class App {
		public static void main(String [] args){
			Employee e = new Employee(34, "Jo�o");   //cria��o de um objecto do tipo Employee, com id=34 e name "Jo�o"
			e.increaseSalary(e, 1200);    // incremento do salary do objeto acima criado para 1200
			Employee.increaseSalary(e, 300);   // incremento do salary do objeto acima criado para 1500  (1200+300)
			System.out.println(e.getSalary());   //output: 1500.0 (porque � uma vari�vel do tipo double)
	}
}
