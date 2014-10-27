package Quiz19;

public class Garage {
	public static void main(String[] args) {
		Vehicle car = new Car(); //estamos a criar um novo objeto do tipo Car, mas só olhamos para ele enquanto um Vehicle pois a variável a que está associado é deste tipo
		Vehicle bike = new Bike();
		car.start();
		bike.start();
	}
}

