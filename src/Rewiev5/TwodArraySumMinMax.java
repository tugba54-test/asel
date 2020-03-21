package Rewiev5;

public class TwodArraySumMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numara = { { 120, 0, 6, -6}, {100, 6, 2, 67}, { 3, 4, 8, 5 } };
		int rows = numara.length;
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < numara[row].length; col++) {
				int element = numara[row][col];
				System.out.print(element + " ");
			}}
		System.out.println();
		int smallest;
		int largest =numara [0][0],slarge =numara[0][0], smallest = numara[0][0];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < numara[row].length; col++) {
				if(numara[row][col]<smallest) {
					smallest=numara[row][col];
					
				} else if(numara[row][col]>largest) {
					largest=numara[row][col];
					
				}else if(numara[row][col]>slarge) {
					slarge=numara[row][col];
				}
					
				}
			}System.out.println("smallest " +smallest);
			System.out.println("largest "+largest);
			System.out.println("second largest ="+slarge);
	}

}
