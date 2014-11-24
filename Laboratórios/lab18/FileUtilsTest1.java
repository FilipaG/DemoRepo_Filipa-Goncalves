package lab18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
import org.junit.Assert;


/**
 * Case tests for {@link FileUtils} class.
 * 
 * @author Challenge.IT
 *
 * Copyright (c) 2014, Challenge.IT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is distributed in the hope that it will be useful for learning purposes, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 * */
public class FileUtilsTest1 
{
	@Test
	public void shouldCopyTextFileToAnotherPath()
	{
		// Arrange
		String source = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\text.txt";
		String dest   = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\text_copy.txt";
		
		// Act
		
		// Assert
		Assert.assertTrue(FileUtils.copyTextFile(source, dest));
	}
	
	@Test
	public void shouldCopyBinaryFileToAnotherPath()
	{
		// Arrange
		String source = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\ImageTest.jpg";
		String dest   = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\ImageTest_copy.jpg";
		
		// Act
		
		// Assert
		Assert.assertTrue(FileUtils.copyBinaryFile(source, dest));
	}
	
	@Test
	public void shouldParseTextFile()
	{
		// Arrange
		String source = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\text.txt";
		String delim = "|";
		
		// Act
		String[] parsedText = FileUtils.parseTextFile(source, delim);
				
		// Assert
		Assert.assertNotNull(parsedText);
		Assert.assertTrue(parsedText.length == 3);
		Assert.assertEquals(parsedText[0], "RANDSTAD FORMACAO");
		Assert.assertEquals(parsedText[1], "LABORATORIO 18");
		Assert.assertEquals(parsedText[2], "JAVA IO");	
	}
	
	
	@Test
	public void shouldCopyAndReplaceAWordToAnotherPath()
	{
		//Arrange
		String fileIn = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab17\\ZeZambeze.txt";
		String fileOut = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\JoseZambeze.txt";
		String wordToFind = " Ze ";
		String newWord = " Jose ";
		
		Assert.assertTrue(FileUtils.copyAndReplace(fileIn, fileOut, wordToFind, newWord));
	}
	
	@Test
	public void shouldNotHaveWordToFind() throws IOException
	{
		//Para não estar a testar num ficheiro inteiro, podemos criar uma String com os casos problemáticos
		//Depois inserimo-la num ficheiro para corrermos o método copyAndReplace e comparamos a string que
		//esperamos como resultado com o conteúdo do ficheiro produzido pelo método.
		String line1 = "Ze foi fazer um Safari ao Zambeze";
		String line1out = "Jose foi fazer um Safari ao Zambeze";

		String fileIn = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\OriginalTest.txt";
		String fileOut = "C:\\Users\\Filipa\\workspace\\sessão21_10\\src\\lab18\\ReplaceTest.txt";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileIn));
		bw.write(line1);   //escrita da linha no ficheiro
		bw.close();			// podemos fazer flush ou close -> o objectivo é que seja feita a descarga do conteúdo do buffer no ficheiro
		FileUtils.copyAndReplace(fileIn, fileOut, "Ze", "Jose");       
		BufferedReader br = new BufferedReader(new FileReader(fileOut));
		Assert.assertEquals(line1out, br.readLine());	    // verificação se a String produzida é igual à string esperada	
	}
}

