package org.opentutorials.javatutorials.Inheritance;

class Calculator{
	int left , right;
	
	public void Oprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class MultipleCalculator extends Calculator{
	public void Multiple(){
		System.out.println(this.left * this.right);
	}
	
}


public class example2 {

	public static void main(String[] args) {
		MultipleCalculator c1 = new MultipleCalculator();
		c1.Oprands(10,20);
		c1.sum();
		c1.Multiple();
	}

}
