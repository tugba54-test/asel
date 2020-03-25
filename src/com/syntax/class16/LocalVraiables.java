package com.syntax.class16;

public class LocalVraiables {
	void nameInside() {
		String name="John";
		
	}
	void anothrName() {
	public static void main(String[] args) {
		//System.out.println(name);CE name wont be visible to another method
		//since its scope only within nameInside method
		LocalVraiables obj=new LocalVraiables();
		obj.nameInside();
		
		
		boolean flag=true;
		if (flag) {
			String answer="yes";
		}
		//System.out.println(answer);CE: scope of variable answer is not visible outside of
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		String name="Gulbahar";
	}

}
