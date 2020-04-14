package com.syntax.class25;

public interface Bank {
	void CheckingAccount();
	void Savings();
}
interface Trustable{
	void trust();
}
class Finance{
	void financing() {
		System.out.println("financial transaction must happen");
	}
}
class BOA1 extends Finance implements Bank,Trustable{

	@Override
	public void CheckingAccount() {
		System.out.println("BOA has checking accaount");
		
	}

	@Override
	public void Savings() {
      System.out.println("BOA has saving  accaount");		
	}

	@Override
	public void trust() {
    System.out.println("you can trust BOA with your money");		
	}
	
}
class CapitalOne implements Bank,Trustable{

	@Override
	public void CheckingAccount() {
		System.out.println("CapitalOne has checking accaount");
		
	}

	@Override
	public void Savings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		
	}}