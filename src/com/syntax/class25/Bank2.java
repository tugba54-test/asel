package com.syntax.class25;
 interface Trustable1{
	void trust();
}
public interface  Bank2 extends Trustable1{
	void depositMoney();
	void WithDraw();
	

}
class PNC extends Finance implements Bank2{

	@Override
	public void depositMoney() {
		System.out.println("PNC can deposit your money");
		
	}

	@Override
	public void WithDraw() {
		System.out.println("PNC can withdraw");
		
	}

	@Override
	public void trust() {
		System.out.println("PNC can trustable bank");
		
	}}

interface CreditUnion{
	void GiveCredit();
}
class BOA extends Finance1 implements Bank2,CreditUnion{

	@Override
	public void depositMoney() {
		System.out.println("BOA can deposit your moeny");		
	}

	@Override
	public void WithDraw() {
		System.out.println("BOA can withdraw");		
	}

	@Override
	public void trust() {
		System.out.println("BOA can trustable bank");		
	}

	@Override
	public void GiveCredit() {
System.out.println("BOA give Credit");		
	}
	
}
 class Finance1{
	void financialTransactions() {
		System.out.println("you can make financial transactions ");
	}
}
	
	


