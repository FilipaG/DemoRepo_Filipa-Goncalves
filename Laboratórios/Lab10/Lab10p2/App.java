package Lab10p2;

public class App {
	public static void main(String [] args){
		Publisher p = new Publisher("O'Reilly");
		Author a1 = new Author("Jonathan", "M.", "Knudsen", "USA");
		Author a2 = new Author("Patrick", "R.", "Niemeyer", "USA");
		Book b = new Book(2, p, "Learning Java", 726, 2000);
		b.addAuthor(a1);
		b.addAuthor(a2);
		System.out.println(b.printBook());
		}
}
