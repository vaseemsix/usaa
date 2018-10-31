package pac;

public interface Interface1 {
public void bike(int a, int b);
public void engine(String str1, String str2);
public void color(char color);
public static void main(String[] args) {
	InterfacClass obj=new InterfacClass();
	obj.bike(10, 10);
	obj.color('B');
	obj.engine("Vaseem", "Kavya");
}
// NOTE: from class(concrete class or abstract class) to class we can use extends keyword 
}
