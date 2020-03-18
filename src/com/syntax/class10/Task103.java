package com.syntax.class10;

public class Task103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries= {"Turkey","USA","Greek","Germany"};
		String capital = null;
//		for( String i:countries) {
//			if(i.equals("Turkey")){
//				capital="Ankara";
//			}else if(i.contentEquals("USA")) {
//				capital="Washington DC";
//			}else if(i.contentEquals("Greek")) {
//				capital="Atina";
//		}else if(i.contentEquals("Germany")) {
//			capital="Berlin";
//		}else  {
//			capital="invalid";
//		
//
//	}
//			System.out.println(i +" baskenti "+capital);
//		}
		for(int i=0;i<countries.length;i++) {
			switch (countries[i]) {
			case "Turkey":
				capital="Ankara";
				break;
			case "USA":
				capital="Washington DC";
				break;
			case "Greek":
				capital="Atina";
				break;
			case "Germany":
			capital="Berlin";
			break;
		default:
			capital="invalid";
		

	}
			System.out.println(i +" baskenti "+capital);
		}	
		}


	}

	
	

