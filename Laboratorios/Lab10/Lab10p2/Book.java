package Lab10p2;

public class Book {
	public int yearPub;    //ano de publica��o do livro
	public int nrPag;      // n�mero de p�ginas do livro
	public String title;     //t�tulo
	public Author authors[];  //array de autores porque pode ser mais do que um
	public Publisher publisher;  
	private int idxAuthor = 0;
	
	
	public Book(int nrAuthor, Publisher p, String title, int pages, int year) {  //construtor
		authors = new Author[nrAuthor];   //cria��o de um array com tantos elementos quantos o n�mero de autores do livro
		this.publisher = p;
		this.title = title;
		this.nrPag = pages;
		this.yearPub = year;
	}

	public void addAuthor(Author a) {
		authors[idxAuthor] = a;   // coloca��o do nome dos autores no array
		idxAuthor++;
	}

	public String printBook() {
		String message="";
		for (int i=0;i< idxAuthor;i++)   //constru��o da mensagem com o nome de cada autor, t�tulo do livro, n�p�ginas e ano publica��o
			message += authors[i].lastName + ", " + authors[i].firstName + " " + authors[i].middleName + "; "; 
		message += title + "; " + nrPag + "; " + yearPub; 
		return message;
	}

}
