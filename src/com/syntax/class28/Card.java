package com.syntax.class28;

public abstract class Card {
//	Create a Card class that will have implemented and 
//	unimplemented methods and a constructor thatwill initializes credit card type. 
//	Create 3 subclasses of a Card card. 
//	Create 3 objects of different card and store them into LinkedList.
//	Using for loop/advanced for loop/ iterator access all methods of the class.
	String cardtype;


	double credit;
	Card(String cardtype,double credit){
		this.cardtype=cardtype;
        this.credit=credit;
	}
	abstract void getscore();
	abstract void balance();
	abstract void annualFee();

}
class MasterCard extends Card{

double credit;
	MasterCard(String cardtype,double credit) {
		super(cardtype,credit);
		}

	@Override
	void getscore() {
		double score;
		if(credit >4000) {
			score=(credit/12)*0.20;
		}else {
			score=(credit/12)*0.10;
		}System.out.println("your credit score is "+score);

	}

	@Override
	void balance() {
		
System.out.println("your balance is 1500"+cardtype);		
	}

	@Override
	void annualFee() {

double fee;	
if(credit >5000 ) {
	fee= (credit*0.10);
}else {
	fee=credit*0.05;
}
System.out.println("your annual fee "+fee+" "+cardtype);

	}
	
}
class Visa extends Card{

	Visa(String cardtype,double credit) {
		super(cardtype,credit);
	}

	@Override
	void getscore() {
		double score;
		if(credit >3000) {
			score=(credit/12)*0.15;
		}else {
			score=(credit/12)*0.05;
		}System.out.println("your credit score is "+score);
		
	}

	@Override
	void balance() {
		System.out.println("your balance is 3000"+cardtype);		
		
	}

	@Override
	void annualFee() {
		double fee;	
		if(credit >5000 ) {
			fee= (credit*0.07);
		}else {
			fee=credit*0.04;
		}
		System.out.println("your annual fee "+fee+" "+cardtype);

			}		
	}
	

class AmericanExpress extends Card{

	AmericanExpress(String cardtype,double credit) {
		super(cardtype,credit);
	}

	@Override
	void getscore() {
		double score;
		if(credit >5000) {
			score=(credit/12)*0.18;
		}else {
			score=(credit/12)*0.10;
		}System.out.println("your credit score is "+score);
		
	}

	@Override
	void balance() {
		System.out.println("your balance is 5000"+cardtype);		
		
	}

	@Override
	void annualFee() {
		double fee;	
		if(credit >4000 ) {
			fee= (credit*0.08);
		}else {
			fee=credit*0.04;
		}
		System.out.println("your annual fee "+fee+" "+cardtype);

			}		
	}
	
