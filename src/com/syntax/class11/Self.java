package com.syntax.class11;

public class Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {
				{1,2,3,4,5},
				{6,7,8,9},
				{10,11,12,13}
		};
		int count=0;
		for(int[] num:numbers) {
			for(int n:num) {
				count++;
				System.out.print(n+" ");
				
			}System.out.println();
			
		}System.out.println("count = "+count);
		
		System.out.println("cevap");
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
//		for(int i = 0; i <= 5; i++ ) {
//			   System.out.println("i = " + i );
//			}
//
//			System.out.println("i after the loop = " + i );}
		   for(int i = 0; i <= 5; i++ )
	        {
	            System.out.println("i = " + i );
	        }
		   int k=3, tot=0;

		   do{

		      tot=tot+k;

		      k++;

		   } while(k<11);

		   System.out.println(tot);
		   int x=1;

		   do{

		      x++;

		      System.out.println(x);

		   }while(x<5);
		   int z=2, sum=0;

		   while(z<9) {

		      z++;

		      sum=sum+z;

		   }

		   System.out.println(sum);
		   int m=2, total=0;

		   while(m<6) {

		      total=total+m;

		      m++;

		   }

		   System.out.print(total);
	}

}
