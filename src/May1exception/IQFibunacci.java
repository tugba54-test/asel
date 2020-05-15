package May1exception;

public class IQFibunacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.print(sum+"  ");
			sum=a+b;
			b=a;
			a=sum;
		}

	}

}
