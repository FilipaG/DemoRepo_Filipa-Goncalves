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
		BufferedReader br = new BufferedReader(new FileReader(fileIn));  //o ficheiro fileIn é lido e armazenado provisoriamente pelo buffer
		PrintWriter pw = new PrintWriter(fileOut);     //criação do ficheiro fileOut onde será inserida a informação
		String line = null;
		while ((line = br.readLine()) != null) { //faz a leitura de cada linha até chegar à linha null (fim do ficheiro)
			int pos = line.lastIndexOf(" ");   //posição em que começa a leitura da informação
			int grade = Integer.parseInt(line.substring(pos + 1)); //inteiro encontrado em cada string (linha)
			if (grade >= 10) {
				pw.println(line); //imprimir notas apenas se forem positivas (>=10)
			}
		}
		br.close();pw.close(); //fecho das streams de leitura e escrita
	}
	
	public static void main (String[]args) throws FileNotFoundException, IOException
	{
		String Grades= "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab17\\Grades.txt";  //localização do ficheiro Grade (input)
		String GradesAprov = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab17\\GradesApprov.txt"; //localização do ficheiro de output a ser criado
		copyApproved(Grades, GradesAprov);
	}
}
