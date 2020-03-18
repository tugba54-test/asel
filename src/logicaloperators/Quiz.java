package logicaloperators;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if( f == d ) {
		   if( f == i ) {
		      System.out.println("f, d and i are equal");
		    } else {
		      System.out.println("f, d are equal but i is not equal");
		    }

		} else {
		    System.out.println("f and d are not equal");
		}
		char direction = 'N';
		char west = 'W';

		switch(direction)
		{
		case 'N':
		System.out.println("North");
		break;
		case 'E':
		System.out.println("East");
		break;
		case west:
		System.out.println("West");
		break;
		case 'S':
			System.out.println("South");

	}

}
