package pac;

public class StringHandling {

	public static void main(String[] args) {
		String myTool="Selenium";
		String[] myTools= {"Selenium", "UFT", "Loadruneer"};
		for (String tool:myTools) {
			System.out.println(tool);
		}
		// concatination 
		String str1="Vaseem";
		String str2="Kavya";
		System.out.println(str1+str2);
		System.out.println(1+1+str1+5+"Testing");
		String str3="VASEEM";
		String str4="vaseem";
		String str5="Vaseem";
		String str6="VASEEM";
		//String comparison using == operator 
		System.out.println(str1==str2);
		System.out.println(str1.equals(str4));
		System.out.println(str1.compareTo(str3));
	}
}
