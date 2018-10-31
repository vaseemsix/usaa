/*1) Input and Output Operations 2) File Handling in Java 3) Exception handling
 * 1) INput and out put Operations Three ways available for reading input 
 * 1) scanner 
 * 2) datainputstream 
 * 3) BufferReader
 * using java.util.scanner is the easier way to and it includes many methods to check input is valid or not 
 * */





package pac;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IoandFileHandling {

	public static void main(String[] args) throws IOException {
		/*Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name= scan.nextLine();
		System.out.println("Your name is "+ name);
		System.out.println("Enter you Girlfired name");
		String gfName=scan.nextLine();
		System.out.println("Her name is"+ gfName);
		
		System.out.println("Enter your mobile number");
		long mobNumber=scan.nextLong();
		System.out.println("your Mobile Number is"+ mobNumber);
		
		System.out.println("Enter Some charecter");
		char dob=scan.next().charAt(2);
		System.out.println(dob);
		System.out.println(dob);
		File Handling in java
		 * Using File class we can handle computer files
		 * 1. Create a folder
		 * 2. 
		 * */
		File fileobj= new File("/Users/novateur2017-2/Desktop/selenium");
		fileobj.mkdir();
		fileobj.delete();
		boolean a=fileobj.exists();
		if(a==true) {
			System.out.println("Selenium folder is exist on desktop");
		}
		else {
			System.out.println("selenium folder doesnt exist");
		}
		File xlsfile= new File("/Users/novateur2017-2/Desktop/selenium.xls");
		xlsfile.createNewFile();
		/*Exception handling in Java
		 * An exception is an event that occurs during the execution of a program when normal execution of the program is interrupted
		 * Exception  handling is mechanism to handle exception 
		 * Common Scenarios where exceptions may occurs
		 * 1. Scenario where Arithmetic exception occurs
		 * 2. Where nullPointer exception (if we have no value in any variable and performing any operation by the variable leads to nullpoint exception
		 * string s=null)
		 * String s=null;
		System.out.println(s.length());
		3. Scenario where NumberFOrmatException occurs
		the wrong formating of any value
		*4. Array index out of bound exception exception;
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		String s3=scan.nextLine();
		String s4=scan.nextLine();
		int d = Integer.parseInt(s3);
		int e= Integer.parseInt(s4);
		System.out.println(" two numbers addition is"+ (d+e));
	}
}
