package pac;

public class ClassA {
	private int a=10;
	private int b=100;
	protected int add() {
		int c=a+b;
		return c;
	}
	public void multiply() {
		int c=a*b;
	}
	public static void message(String str1, String str2) {
		System.out.println("This is a static with no return type parent class method"+ str1+str2);
	}

}
