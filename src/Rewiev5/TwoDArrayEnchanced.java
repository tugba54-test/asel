package Rewiev5;

public class TwoDArrayEnchanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 67}, { 3, 4, 8, 5 } };
		int sum=0;
		//iterating rows of 2d arry
		for(int[] row:num) {
			//iterating elements of a row
			for(int element:row)
			{System.out.print(element+" ");
			sum+=element;
		}
		

	}
		System.out.println("the sum is = "+sum);
	}
}
