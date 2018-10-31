/* What is method?
 * It is a block or group of statements to perform an operations is called method
 * User defined methods are of two types 1. Method without returning a value 2. method with returning a value
 * 1. Method without returning value: can be called two ways i.e you can call with invoking an object and without invoking an object */

package pac;

public class Methods {

	/* creating a methods
	 * Syntax: accessModifier returnType methodName(paramaters){
	 * ...........
	 * ........
	}
	 Calling the created should be with in the main method*/
	public int addition(int a, int b) {
		int c= a+b;
		return c;
	}
	
	public static int  multiply(int a, int b) {
		int c=a*b;
		return c;
	}
	/*Syntax for creating a method calling the method without object daatType VariableName=methodname()
	 * Sytnax for creating a method for non returning method by invoking an object
	 * accessModifier returnTypeNothing methodName(params){
	 * ...
	 * ....
	 * }
	 * */
	public void studentRank(int Marks) {
		if(Marks>=600) {
			System.out.println("Passed in Distinction");
		}
		else if (Marks<=500){
			System.out.println("Passed with RANK A");
		}
		else {
			System.out.println("Not passed");
		}
	}
	public void employee(long salary ) {
		if(salary==10000) {
			System.out.println("He belongs to Average salary family ");
		}
		else {
			System.out.println("Either he belongs to Non-emplyeed family or more than average salary");
		}
	}
	public static void main(String[] args) {
		/* Methods object=new Methods();
		 *  dataType variableName=object.methodName(paramaters)
		 * */
		Methods object=new Methods();
		int result= object.addition(10, 100);
		System.out.println(result);
		int x=multiply(10,20);
		System.out.println(x);
        object.studentRank(500);
        object.employee(100);
	}
}
