package Project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;

public class lockedMe {
	static String DIRECTORY;
	File folder_name;
	
	public lockedMe() {
		DIRECTORY= System.getProperty("user.dir");
		folder_name=new File(DIRECTORY+"/files");
		if(!folder_name.exists())
			folder_name.mkdir();
		System.out.println("DIRECTORY :"+folder_name.getAbsolutePath());
	
	}
	
	private static final String WELCOME_PROMPT=
			"\n JavaMainProject.com"+
			"\n Mahendar Maheshuni \n";
	private static final String MAIN_MENU_PROMPT = 
			"\n MAIN MENU --Select any of the following: \n"+
					"1=> list files in directory \n"+
					"2=> add, delete or search \n"+
					"3=> exit program";
	
	private static final String SECONDARY_MENU_PROMPT =
			"\n Select any of the following: \n"+
					"a=> add a file \n"+
					"b=> delete a file \n"+
					"c=> search a file \n"+
					"d=> go back";
	
	
	void showprimarymenu() {
		System.out.println(MAIN_MENU_PROMPT);
		try {
			Scanner s=new Scanner(System.in);
			int option =s.nextInt();
			switch (option) {
				case 1 :{
					showFiles();
					showprimarymenu();
				}
				case 2 :{
					showsecondarymenu();
				}
				case 3 :{
					System.out.println("Thank you.");
					System.exit(0);
				}
				default: showprimarymenu();
			}
		}
		catch(Exception e) {
			System.out.println("Enter number 1, 2 , 3");
			showprimarymenu();
			
		}
	}
	
	
	void showsecondarymenu() {
		System.out.println(SECONDARY_MENU_PROMPT);
		try {
			Scanner sc=new Scanner(System.in);
			char [] input =sc.nextLine().toLowerCase().trim().toCharArray();
			char option = input[0];
			
			switch (option) {
				case 'a' : {
					System.out.print(" > Adding a file.. enter a file name: ");
					String filename=sc.next().trim();
					addfile(filename);
					break;
				}
				case 'b' : {
					System.out.print("> Deleting a file.. enter a file name: ");
					String filename=sc.next().trim();
					deletefile(filename);
					break;
					
				}
				case 'c' : {
					System.out.print("> Searching a file.. enter a file name: ");
					String filename= sc.next().trim();
					searchfile(filename);
					break;
					
				}
				case 'd' : {
					System.out.println("> going back to MAIN MENU ");
					showprimarymenu();
					break;
					
				}
				default : System.out.println(" enter a, b, c, d ");		
			}
			showsecondarymenu();
		}
		catch(Exception e) {
			System.out.println("enter a, b, c, d");
			showsecondarymenu();
		}
		
	}
	
	
	void showFiles() {
		if(folder_name.list().length==0)
			System.out.println("the folder is empty");
		else {
			String [] list =folder_name.list();
			System.out.println(" the files in "+ folder_name+ "are : " );
			Arrays.sort(list);
			for (String st:list) {
				System.out.println(st);
			}
		}
	}
	
	void addfile(String filename) throws IOException{
		File filepath =new File (folder_name +  "/" +folder_name);
		String [] list = folder_name.list();
		for (String file:list) {
			if(filename.equalsIgnoreCase(file)) {
				System.out.println("file "+filename +" already exits at "+ folder_name);
				return;	
			}
		}
		filepath.createNewFile();
		System.out.println("file "+filename+ "added to "+ folder_name);
		
	}
	
	void deletefile(String filename) {
		File filepath = new File(folder_name + "/"+ filename);
		String [] list = folder_name.list();
		for (String file:list) {
			if(filename.equals(file) && filepath.delete()) {
				System.out.println("file "+ filename + " deleted from "+ folder_name);
				return;	
			}
		}
		System.out.println("delete operation failed. FILE NOT FOUND");
	}
	
	void searchfile(String filename) {
		String[] list = folder_name.list();
		for (String file:list) {
			if(filename.equals(file)) {
				System.out.println("found:  file "+ filename + "exits at"+ folder_name);
				return;
			}
		}
		System.out.println("file NOT found (FNF)");
	}
	
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		System.out.println(WELCOME_PROMPT);
		lockedMe menu= new lockedMe();
		menu.showprimarymenu();
	}

}
