package com.project;

import java.io.File;

public class MenuFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void addFile(String fileName,String path)   {
			
			/*	File file = new File(fileName,path);
		          try {
					
					if(file.createNewFile()) {
						System.out.println("File created successfully :");
					}
					else {
						System.out.println("File not created :");
					}
				} catch(IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   */
				
				
					try {
						File f=new File(fileName, path);
						if(!f.exists()) {
							f.createNewFile();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			
				
			  
			
			public String[] getFiles(String path) {
			
				String files[]=null;
				try {
				File f = new File(path);
				files = f.list();
			   }
				 catch(Exception e) {
				  e.printStackTrace();
			  }
				
				return files;	
							
				
			  }   
			
			
			public void deleteFile(
					String fileName, String path) {
				File file = new File(fileName, path);
				String listFile[]= file.list();
				
			/*	int flag = 0;
				if(listFile == null) {
					System.out.println("There is no file present in directory");
				}
				else {
					for(int i = 0; i < listFile.length; i++) {
						String delFile = listFile[i];
						if(delFile.equalsIgnoreCase(fileName)){
							File f = new File(delFile,path);
							if(f.delete()) {
								System.out.println("FileDeleted successfully :");
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
				}   */
				boolean b = file.delete();
				if(b) {
					System.out.println("File deleted");
				}
				else {
					System.out.println("File not");
				}
				
			}
			
			public String[] sort(String fileName[]) {
				for(int i=0; i<fileName.length-1; i++) {
					for(int j = i+1; j<fileName.length-1; j++) {
						if(fileName[i].compareTo(fileName[j]) > 0) {
							String temp = fileName[i];
							fileName[i] = fileName[j];
							fileName[j] = temp;
						}
					}
				}
				return fileName;
			}
			
			public boolean search(String fileName, String path) {
				
				String files[]= getFiles(path); 
				boolean isFound = false;
				for(int i = 0; i < files.length; i++) {
					if(files[i].equals(fileName)) {
						isFound = true;
					}
				}
				return isFound;
			}

		}
	}

}
