package pac2;

import pac.AbstarctionExtends;
import pac.ClassA;

public class ClassX {

	public static void main(String[] args) {
		ClassA.message("Vaseem", "KavyaSS");
		AbstarctionExtends objA=new AbstarctionExtends();
		System.out.println(objA.add(10, 10));
		ClassA obj=new ClassA();
		obj.multiply();
}
}
