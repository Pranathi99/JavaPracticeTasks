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

}
