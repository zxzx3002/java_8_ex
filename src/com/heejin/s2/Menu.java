package com.heejin.s2;

import java.util.Scanner;

public class Menu {
	public void order() {
		Shef_Pasta pasta = new Shef_Pasta();
		Shef_Steak stake = new Shef_Steak();
		Bill bill = new Bill();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");
		int select = sc.nextInt();
		Food_Steak st=null;
		Food_Pasta ps=null;
		if(select<4) {
			st=stake.makeSteak(select);
			bill.billSteak(st);
			
		}else {
			ps=pasta.makePasta(select-3);
			bill.billPasta(ps);
		}
		/*switch(select) {
		case 1:
			st =stake.makeSteak(1);
			System.out.println(st.name);
			System.out.println(st.price);
			System.out.println(st.source.oilName);
			System.out.println(st.source.spiceName);
			break;
		case 2:
			st =stake.makeSteak(2);
			System.out.println(st.name);
			System.out.println(st.price);
			System.out.println(st.source.oilName);
			System.out.println(st.source.spiceName);
			break;
		case 3:
			st =stake.makeSteak(3);
			System.out.println(st.name);
			System.out.println(st.price);
			System.out.println(st.source.oilName);
			System.out.println(st.source.spiceName);
			break;
		case 4:
			ps =pasta.makePasta(1);
			System.out.println(ps.name);
			System.out.println(ps.price);
			System.out.println(ps.source.oilName);
			System.out.println(ps.source.spiceName);
			break;
		case 5:
			ps =pasta.makePasta(2);
			System.out.println(ps.name);
			System.out.println(ps.price);
			System.out.println(ps.source.oilName);
			System.out.println(ps.source.spiceName);
			break;
		case 6:
			ps =pasta.makePasta(3);
			System.out.println(ps.name);
			System.out.println(ps.price);
			System.out.println(ps.source.oilName);
			System.out.println(ps.source.spiceName);
			break;
		}*/
	}
}
