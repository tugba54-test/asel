package logicaloperators;

public class class006 {

	public static void main(String[] args) {
		int num=56790;
		// TODO Auto-generated method stub
		if(num>=1 && num<=10) {
			System.out.println("this number is small");
		}else if(num>=10 || num<=100) {
			System.out.println("this is a big number");
		}else if(num>=100 && num<=1000) {
			System.out.println("this is a large number");
		}else {
			System.out.println("number is super large");
		}

	}

}
