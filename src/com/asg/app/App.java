package com.asg.app;

public class App {
	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.calculate(50, 5, 12));
	}
	
	public double calculate(double deposits,double interestRate,int month) {
		double total = 0;
		float rate = (float) (interestRate / 100);
		for(int i = 1; i <= month; i++) {
			total = (total + deposits) * (1 + rate);
		}
		return total;
	}
}
