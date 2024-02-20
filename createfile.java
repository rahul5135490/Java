package rahul;

import java.io.*;

public class createfile {

	public static void main(String[] args) {
		File f= new File("C:\\Users\\Admin\\Desktop\\java\\Rahul.xlsx");
	try {
		if(f.createNewFile())
		{
			System.out.println("File Success fully created");	
		}
		else
		{
			System.out.println("File already exists");	
		}
	
	}
	catch(IOException i)
	{
		
	}
	System.out.println("Exception handled");
	}

}
