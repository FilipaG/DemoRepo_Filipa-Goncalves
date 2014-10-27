
public class Lab02p2 {

	public static void main(String[] args) {
		int x1 = 3;
		int x2 = 5;
		x1 = x2 % x1;       // x1 = 2  (5 = 1 * 3 + 2)
		switch (x1) {
		case 1:
		x2 = x2 + 2;
		case 2:              //como x1 = 3 é este case que vai ser executado
		x2 = x2 * x1;        // x2 = 5 * 2 = 10 
		break;
		case 3:              //como não tem break, o switch continua a ser executado
		x2 = x2 / 2;         // x2 = 10 / 2 = 5
		break;
		default:
		x2 = x2 + x1;
		break;
		}
		System.out.println("x2: " + x2); 

	}

}
