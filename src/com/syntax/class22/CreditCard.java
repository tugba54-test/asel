package com.syntax.class22;

public class CreditCard {
	int balance;
	double interest;
	CreditCard(int balance){
		this.balance=balance;
		
	}
	void interest(double interestrate) {
		
		
		if(balance>500) {
			interest+=balance*interestrate;
		}else {
			interest+=0;
		}System.out.println(interest);
	}

}
class Visa extends CreditCard{
	Visa(int balance){
		super(balance);
		
	}
	void interest(double interestrte) {
		
		
		if(balance>500) {
			interest+=balance*interestrte;
		}else {
			interest+=0;
		}System.out.println(interest);
	}}


class Ax extends CreditCard{
	Ax(int balance){
		super(balance);
		
	}
	
	void interest(double interestrte) {
		
		if(balance>500) {
			interest+=balance*interestrte;
		}else {
			interest+=0;
		}System.out.println(interest);
	}}

	


	

