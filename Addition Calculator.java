/* simple addition calculator. Its my first java program and i know its simple so dont
judge */


// Import Scanner

import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner Ian = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = Ian.nextDouble();
		System.out.println("Enter second number: ");
		snum = Ian.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}	
}
