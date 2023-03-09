package assessments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class virtualKeyForYourRepositories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Virtual Key For Your Repositories");
		System.out.println("By :\nPranathi Ganti\nprganti@teksystems.com ");
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
			case "2":
				while(true)
				{
					System.out.println("Choose an option:");
					System.out.println(" 2a.Add a file");
					System.out.println(" 2b.Delete a file");
					System.out.println(" 2c.Search a file");
					System.out.println(" 2d.Return to main content");
					
					String opt=sc.next();
					if(opt.equals("2d"))
						break;
					
					switch(opt) {
					case "2a":
						String fileName=sc.next();
						addFile(fileName,mp);
						System.out.println("--------------------------------------------------");
					break;
					case "2b":
						fileName=sc.next();
						deleteFile(fileName,mp);
						System.out.println("--------------------------------------------------");
						break;
					case "2c":
						fileName=sc.next();
						searchFile(fileName,mp);
						System.out.println("--------------------------------------------------");
						break;
					default:
						System.out.println("Invalid option. Please try again!");
						System.out.println("--------------------------------------------------");
					}
				}
				System.out.println("--------------------------------------------------");
				break;
			case "3":
					return;
			default:
					System.out.println("Please enter valid input operation");	
					System.out.println("--------------------------------------------------");
			}
		}
		
	}

	private static void searchFile(String fileName, Map<String, List<String>> mp) {
		Iterator it=mp.entrySet().iterator();
		List<String>filesPathList=new ArrayList<String>();
		while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String key=(String) entry.getKey();
 
            // Adding some bonus marks to all the students
            List<String>list=(List<String>) entry.getValue();
            for(String file:list)
            {
            	if(file.equals(fileName))
            	{
            		filesPathList.add(key+fileName);
            	}
            }
        }
		if(filesPathList.size()>0)
		{
			System.out.println("FileName found at locations:");
			for(String s:filesPathList)
				System.out.println(s);
		}
		else
		{
			System.out.println("File not found!");
		}
    }

	private static void deleteFile(String fileName, Map<String, List<String>> mp) {
		String pathName=fileName.substring(0, fileName.lastIndexOf("/")+1);
		System.out.println(pathName);
		fileName=fileName.substring(fileName.lastIndexOf("/")+1);
		if(pathName.equals(""))
			pathName="~/";
		List<String>al=mp.getOrDefault(pathName,new ArrayList<String>());
		if(al.contains(fileName))
		{
			al.remove(fileName);
			mp.put(pathName, al);
			System.out.println("File deleted successfully!");
		}
		else
		{
			System.out.println("File does not exist in given directory to delete");
		}
	}

	private static void addFile(String fileName, Map<String, List<String>> mp) {
		String pathName=fileName.substring(0, fileName.lastIndexOf("/")+1);
		System.out.println(pathName);
		fileName=fileName.substring(fileName.lastIndexOf("/")+1);
		if(fileName.indexOf(".")==-1)
		{
			System.out.println("Invalid FileName. Please try again!");
			return;
		}
		if(pathName.equals(""))
			pathName="~/";
		List<String>al=mp.getOrDefault(pathName,new ArrayList<String>());
		if(al.contains(fileName))
			System.out.println("File already exists");
		else
		{
			al.add(fileName);
			mp.put(pathName, al);
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
