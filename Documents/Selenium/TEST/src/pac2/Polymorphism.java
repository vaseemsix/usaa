package pac2;

public class Polymorphism {

	public void comparingArray() {
		String[] array1= {"a","b","c","d","z","i"};	
		String[] array2= {"c","d","f","g","h","i"};
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(array1[i] == (array2[j])) {
				System.out.println(array2[j]);
				break;
				}
			}
		}
	}
	
	
	
public static void main(String[] args) {
	Polymorphism obj=new Polymorphism();
	obj.comparingArray();
}
	
}
