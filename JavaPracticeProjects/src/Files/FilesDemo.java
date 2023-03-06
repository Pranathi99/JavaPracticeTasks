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
//		FileWriterDemo();
//		FileReaderDemo();
		BufferedWriterDemo();
		BufferedReaderDemo();
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
	
	private static void BufferedReaderDemo() {
		// TODO Auto-generated method stub
		String line="";
		try {
			File f=new File("sample.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
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

	private static void BufferedWriterDemo() {
		// TODO Auto-generated method stub
		String line="";
		try {
			Scanner sc=new Scanner(System.in);
			File f=new File("sample.txt");
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			while((line=sc.nextLine())!="")
			{
				bw.append(line+"\n");
			}
			bw.close();
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

}
