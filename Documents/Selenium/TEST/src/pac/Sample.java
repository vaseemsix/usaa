package pac;
//Calling methods of different class in a differnt class 
public class Sample {

	public static void main(String[] args) {
		Methods object=new Methods();
		System.out.println(object.addition(10, 20));
		System.out.println(object.multiply(20,20));
		object.employee(10000);
		object.studentRank(600);
	}
	
}
