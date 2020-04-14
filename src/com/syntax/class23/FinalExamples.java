package com.syntax.class23;

public class FinalExamples {
	static final String str ="I love java";
final void saysmth(String str) {
	this.str=str;
	System.out.println(str);
}
public static void main(String[] args) {
	FinalExamples obj=new FinalExamples();
	obj.saysmth("hi");
	obj.str();
}
}
