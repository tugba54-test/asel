package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Card> card = new HashSet();
		card.add(new MasterCard("mastercard", 50000));
		card.add(new Visa("Visa", 70000));
		card.add(new AmericanExpress("AmericanExpress", 30000));

		Iterator<Card> c = card.iterator();
		while (c.hasNext()) {
			Card cd = c.next();
			cd.getscore();
			cd.balance();
			cd.annualFee();
		}
	}

}
