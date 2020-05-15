package May1exception;

public class ExceptionsThrowsKeyword{
	public static void main(String[] args) {
		
		//method chain
		ExceptionsThrowsKeyword obj=new ExceptionsThrowsKeyword();
		obj.sum();
		//if you throw till main methodgormuyr bundan sonra program duruyr
		System.out.println("happy ending!!  ");
		
	}
	void sum() {
		try {
			div();
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			
//		}catch(Exception e) { her ihtimale karsi bunu ekledik aritmetic olmazsa
//			e.printStackTrace();
		}
	}
	
	void div() throws ArithmeticException{
		int a=9/0;
}
	
}