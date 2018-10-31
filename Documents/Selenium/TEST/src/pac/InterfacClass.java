package pac;

public class InterfacClass implements Interface1 {

	@Override
	public void bike(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void engine(String str1, String str2) {
		// TODO Auto-generated method stub
		System.out.println(str1+str2);
	}

	@Override
	public void color(char color) {
		// TODO Auto-generated method stub
		System.out.println("given char is" + color);
	}
public static void main(String[] args) {
	InterfacClass obj=new InterfacClass();
	obj.bike(45, 55);
	obj.color('c');
	obj.engine("Vaseem", "Kavya");
}
}
