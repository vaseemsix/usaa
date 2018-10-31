package pac;

public class FlowControl {

	public static void main(String[] args) {
		int a, b, d;
		a=50; b=20; d=30;
		
		if(a>b) {
			System.out.println("A is a big number");
		}
		else {
			System.out.println("B is greater than A");
		}
		if((a>b) || (b>a)) {
			System.out.println("it is possible");
		}
		int c;
		c=1000;
		if ((c>=1) && (c<=100)) {
			System.out.println("C is in between 1-100 value");
		}
		else if((c>=101) && (c<=1000)) {
			System.out.println("C is in between 101-1000");
		}
		else if((c>=1001) && (c<=10000)) {
			System.out.println("C is in the range of 1001-10000");
		}
		else if(c>100001) {
			System.out.println("C range is out of 10000 ");
		}
		else {
			System.out.println("C is Either 0 or -ve number");
		}
		
		if (a>b) {
			if (a>c){
				if(a>10000) {
				System.out.println("A is greater than 10000");
			}
			else {
				System.out.println("A is not greater than b and c");
			}
		}
			else{
				System.out.println("A is -ve number");
			}
	}
		
		// Using Else if Statement
		if ((a>b)&&(a>c)&&(a>d)) {
			System.out.println("A is greater than a and c");
		}
		else if ((b>a)&&(b>c)&&(b>d)) {
			System.out.println("B is greater number");
		}
		else if((c>a)&&(c>b)&&(c>d)) {
			System.out.println("C is greater number than a and b");
		}
		else {
			System.out.println("D is greater number than a and b");
		}
		
		//Using Switch 
		char grade='d';
		
		switch(grade) {
		
		case 'a':
			System.out.println("Execelent");
			break;
		case 'b':
			System.out.println("Good");
			break;
		case 'c':
		System.out.println("Average");
		default:
			System.out.println("Failed");
		}
		//Loop Statements , Java Loop Statements 
		// for loop
		// while loop
		// do while loop
		// Enhanced for loop  Syntax of for loop : it repeats a block of statements for a specified or defined number of times:
		/* for (startValue; endValue; increment/decrement){
		}*/
		
		// Print 1 to 10 numbers
		 for (int i=0; i<=10; i++) {
			 System.out.println(i);
		 }
		for(int i=10; i>=0; i--) {
			 System.out.print(i);
		}
		for(int i=1; i<=10; i++) {
			if((i!=7) && (i!=4)) {
				System.out.println(i);
			}
		}
		
		// While Loop : It repeats a block of statement while condition is true.
		/* Syntax: Initialization  
		 * while (condition){
		 * statements 
		 * increment/decrement
		 * }*/
		int h=10;
		while (h>=1) {
			System.out.println(h);
			h++;
		}
	}
}
