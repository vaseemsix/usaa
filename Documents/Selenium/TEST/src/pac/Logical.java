package pac;

public class Logical {

	public static void main(String[] args) {
		boolean a=true, b=false;
		System.out.println((a&&b));
		int c=100, d=20,e=300;
		if(!(c>d)&&(c>e)) {
			System.out.println("c is a big number");
		}
		else {
			System.out.println("c is not a big number");
		}
	}
}
