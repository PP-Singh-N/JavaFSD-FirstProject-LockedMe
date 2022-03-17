package lockerPackage;

import java.util.Scanner;

public class ClientApp 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int choice;
		
		do
		{
			LockedMe.Menu();
			System.out.println("Select an Option");
			choice= Integer.parseInt(obj.nextLine());
			
			switch(choice)
			{
			case 1: LockedMe.displayAllFiles();
			break;
			case 2: LockedMe.addNewFile();
			break;
			case 3: LockedMe.deleteFile();
			break;
			case 4: LockedMe.searchFiles();
			break;
			case 5: System.exit(0);
			break;
			default:System.out.println("Invalid Option");
			break;
			}
		}
			while(choice>0);
		
		
		obj.nextLine();
		obj.close();
	}

}
