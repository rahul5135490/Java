package rahul;

import java.util.Scanner;

public class condition_if {



	public static void main(String[] args) {
	int pwd;
	System.out.println("Enter Password:");
	Scanner obj=new Scanner(System.in);
	pwd=obj.nextInt();
	if(pwd==2731)
	{
		System.out.println("My name is rahul");
	}
	else
	{
		System.out.println("Wrong  Password:");
	}
	}

}
