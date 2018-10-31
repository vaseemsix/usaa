package pac;

import java.lang.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int result= a/b;
			System.out.println(result);
		} 
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.print(a);
		
		int abc[]= new int[4];
		try{
			abc[30]=40;
			System.out.println(abc[30]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}
}
