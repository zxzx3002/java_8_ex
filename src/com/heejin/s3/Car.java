package com.heejin.s3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		//default , 기본, 빈 , 생성자
		this("Red");//자신의 또다른 생성자를 호출
	}
	public Car(String color) {
		this(color,"Audi");
	}
	public Car(String color,String brand) {
		/*this.color=color;
		this.brand=brand;
		cc=3000;*/
		this(color,brand,3000);
	}
	public Car(String color,String brand, int cc) {
		this.color=color;
		this.brand=brand;
		this.cc=cc;
	}
	public void make() {
		System.out.println("자동차제작완료");
	}
	public void info() {
		System.out.println("Color : " + color);
		System.out.println("Brand : " + brand);
		System.out.println("cc : " + cc);
		this.make();
	}
}
