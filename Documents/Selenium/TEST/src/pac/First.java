// Documents you can list anything which you want to tell about the program and its functions

package pac;

import java.io.Console;
import java.lang.*;

public class First {
// Method declaration or creating a method will be before main method in the class
	public int multiply(int a, int b, int c){
		int result= a*b*c;
		return result;
	}
	public static void main (String[] args) { // it will be used inside the class so that our code in the class can be executed from main class
	
	System.out.println("Hello Selenium");
	int a= 10, b=30;// variable declaration and initialization 
	//double  d=10.3;
	final int money=100;
	System.out.println("addition of a+b is "+(a+b));
	System.out.println(money);// 100 is the output
	System.out.println(b);// directly prints the declared value
	if (a>b) {// condition block
		System.out.println("a is a greater number than b");
	}
	else {
		System.out.println("b is greater than a");
	}
	// loop block 
	for (int i=0; i<=10; i++) {
		System.out.println(i);
	}
	//create object and access methods
	First obj=new First();
	int x=obj.multiply(10, 10, 10);
	System.out.println(x);
}
}