package REply;

public class Reply91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a String given="I love Java classes at Syntax"
//				Retrieve 2 Strings from given String and print them 
//
//				Expected Output:
//				classes at Syntax
//				I love Java
		String name="I love Java classes at Syntax";
		String [] splittedSub = name.split("c");
		System.out.println(splittedSub.length);
		//Looping through the array to get all the values
		for (int i =splittedSub.length-1; i>=0 ; i++) {
			System.out.println(splittedSub[i]);
			}

	}

}
