package com.syntax.class25;
interface Trustable{
	void trust();
}
public interface  Bank2 extends Trustable{
	void depositMoney();
	void WithDraw();
	

}
class PNC extends Finance implements Bank2{

	@Override
	public void depositMoney() {
		System.out.println("PNC can deposit your moeny");
		
	}

	@Override
	public void WithDraw() {
		System.out.println("PNC can withdraw");
		
	}

	@Override
	public void trust() {
		System.out.println("PNC can trustable bank");
		
	}

	public void financialTransactions() {
		// TODO Auto-generated method stub
		
	}}
interface CreditUnion{
	void GiveCredit();
}
class BOA extends Finance implements Bank2,CreditUnion{

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
class Finance{
	void financialTransactions() {
		System.out.println("you can make financial transactions ");
	}
}
	
	


