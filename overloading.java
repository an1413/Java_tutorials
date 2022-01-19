package org.opentutorials.javatutorials.Inheritance;

public class overloading extends Calculator {
	void A () {System.out.println("void A()");}
	void A (int arg1) {System.out.println("void A (int arg1)");}
	void A (String name) {System.out.println("void A (String arg1)");}
	//int A (){System.out.println("void A()");}
	public static void main(String[] args) {
		overloading od = new overloading();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.Oprands(10, 20);
		od.sum();
	}
}
