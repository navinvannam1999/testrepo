package org.simplilearn.lockme;

import java.io.File;
import java.util.Scanner;
import java.io.*;

public class WelcomeScreen {
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename;
	    String path="D:\\Navin";
		char ch ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details :");
		String name = "Navin Vannam";
		String address = "Pune";
		String applName = "Prototype of file application";
		
		System.out.println("Developer name :"+name);
		System.out.println("Application : "+applName);
		System.out.println("Developer address : "+address);
		
	//	System.out.println(filename);
		File file = new File("D:\\Navin");
		if(file.mkdir() == true) {
			System.out.println("Created directory");
		}
		else {
			System.out.println("Directory not created");
		}
		 
		String []flist = file.list();
		
		
		
		System.out.println();
		do {
			System.out.println("Select File Options");
			System.out.println("1.Adding File");
			System.out.println("2.Display Files");
			System.out.println("3.Delete File");
			System.out.println("4.Search File");
			System.out.println("5.Exit");
			System.out.println("6.Exit");
			System.out.println("Select Option from the list :");
			
			int choice = sc.nextInt();
			switch(choice) {
			
			
			case 1:
				System.out.println("Enter the file name :");
				filename = sc.next();
				
				try {
					File file1 = new File("D:\\Navin",filename);
					if(file1.createNewFile()) {
						System.out.println("File created in directory :");	
					}
					else {
						if(file1.exists()) {
							System.out.println("Already exists");
						}
						else {
							System.out.println("File not exist");
						}
					}
					}
				catch(IOException e) {
					e.printStackTrace();
				}
				break;
				
				
			 case 2:
				System.out.println("List of files in directory :");
				File folder = new File("D:\\Navin");
				File[] listOfFiles = folder.listFiles();
				for(File f1:listOfFiles) {
					if(f1.isDirectory()) {
						System.out.println(f1.getName());
					}
					else if(f1.isFile()) {
						System.out.println(f1.getName());
					}
				}
				
				break;
				
				
			 case 3:
				System.out.println("Enter file for delete :");
				filename = sc.next();
				File delFile = new File("D:\\Navin");
				
				String []arrFile = delFile.list();
				int flag = 0;
				if(arrFile == null) {
					System.out.println("There is no file present in directory");
				}
				else {
					for(int i = 0; i < arrFile.length; i++) {
						String nameFile= arrFile[i];
						if(nameFile.equalsIgnoreCase(filename)){
							File f = new File("D:\\Navin",nameFile);
							if(f.delete()) {
								System.out.println("File Deleted successfully :");
							}
							else {
								System.out.println("File not deleted :");
							}
							flag = 1;
				}
				
		}
	}
				if(flag == 0) {
				System.out.println("File not found");
				}
				break;
				
				
			 case 4:
				System.out.println("Enter the file name for search");
				filename = sc.next();
				File sFile = new File("D:\\Navin");
				String[] serFile = sFile.list();
				int flag1 = 0;
				if(serFile == null) {
					System.out.println("There is no file :");
				}
				else {
					for(int i=0; i<serFile.length; i++) {
						String search = serFile[i];
						if(search.equalsIgnoreCase(filename)) {
							System.out.println(search+" Searching file found in directory :");
							flag1 = 1;
						}
					}
				}
				
				if(flag1 == 0) {
					System.out.println("File found :");
				}
				 break;
				
				
			  case 5:
				 
					System.out.println("Thank you user use again");
					break;
					
					 
			  default :
				  
				    System.out.println("Your input is incorrect");
				    break;
					}
			
			        System.out.println("Do you want to continue type(y or n)\n");
			        ch = sc.next().charAt(0);
			
				}while(ch == 'Y' || ch == 'y');

}

	
}