package pac;

public class Class1 {
// creating static method with returning value
	public static  String add(String str1, String str2) {
		String str3=str1+str2;
		return str3;
	}
//creating non-static method with returning value;	
	public int multiply(int a, int b) {
		int c=a+b;
		return c;
	}
//Static method without returning  a value	
	public static void addition(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
//creating non static method without returning value	
	public void subtraction(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
}
