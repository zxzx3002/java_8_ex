package com.heejin.s2;

public class Shef_Source {
	public Food_Source makeSource(int select) {
		Food_Source source=new Food_Source();
		switch(select) {
		case 1:
			source.oilName="Olive";
			source.spiceName="Hub";
			break;
		case 2:
			source.oilName="Milk";
			source.spiceName="Cheese";
			break;	
		default:
			break;
		}
		
		/*Food_Source source = new Food_Source();
		source.oilName="Olive";
		source.spiceName="hub";*/
		
		return source;
	}
}
