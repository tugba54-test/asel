package May1exception;

public class IQFactoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));//4*3*2*1-->factoriyel means

	}
	public static int fact(int n) {
		return (n>1)?(n*fact(n-1)):1;//1. step 5*fact(4)
		                             //2.step 4*fact(3)...
	}

}
