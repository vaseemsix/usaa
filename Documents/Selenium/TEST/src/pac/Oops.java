//Abstraction: Showing functionality and hiding the implementation.
// Two type of methods in java
// 1. Concrete methods : methods whioch are having body
//example : public void add(){
//......
//}
//2. Abstract methods: which are not having body
// Example: public void add();


package pac;

public abstract class Oops {

	public abstract void add();
	public abstract int multiply();
	public String addition(String s) {
		s="Addition";
		return s;
	}
}
