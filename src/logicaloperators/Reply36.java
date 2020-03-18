package logicaloperators;

import java.util.Scanner;

public class Reply36 {

	public static void main(String[] args) {
		/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
*/
		Scanner input=new Scanner(System.in);
		String output = null;
		System.out.println("Please enter two strings");
		String word1=input.nextLine();
		String word2=input.nextLine();
		System.out.println("Please enter two integers");
		int int1=input.nextInt();
		int int2=input.nextInt();
		
		if(int1==int2 && word1.contentEquals(word2)) {
			output="AND";
		}else if(int1==int2 || word1.contentEquals(word2)){
			output="OR";
			
		}else if(!(int1==int2) && !word1.contentEquals(word2)) {
			output="NONE";
		}
          System.out.println(output);
	}

}
