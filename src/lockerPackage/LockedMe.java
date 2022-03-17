package lockerPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{
	static final String ProjectFilepath="D:\\Pritpal\\PP\\SimpliLearn\\Assignment-1\\GetAllFiles";
	
	/**
	 * This Method will Display the Menu for end user
	*/
	public static void Menu()
	{
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("\t Welcome to LockedMe.com Prototype Application");
		System.out.println("\t Developed by : Pritpal Singh");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("\t1. Display all files");
		System.out.println("\t2. Add a New File");
		System.out.println("\t3. Delete a File");
		System.out.println("\t4. Search a File");
		System.out.println("\t5. Exit");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	}

	/**
	 * This Method will Retrieve all the files
	 */
	
	public static void displayAllFiles()
	{
		File folderPath = new File(ProjectFilepath);
		File[] listOfFiles = folderPath.listFiles();
		
		if(listOfFiles.length>0)
		{
			System.out.println("Please find the File List Below:\n");
			for(var l:listOfFiles)
			{
				System.out.println(l.getName());
			}
		}
		else
		{
			System.out.println("Please select the Appropriate Option");
		}
		
	}
	
	/**
	 * This Method will read file details and create/add new Files
	 */
	public static void addNewFile()
	{
		try 
		{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter File Name");
		fileName = obj.nextLine();
		
		int countLines;
		System.out.println("Enter how many lines to add in file");
		countLines= Integer.parseInt(obj.nextLine());
		
		
		FileWriter fw = new FileWriter(ProjectFilepath+"\\"+fileName);
			
			for(int i=1;i<=countLines;i++)
			{
				System.out.println("Add a Line: ");
				fw.write(obj.nextLine()+"\n");
			}
			
			System.out.println("File Created Sucessfully");
			fw.close();
		} 
		catch (Exception Ex) 
		{
			
		}
	}
	
	/**
	 * This Method will Delete the selected File
	 */
	public static void deleteFile()
	{
		try
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter File Name");
			fileName = obj.nextLine();
			
			// Get all file name into a list
			ArrayList<String> allFilesNames = new ArrayList<String>();
			
			File folder = new File(ProjectFilepath);
			File[] listOfFiles = folder.listFiles();
			
			if(listOfFiles.length>0)
			{
				for(var l:listOfFiles)
				{
					allFilesNames.add(l.getName());
				}
			}
			
			File f = new File(ProjectFilepath+"\\"+fileName);
			
			if(allFilesNames.contains(fileName))
			{
				f.delete();
				System.out.println("File Deleted Successfully");
			}
			else
			{
				System.out.println("Please Check the name, and Try Again");
			}
		}
		catch (Exception Ex)
		{
			System.out.println("Unable to delete, Please contact Customer Care");
		}
	}

	/**
	 * This Method helps in searching the files, If it exists or not
	 */
	public static void searchFiles()
	{
		try
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter file Name to be Searched");
			fileName=obj.nextLine();
			
			
			// Get all file name into a list
			ArrayList<String> allFilesNames = new ArrayList<String>();
			
			File folder = new File(ProjectFilepath);
			File[] listOfFiles = folder.listFiles();
			
			if(listOfFiles.length>0)
			{
				for(var l:listOfFiles)
				{
					allFilesNames.add(l.getName());
				}
			}
			
			File f = new File(ProjectFilepath+"\\"+fileName);
			
			if(allFilesNames.contains(fileName))
			{
				System.out.println("File is Available");				
			}
			else
			{
				System.out.println("File is Not Available, Please check the Name again");
			}
			
		}
		catch(Exception Ex)
		{
			
		}
	}
	
}
	