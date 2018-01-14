package Testingmaven.testmaven;


import java.io.File;

public class Scanningfile {

	public static void main(String[] args) {


	
		File scandir = new File("C:/Users/SHIVA/Documents/testmaven/src/test/Testdata");
		String[] str = scandir.list();
		
		System.out.println(scandir.getAbsolutePath());
	
		System.out.println("List of files in the directory ...");
		for (String string:str)
		{
			System.out.println(string);
					
			
		}
	}
		
		
	}


