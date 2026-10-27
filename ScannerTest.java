package AlfizaPakage;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String args[])throws Exception {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your rollno and name:");
			int rollno=sc.nextInt();
			String name=sc.next();
			System.out.println("Rollno:"+rollno+"\tName:"+name);
			sc.close();
		
		

	}

}
