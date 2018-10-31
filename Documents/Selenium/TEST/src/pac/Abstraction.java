//it is a process of hiding implementation and showing only functionality is abstraction 
// 
package pac;

public abstract class Abstraction {
	public abstract int add(int a, int b);
	public int multiply(int a, int b) {
		int c=a*b;
		return c;
	}

}
