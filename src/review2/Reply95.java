package review2;

public class Reply95 {

	public static void main(String[] args) {
		// Create a String given="Hello Syntax friends". 
//		Using String methods from given String create new String "Welcome Syntax family"
//
//		Expected Output:
//		Welcome Syntax family
		
		String given="Hello Syntax friends";
		String partial=given.substring(6);
System.out.println(partial);
String s=given.replace("Hello","Welcome");
String str=s.replace("friends", "family");
System.out.println(str);
	}

}
