package May1exception;

public class ExceptionThrowKeyword  {

	public static void main(String[] args) {
		// try varsa -->either catch(you can have multiple catches) or 
		//finally(sadece bir tane finally yazabilirsin)
		int age = 6;
		if (age < 5) {
			try {
				throw new ArithmeticException("age to play more");// kendimiz olustrmusz
			} catch (Exception a) {
				System.out.println("this is a home made exception ");
			}finally {
				System.out.println("this block is executed either-way");
			}
		} else {
			System.out.println("welcome to school");
		}
		
		
	}

}
