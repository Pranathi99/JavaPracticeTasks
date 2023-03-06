package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCreation();
		FileWriterDemo();
		FileReaderDemo();
	}

	private static void FileCreation() {
		File newFile=new File("sample.txt");
		try {
			if(newFile.createNewFile())
				System.out.println("File Created!");
			else
				System.out.println("File already exists!");
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
	
	private static void FileWriterDemo() {
		// TODO Auto-generated method stub
		int i;
		try {
			File f=new File("sample.txt");
			FileWriter fw=new FileWriter(f);
			fw.append("Hello World!");
			fw.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}

	private static void FileReaderDemo() {
		int i;
		try {
			File f=new File("sample.txt");
			FileReader fr=new FileReader(f);
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
	}

}
