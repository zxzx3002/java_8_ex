package com.heejin.s2;

public class Food_Main {

	public static void main(String[] args) {
		/*Shef_Source s = new Shef_Source();
		//Food_Source source = s.makeSource(1);
		
		if(source!=null) {
			System.out.println(source.oilName);
			System.out.println(source.spiceName);
		}
		Shef_Steak steak = new Shef_Steak();
		Food_Steak st =steak.makeSteak(1);
		Shef_Pasta pasta = new Shef_Pasta();
		Food_Pasta pa = pasta.makePasta(2);
		if(steak!=null) {
			System.out.println(pa.name);
			System.out.println(pa.price);
			System.out.println(pa.source.oilName);
			System.out.println(pa.source.spiceName);
		}*/
		
		Menu me = new Menu();
		me.order();
		//pasta=steak <- 멤버변수는 같지만 타입이 다르기 때문에 X
		
		

	}

}
