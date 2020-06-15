package Diego;

public class Satic extends diego1{
 public static diego1 obj1;
 public static Satic obj3=new Satic();
	public static void main(String[] args) {
		//obj1=new diego1();
		System.out.println(obj3);//hash code
		obj1=new diego1();
		System.out.println(diego1.name1);
		obj1.name="New Name";
		System.out.println(obj1.name);
		obj3.second();

	}
	public void second() {
		System.out.println(diego1.name1);
		obj1=new diego1();
		System.out.println(obj1.name);
	}

}
