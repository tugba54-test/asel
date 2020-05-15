package May1exception;

public class Exception123 {

	public static void main(String[] args) throws InterruptedException {
		/*  some event occurs when we executed the program
		 * runtime
		 *why do we have--->1-Wrong data 2-dolu program
		 * 
		 * 
		 * 
		 * 
		 */
		
		//uncought exceptions-unchecked-run time---we can not predict until the run program
		int a=10;int b=0;
		double div=a/b;//run ettigimizde exeption alirz
		
		//cought exceptions-checked
		Thread.sleep(2000);//problem var deal etmek icin exepcion yapmamiz gerekiyr
		//yada try and catch yapabilirz
		try {
		
		int i=9/0;
		
		}catch( ArithmeticException ae){//Exception ae-->en buyuk parent class----
			System.out.println("Division by zero is not allowed");
//			ae.getMessage();
//			ae.printStackTrace();
//			System.out.println("I am a catch blocksyso");
			
		}
		

	}

}
