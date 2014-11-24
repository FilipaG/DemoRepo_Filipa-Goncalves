package Lab12;

public class Date {
	private int day;
	private int month;
	private int year;
	
/**
 * The constructor have the following parameters	
 * @param day
 * @param month
 * @param year
 * checks if the numbers introduced are according with the calendar
 * if the values introduced are out of  boundaries return a message "invalid value" 
 */
	public Date(int day , int month, int year){   //construtor - verificação se a data foi introduzida corretamente
		this.day = day;
		this.month = month;
		this.year = year;
		
		if (year > 0){
			if ((month > 0)&&(month <= 12))
			{
				DaysInTheMonth(year,month);
				if (day>DaysInTheMonth(year,month))
				{
					throw new IllegalArgumentException();  // lançar excepção
				}
			}
			else 
			{
				throw new IllegalArgumentException();  //lançar excepção
			}
		}
		else 
		{	
			throw new IllegalArgumentException();  // lançar excepção
		}
		
	}
	
	/**
	 * Determine the maximum number of days of each month
	 * @param year
	 * @param month
	 * @return  maxDay - maximum number of days of each month
	 */
	public  int DaysInTheMonth (int year, int month)  // Determinar o número de dias de cada mês
	{
		boolean	leapYear = (year % 4 == 0) && ( (year % 100 != 0) || (year % 400 == 0) );  // ano bissexto
		int maxDay=0;
		if (((month %2 !=0)&&(month < 8))||((month %2 ==0)&&(month > 7)))//meses com 31 dias
		{ 
			maxDay = 31;
			return maxDay;      // valor máximo de dias de cada mês
		}
		else if ((((month %2 ==0)&&(month!=2)&&(month < 8))||((month %2 !=0)&&(month > 7))))  // meses com 30 dias
		{
			maxDay = 30;
			return maxDay;      // valor máximo de dias de cada mês
		}
		else if (month==2) {  //mês (2) Fevereiro
			maxDay = (leapYear)?(29):(28);
			return maxDay;      // valor máximo de dias de cada mês
		}
		else 
		{
			throw new IllegalArgumentException();  // lançar excepção
		}
	}

	
	/**
	 * Constructor that allows Date to be called without any parameters.
	 */
	public Date()   
	{
		day = 0;
		month = 0;
		year = 0;
	}
	
	/**
	 * Return the date as a String “DD-MM-YYYY”
	 */
	public String toString(){ // Retorna a data com o seguinte formato “DD-MM-YYYY”
		String date = day + "-" + month + "-" + year;
		return date;
	}
	
	/**
	 * Compares the claimed date with the date passed as parameter. 
	 * @param date
	 * @return -1 , 0 or 1 if the claimed date is respectively less than , equal to or greater than the date 
	 */
	
	public int compareTo(Date date){  //Compara a data invocada com a data passada por parâmetro. Deve retornar <0, =0 ou >0, caso a data invocada seja respectivamente menor, igual ou maior que a data “date”.
		int yearDif = this.year - date.year;
		int monthDif = this.month - date.month;
		int dayDif = this.day - date.day;
		
		if ((yearDif==0)&&(monthDif==0)&&(dayDif==0)) // mesma data
		{	
			return 0; 
		}
		else if (((yearDif==0)&&(monthDif==0)&&(dayDif < 0))||((yearDif==0)&&(monthDif<0))||(yearDif<0))
		{	
			return -1;  //Data invocada anterior à data "date"
		}
		else if (((yearDif==0)&&(monthDif==0)&&(dayDif > 0))||((yearDif==0)&&(monthDif>0))||(yearDif>0))
		{	
		return 1;   //Data invocada anterior à data "date"
		}
	return 0;
	}
	
	/**
	 * Add to date a certain number of days and returns a new date.
	 * @param nDays
	 * @return Date
	 */
	public Date addDays(int nDays){ // Soma à data um determinado número de dias e retorna uma nova data.
		int newDay = this.day;    
		int newYear = this.year;
		int newMonth = this.month;
		int numberDays = nDays;
		
		if (numberDays < 0)
		{
			throw new IllegalArgumentException();  // lançar excepção
		}
		
		while (numberDays>=0)
		{	
			if (numberDays == 0)   // A data que retorna é a mesma que já está em sistema
			{
				break;
			}
			else 
			{
				int monthDays = DaysInTheMonth (newYear, newMonth);
				if (newDay + numberDays <= monthDays) // a nova data refere-se ao mesmo mês e ano.
				{
					newDay = newDay + numberDays;
					break;	
				}
				else   // a nova data implica mudança do mês e/ou ano
				{	
					numberDays = numberDays - (monthDays-newDay); // retirar dias até ao final do corrente mês
					newMonth ++;   //mudar de mês
					newDay=1;
					if (newMonth>12)  //mudança de ano
					{
						newMonth = 1;
						newYear ++;
					
					}
				}
			}
		}
		
		return new Date (newYear,newMonth,newDay); 
	}	
	
/**
 * Return de difference in days between to dates
 * @param date
 * @return nDays
 */
	public int diffDays(Date date){  //Devolve a diferença em dias entre a data invocada e outra data “date”.
		int newDay = this.day;
		int newMonth = this.month;
		int newYear = this.year;
		int nDays = 0;

		switch (this.compareTo(date)){  //verificar qual é a data mais antiga
		case -1:             //a data introduzida é posterior à data invocada
			int monthDays1 = DaysInTheMonth (newYear, newMonth);
			if ((newMonth == date.month)&&(newYear == date.year)) // as duas datas referem-se ao mesmo mês e ano.
			{
				nDays = date.day - newDay;
				break;	
			}
			else   // a nova data implica mudança do mês e/ou ano
			{	
				nDays = monthDays1 - newDay ; // retirar dias até ao final do corrente mês
				newMonth ++;   //mudar de mês
				newDay = 1;
				
				while ((newMonth!=date.month)||(newYear!=date.year)) //faz ciclo enquanto o mês e o ano da data invocada forem diferentes da data introduzida
				{
					nDays = nDays + monthDays1;
					newMonth++;
					if (newMonth>12)  //mudança de ano
					{
						newMonth = 1;
						newYear ++;
					}
				}
				nDays = nDays + date.day;	
				break;
			}
		case 0:
			nDays = 0;
			break;
			
		case 1://a data introduzida é anterior à data invocada	
			int monthDays2 = DaysInTheMonth (newYear, newMonth);
			if ((newMonth == date.month)&&(newYear == date.year)) // as duas datas referem-se ao mesmo mês e ano.
			{
				nDays = newDay - date.day;
				break;	
			}
			else   // a nova data implica mudança do mês e/ou ano
			{	
				nDays = monthDays2 - date.day  ; // retirar dias até ao final do corrente mês
				date.month ++;   //mudar de mês
								
				while ((newMonth!=date.month)||(newYear!=date.year))
				{
					nDays = nDays + monthDays2;
					date.month ++;
					if (date.month>12)  //mudança de ano
					{
						date.month = 1;
						date.year ++;
					}
				}
				nDays = nDays + newDay;	
				break;
			}
		}
		return nDays;  
	}
	
	
	/**
	 * @return day of the date
	 */
	public int getDay(){
		return day;    //Retorna o dia da data.
	
	}
	
	/**
	 * @return month of the date
	 */
	public int getMonth() {
		return month;  //Retorna o mês da data.
	
	}
	
	/**
	 * @return year of the date
	 */
	public int getYear(){
		return year;   //Retorna o ano da data
		
	}
}
