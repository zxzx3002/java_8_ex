package com.heejin.s3;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car();
		c.info();
		
		Car c2 = new Car("black","Audi");
		c2.info();
	}
}
