package assessments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class virtualKeyForYourRepositories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Virtual Key For Your Repositories");
		System.out.println("By :\nPranathi Ganti\nprganti@teksystems.com ");
		Set<String>files=new TreeSet<String>();
		Map<String,List<String>>mp=new HashMap<String,List<String>>();
		
		while(true)
		{
			System.out.println("\nChoose any of the following operations:");
			System.out.println("1.List file names in root directory");
			System.out.println("2.Add/Delete/Search a file");
			System.out.println("3.Exit the Application");
			
			Scanner sc=new Scanner(System.in);
			String option=sc.next();
			
			switch(option){
			case "1":
				getListOfFiles(mp.getOrDefault("~/",new ArrayList<String>()));
				System.out.println("--------------------------------------------------");
				break;
			
			default:
					System.out.println("Please enter valid input operation");	
					System.out.println("--------------------------------------------------");
			}
		}
		
	}

	

	private static void getListOfFiles(List<String> list) {
		if(list.size()==0)
			System.out.println("No files to list in root directory");
		else
		{
			System.out.println("Files in root directory - ");
			Collections.sort(list);
			for(String file:list)
			{
				System.out.println(file);
			}
		}
	}
}
