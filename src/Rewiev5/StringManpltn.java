package Rewiev5;

public class StringManpltn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		// str not changed-equalsIgnoreCase
		System.out.println(str.toLowerCase());
		//startsWith---endsWith
		boolean starts;

		//method chaining
		starts=str.toLowerCase().startsWith("He");
		System.out.println(starts);
				//5.karakter
		char fiveletter=str.charAt(4);
		System.out.println(fiveletter);
		
		String reverse = "";
		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
			reverse += charArray[i];
		}

		System.out.println("reverse is ->" + reverse);
		//indexOf  bulamzsa, ayni sekilde bitmemisse -1 e gidiyr out of charcter
		int index = str.indexOf("llo");
		System.out.println(index);
		
		String example = "Something inside here";
		int index2 = example.indexOf("e", 19);//find e start with 19
		System.out.println(index2);
	}

	}


