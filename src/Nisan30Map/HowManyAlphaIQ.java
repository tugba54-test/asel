package Nisan30Map;

public class HowManyAlphaIQ {

	public static void main(String[] args) {

		String str="he123@#l%1l 45#$%^&0o@@#";
		str=str.replaceAll("[^A-Za-z]", "");
		System.out.println(str);
		System.out.println(str.length());
		//why i have^ isaret
	}

}
