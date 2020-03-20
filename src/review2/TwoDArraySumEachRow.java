package review2;

public class TwoDArraySumEachRow {

	public static void main(String[] args) {
		// We need 3 array
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 67}, { 3, 4, 8, 5 } };
		int []sum=new int[num.length];
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length; col++) {
				int element=num[row][col];
				sum[row]+=element;
			}
		}//lets iterate the sum array
         for(int element:sum) {
        	 System.out.println("Sum is  "+element);
         }
	}

}
