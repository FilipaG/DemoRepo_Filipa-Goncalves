package Lab10p2;

public class Book {
	public int yearPub;    //ano de publicação do livro
	public int nrPag;      // número de páginas do livro
	public String title;     //título
	public Author authors[];  //array de autores porque pode ser mais do que um
	public Publisher publisher;  
	private int idxAuthor = 0;
	
	
	public Book(int nrAuthor, Publisher p, String title, int pages, int year) {  //construtor
		authors = new Author[nrAuthor];   //criação de um array com tantos elementos quantos o número de autores do livro
		this.publisher = p;
		this.title = title;
		this.nrPag = pages;
		this.yearPub = year;
	}

	public void addAuthor(Author a) {
		authors[idxAuthor] = a;   // colocação do nome dos autores no array
		idxAuthor++;
	}

	public String printBook() {
		String message="";
		for (int i=0;i< idxAuthor;i++)   //construção da mensagem com o nome de cada autor, título do livro, nºpáginas e ano publicação
			message += authors[i].lastName + ", " + authors[i].firstName + " " + authors[i].middleName + "; "; 
		message += title + "; " + nrPag + "; " + yearPub; 
		return message;
	}

}
