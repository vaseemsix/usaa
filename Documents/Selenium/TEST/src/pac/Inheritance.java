//Inheritance is the process of re-using methods and variables from one class to another class
//Inherited class can be called as super class 
//the class to which we are inheriting is called sub class
//Inheritance  between a super class and sub class can be achieved with the keyword extends .
//non-static classes can only inherited
//how to create static class member ?
// using static non-access modifier
// how to access static class members ?
//Using class name we can access static class members
//how to access non static class members ?
//using object/instance we can access non static class members
package pac;

public class Inheritance extends Class1 {
	public static void main(String[] args) {
		System.out.println(Class1.add("Vaseem", "KAVYA"));
	}
}
