package logicaloperators;

import java.util.Scanner;

public class rReply {

	public static void main(String[] args) {
		/*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade. */
		Scanner scan=new Scanner(System.in);
		int mark;
		String score;
		
		System.out.println("Please enter your mark");
		mark=scan.nextInt();
		
		if(mark>=1 && mark<=25) {
			score="F";
		}else if(mark>25 && mark<=45){
				score="E";
			}else if(mark>45 && mark<=50) {
				score="D";
			}else if (mark>50 && mark<=60) {
				score="C";
			}else if(mark>60 && mark<=80) {
				score="B";
			}else if(mark>80 ) {
				score="A";
			}
			
			System.out.println("your grade is "+score);
	
}else  {
			System.out.println("Please enter valid mark");
		}
	
}
}