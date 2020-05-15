package com.syntax.class12;

public class morestringfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Replace() FUNCTION----->");
		//REPLACE OLD VALUe with need value
		String me="I am a good tester";
				String newString=me.replace("a", "c");
				System.out.println(newString);
				//if it finds matching char sequence --> then replace
				me=me.replace("good", "great");
				System.out.println(me);
				
				//if it is not finding matching sequence --> not replace
				me=me.replace("Great", "Awesome");
				System.out.println(me);
				
				String car="I have a Toyota";
				car=car.replace("Toyota", "Lexus");
				System.out.println(car);
				
				String str3="Hello all students";
				str3=str3.replace(" ", "");
				System.out.println(str3);
		
				

		//syso("Replace all function");
		
		String str="Phone number is 1234567890";
		System.out.println(str);
		str=str.replace("[A-Za-z]", "");
		
		System.out.println(str);
		
		String str1="Hello12347*****&&&   !!!89";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]","");
		System.out.println(str1);
		
		String str2="Hello123^^^^&&&******";//bunlarin disndakileri cikart
		str2=str2.replaceAll("[^A-Za-z0-9]", "");// special karakerleri replace yapmak icin
		System.out.println(str2+"29");
		
		String str31="Hello all students";
		str31=str31.replace(" ", "");
		System.out.println(str31);
		
		String subject="Java";
		subject=subject.replace("a", "e").replace("J", "I").toUpperCase();
		System.out.println(subject);
		System.out.println(subject.replaceFirst("E", "g"));
		
		
	}

}
