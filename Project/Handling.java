package assitedproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
	public class Handling 
	{
		   public static void main(String args[]) throws FileNotFoundException, IOException 
		   {
			   //To select a operation to perform
		        System.out.println("Please select one of the below operations");
		        System.out.println(" for writing mode: w ");
		        System.out.println(" for appending mode: a");
		        System.out.println(" for reading mode: r ");
		        Scanner in =new Scanner(System.in);
		        String s=in.nextLine();
		        if(s.equalsIgnoreCase("r"))
		        {
		            new FReading();
		        }
		        else if(s.equalsIgnoreCase("w")||s.equalsIgnoreCase("a"))
		        {
		            writingToFile(s);
		            
		            
		        }
		        else
		        {
		            System.out.println("You selected a wrong operation! Please choose correct operations ");
		        }  
		        in.close();
		    }
		   //Writing to the text file
		    public static void writingToFile(String s)
		    {
		        Scanner in=null;
		        try
		        {
		            String source = "";
		            File f=new File("file.txt");
		            
		            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		            FileWriter f0 =null;
		            if(s.equalsIgnoreCase("w"))
		            {
		                f0 = new FileWriter(f,false);
		                System.out.println("Caution: This will overwrite existing file! ");
		                System.out.println("To exit type 'no' ");
		                System.out.println("To continue please type 'yes' ");
		                in=new Scanner(System.in);
		                String s1=in.nextLine();
		                if(s1.equals("no"))
		                System.exit(0);
		                System.out.println("Write 'stop' when you finish writing file ");
		                f.delete();
		                f.createNewFile();
		                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
		                    f0.write(source + System.getProperty("line.separator")); 
		                }
		                in.close();
		            }
		            else
		            	//To append new text into existing file
		            {  
		            	f0 = new FileWriter(f,true);
		                System.out.println("Write 'stop' when you finish appending file ");
		                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
		                f0.append(source+ System.getProperty("line.separator"));
		                }
		            }
		            f0.close();
		        }
		        catch(Exception e){
		            System.out.println("Error : " );
		            e.printStackTrace();
		        }
		    }
		}
		class FReading {
		    public static String str="";
		    //To read the file
		    public FReading() 
		    {    
		        try
		        {
		            File f5=new File("file.txt");
		            if(! f5.exists())
		            f5.createNewFile();
		            FileReader fl=new FileReader(f5);
		            BufferedReader bf=new BufferedReader(fl);
		            //For reading till end
		            while((str=bf.readLine())!=null){
		                System.out.println(str);
		            }
		            fl.close();
		            }
		        catch(Exception e)
		        {
		            System.out.println("Error : " );
		            e.printStackTrace();
		        }
		    }
		}
