package com.project;
import java.util.Scanner;

import org.simplilearn.lockme.FileOperations;

import java.io.File;
import java.io.IOException;

public class Samplefile {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int ch = 0;
		//	String fileName = null;
			
			FileOperations fs = new FileOperations();
			
			//String file3= null;
			 String loc = "C\\Navin";
					
			Scanner sc = new Scanner(System.in);  
			
			do {
				System.out.println("Select File Options");
				System.out.println("1.Adding File");
				System.out.println("2.Display Files");
				System.out.println("3.Delete File");
				System.out.println("4.Search File");
				System.out.println("5.Sort File");
				System.out.println("6.Exit");
				System.out.println("Enter Option :");
				
				ch = sc.nextInt();
				switch(ch) {
				
				case 1:
					
					System.out.println("Enter file name for new file:");
					
			        String fileName=sc.next();
					fs.addFile(fileName,loc);
					 
					break;
					
				case 2:
					
			    
				    String filesAll[]=fs.getFiles(loc);
					System.out.println("The files available in directory :");
					for(String name:filesAll) {
						System.out.println(name);
					}
			    
				
				
					
					break;  
				
				case 3:
					System.out.println("Enter the file to delete");
					String fileName1 = sc.next();
					System.out.print(fileName1);
					fs.deleteFile(fileName1, loc);
					break;
				
				case 4:
					System.out.println("Enter file name to search :");
					String fileName2 = sc.next();
					if(fs.search( fileName2, loc)) {
						System.out.println("File found in directory\n");
					}
					else {
						System.out.println("There is no file available on this name");
					}
					break;
					
				case 5:
					String[] files1 = fs.getFiles(loc);
					String sortFiles[] = fs.sort(files1);
					System.out.println("Files are sorted");
					for(String file: sortFiles) {
						System.out.println(file);
					}
					break;
					
				case 6:
					System.out.println("Thank you user");
					break;
					
				default :
					System.out.println("Entered wrong option :");
					break;
				}
				
				System.out.println("Do you want to continue Type('Y' or 'N')");
				ch = sc.next().charAt(0);
				
			} while(ch == 'Y' || ch == 'y');
			
			
		}

	}
}
