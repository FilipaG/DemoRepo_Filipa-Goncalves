package lab17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This program read the grades in fileIn and creates a new file, fileOut with only the positive Grades
 * @author FilipaG
 */
public class PositiveGrades {
	public static void copyApproved(String fileIn, String fileOut) throws
		FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileIn));  //o ficheiro fileIn � lido e armazenado provisoriamente pelo buffer
		PrintWriter pw = new PrintWriter(fileOut);     //cria��o do ficheiro fileOut onde ser� inserida a informa��o
		String line = null;
		while ((line = br.readLine()) != null) { //faz a leitura de cada linha at� chegar � linha null (fim do ficheiro)
			int pos = line.lastIndexOf(" ");   //posi��o em que come�a a leitura da informa��o
			int grade = Integer.parseInt(line.substring(pos + 1)); //inteiro encontrado em cada string (linha)
			if (grade >= 10) {
				pw.println(line); //imprimir notas apenas se forem positivas (>=10)
			}
		}
		br.close();pw.close(); //fecho das streams de leitura e escrita
	}
	
	public static void main (String[]args) throws FileNotFoundException, IOException
	{
		String Grades= "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab17\\Grades.txt";  //localiza��o do ficheiro Grade (input)
		String GradesAprov = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab17\\GradesApprov.txt"; //localiza��o do ficheiro de output a ser criado
		copyApproved(Grades, GradesAprov);
	}
}
