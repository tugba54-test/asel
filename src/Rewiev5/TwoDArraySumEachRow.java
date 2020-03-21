package Rewiev5;

public class TwoDArraySumEachRow {

	public static void main(String[] args) {
		// We need 3 array
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 67}, { 3, 4, 8, 5 } };
		int []sum=new int[num.length];
		
		for(int i=0;i<num.length;i++) {
			for(int y=0;y<num[i].length; y++) {
				
				int element=num[i][y];
				sum[i]+=element;
			}}
		//lets iterate the sum array
		for(int element:sum) {
			System.out.println("sum is "+element);
		}}}
	
		
		
		
		
		
		
		
		
		
		
	


