package pac;

public class ClassB extends ClassA{
	int a=-1;
	int b=-2;
	public int substraction() {
		int c=a-b;
		return c;
	}
	public static void main(String[] args) {
		ClassA.message("Selenium", "Automation");
		ClassA obj=new ClassA();
		//System.out.println(obj.a);
		System.out.println(obj.add());
		ClassB obj1=new ClassB();
		//System.out.println(obj.a);
		//System.out.println(obj.b);
		//System.out.println(obj1.substraction());
	
	}
}
