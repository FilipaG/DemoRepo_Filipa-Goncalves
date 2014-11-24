package Lab12;


public class Book {
	public int yearPub;    //ano de publica��o do livro
	public String title;     //t�tulo
	public String publisher; 
	int requestNum = 0;       //n�mero de requisi��es do livro
	boolean bookIn= true; // � possivel requisitar o livro
	private Date lastRequest;   //data da �ltima requisi��o do livro
	
	/**
	 * The Book constructor
	 * @param title
	 * @param publisher
	 */
	public Book(String title, String publisher){    //construtor
		this.title = title;
		this.publisher = publisher;
	}
	
	/**
	 * Return book's title
	 * @param title
	 * @return
	 */
	public String getTitle(){ // Retorna o t�tulo do livro.
		return title;
	}
	
	/**
	 * Return Book's publisher
	 * @return
	 */
	public String getPublisher() {//Retorna a editora do livro.
		return publisher;
    }
	
	/**
	 * Return the Book's requisition date 
	 * @return
	 */
	public Date getRequestDate(){ //Retorna a data da requisi��o do livro.
		return lastRequest;
	}
	
	/**
	 * Return the date of the Book's last requisition
	 * @return
	 */
	public Date getLastRequestDate(){ //Retorna a data da �ltima requisi��o do livro.
	return lastRequest;
	}
	
	
	/**
	 * Return the total number of Book's requests
	 * @return
	 */
	public int getTotalRequests(){ //Retorna o numero total de requisi��es do livro.
		return requestNum;
	}
	
	/**
	 * Order the book.
	 * @return if possible returns true , otherwise returns false
	 */
	boolean requestIt(Date today){  //Requisitar o livro, se for poss�vel retorna true, caso contr�rio, retorna false.
		if (bookIn){
			bookIn = false;
			requestNum ++;
			lastRequest = today;
			return true;
		}
		else
			return false;
	}
	
	
	/**
	 * Returns the book, 
	 * @return if possible returns true , otherwise returns false 
	 */
	public boolean returnIt(){  //Retorna o livro, se for poss�vel retorna true, caso contr�rio, retorna false.
		if (bookIn) 
			return false;
		else
		{
			bookIn = true;
			return true;
		}
	}
	
	/**
	 * Print the book's information
	 */
	public void print(){   //Mostra na consola a informa��o do livro.
		System.out.println("Book's information");
		System.out.println("Title: " + getTitle());
		System.out.println("publisher: " + getPublisher());
		System.out.println("Book is avaiable: " + bookIn);
	}
}
