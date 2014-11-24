package lab18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * This class implements utility methods to perform operations on files.
 * @author FilipaG
 *
 */
public class FileUtils {
	/**
	 * The method copyTextFile copies the contents of a text file to another . This method 
	 * receives as parameter the path of the original file and the path where the copy will be. 
	 * @param source
	 * @param dest
	 * @return true if the copy was successful, false otherwise.
	 */
	public static boolean copyTextFile(String source, String dest)
	{
		try(BufferedReader reader = new BufferedReader(new FileReader(source)); 
				BufferedWriter writer = new BufferedWriter(new FileWriter(dest)))
		{
			String nextLine = reader.readLine();
			while(nextLine != null)       //enquanto a linha n�o for nula
			{
				writer.write(nextLine);   //impress�o no ficheiro de output da linha copiada do ficheiro de Input
				writer.newLine();       //cria��o de uma nova linha
				nextLine = reader.readLine();  //Leitura da pr�xima linha do ficheiro de input
			}
			reader.close(); // fechar o BufferedReader
			writer.close();   //fechar o PrintReader
		}
		catch (FileNotFoundException e)   //excep��o: caso o ficheiro n�o seja encontrado
		{
			System.out.println("File not found or could not be opened");
			e.printStackTrace();
			return false;
		}
		catch (IOException e)  
		{
			System.out.println("Error reading from file");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * The copyBinaryFile method makes a copy of a binary file. This method receives as parameter
	 * the path of the original file and the path where the copy will be. 
	 * @param source
	 * @param dest
	 * @return true if the copy was successful, false otherwise.
	 */
	public static boolean copyBinaryFile(String source, String dest)
	{
		try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(dest)))
		{
			int nextDataByte = input.read();
			while(nextDataByte != -1)
			{
				output.write(nextDataByte);   //impress�o no ficheiro de output 
				nextDataByte = input.read(); 	
			}
			input.close();
			output.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found or could not be opened");
			e.printStackTrace();
			return false;
		}
		catch (IOException e1)
		{
			System.out.println("Error reading the file");
			e1.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * The parseTextFile method makes parse of a text file into an array of Strings as indicated 
	 * by the delimiter parameter.
	 * @param source
	 * @param delim
	 * @return
	 */
	public static String[] parseTextFile(String source, String delim)
	{
		try(BufferedReader reader = new BufferedReader(new FileReader(source)))// criar um objecto do tipo BufferReader que tem o contr�do fo ficheiro source
		{
			String text = "";
			String nextLine = reader.readLine(); //String que tem o conte�do da pr�xima linha
			while(nextLine != null)  // este ciclo cria uma String com o conte�do total do ficheiro
			{
				text+= nextLine;    
				nextLine = reader.readLine();
			}
			
			StringTokenizer tokenizer =  new StringTokenizer(text, delim);  
			//instancia��o de um objeto do tipo StringTokenizer que "parte" o conte�do da string text em tokens delimitados pela string "delim"
			
			String[] parsedText = new String[tokenizer.countTokens()];   
			// array onde ser�o colocados todos os tokens da string text
			
			int i = 0;
			while (tokenizer.hasMoreElements()) 
			//enquanto houver elementos no tokenizer armazena-os como elementos do array parseText
			{
				parsedText[i] = tokenizer.nextToken();
				// System.out.println(parsedText[i]);   -> utilizei apenas para testar se o ciclo estava a fazer o que era pedido
				i++;
			}
			reader.close();
			return parsedText;
		}
		catch (FileNotFoundException e)
		{
			return null;
		}
		catch (IOException e)
		{
			return null;
		}
	}
		
	/**
	 * This method reads the fileIn file and copy the file text to fileOut, but substitutes with newWord 
	 * whenever a specific word WordToFind occur. The method WordToFind tests whether the word is part 
	 * of a longer word , analyzing the character immediately before the beginning of the word and 
	 * immediately following the end of wordToFind.
	 * @param fileIn
	 * @param fileOut
	 * @param wordToFind
	 * @param newWord
	 * @return
	 */
	public static boolean copyAndReplace(String fileIn, String fileOut, String wordToFind, String newWord) {

		try (BufferedReader br = new BufferedReader(new FileReader(fileIn));
			PrintWriter pw = new PrintWriter(fileOut)) {
			String line = null;
			String newLine="";
			while ((line = br.readLine()) != null) {
				while(line.contains(wordToFind)) {   // verifica se a linha tem a palavra referente � wordToFind
					
					//verificar se a string wordTofind n�o faz parte de nenhuma palavra, ou seja, se o caracter que a antecede e a sucede s�o " "
					
										
					char afterWordToFind = line.charAt(line.indexOf(wordToFind)+wordToFind.length());  
					//obter o caracter que est� depois da palavra WordToFind
						
					int beginIndex = line.indexOf(wordToFind)+wordToFind.length(); 
					//indice da posi��o onde inicia a nova string (na primeira posi��o ap�s a palavra at� ao fim da linha)
					
					int endIndex = line.indexOf(wordToFind);
					//indice da posi��o onde finaliza a string (na primeira posi��o da palavra wordToFind)
					
					
					// Se WordToFind � a primeira palavra da linha, verificar se o caracter ap�s o wordToFind � letra
					if ((line.indexOf(wordToFind)==0)&& (!isALetter(afterWordToFind)))
					{
						newLine = newWord;
					}
					
					// Se wordToFind cont�m o �ltimo caracter ficheiro
					else if ((beginIndex==line.length())&&(!isALetter(line.charAt(endIndex-1))))
					{
						newLine += newWord;
					}
					
					// beforeWordTofind=line.charAt(endIndex-1))
					else if ((!isALetter(afterWordToFind))&&(!isALetter(line.charAt(endIndex-1))))
					{
						newLine += line.substring(0,endIndex) + newWord ;   
						// A linha j� obtida, substituir a palavra "wordToFind" pela palavra "newWord" e adicionar
					}
					
					else  // Se a palavra "wordToFind" fizer parte de uma palavra maior, n�o se faz qualquer sibstitui��o
					{	
						newLine += line.substring(0,beginIndex); 
					}
					line = line.substring(beginIndex);   //a linha a analisar passa a ser apenas da primeira posi��o ap�s a ocorr�ncia da palavra wordToFind at� ao fim da linha.				
					//� esta nova linha que ser� novamente analisada para verificar a ocorr�ncia da palavra wordToFind
				}
				newLine +=line;
				pw.println(newLine);  //impress�o das linhas de texto no ficheiro fileOut
			}
			br.close(); // fechar o BufferedReader
			pw.close();   //fechar o PrintReader
		} catch (FileNotFoundException e) // se o ficheiro n�o for encontrado
		{
			System.out.println("File not found or could not be opened");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Error reading from file");
			e.printStackTrace();
		}
		return true;
	}
	
	
	/**
	 * This method verifies if the string wordTofind is not a part of any word, that is, if the character that 
	 * precedes or succeeds is not a letter.
	 * @param char1
	 * @return true if the character is a letter, and false otherwise
	 */
	public static boolean isALetter(char char1){
		if ((char1 > 96 && char1 < 123 )||(char1 > 64 && char1 < 91))// testar se est� entre a e z ou A e Z
		{
			return true;
		}
		return false;
	}	
		
		
		
		public static void main (String[] args){
			String FileIn = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab18\\text.txt";
			String FileOut = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab18\\text_copy.txt";
					
			copyTextFile(FileIn, FileOut);
			
			String binarySource = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab18\\ImageTest.jpg";
			String binaryDest = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab18\\ImageTest_copy.jpg";
			copyBinaryFile(binarySource, binaryDest);
							
			parseTextFile(FileIn, "|");
			
			String fileIn = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab17\\ZeZambeze.txt";
			String fileOut = "C:\\Users\\Filipa\\workspace\\sess�o21_10\\src\\lab18\\JoseZambeze.txt";
			String wordToFind = "Ze";
			String newWord = "Jose";
			
			copyAndReplace(fileIn, fileOut, wordToFind, newWord);
			
		}
		
	}
