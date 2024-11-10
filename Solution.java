package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		System.out.println("WELCOME TO CALCULATOR PROJECT");
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in);
 
		
		//UPCASTING TO ACHIEVE ABSTACTION
		Calculator cal = new CalculatorImpl();

		//MENU DRIVEN PROGRAM
		while(true) {
			System.out.println("1:Addition\n2:Subtraction");
			System.out.println("3:Multiplication\n4:Division");
			System.out.println("5:Exit\nEnter choice");
			 
			int choice = sc.nextInt();

			//local variables does not have default values
			//so initializing to zero

			int x =0;
			int y =0;
			 
			if(choice>=1 && choice<=4) {
				System.out.println("Enter 2 Numbers");
				x = sc.nextInt();
				y = sc.nextInt();
			}

			switch(choice) {//INFINITE LOOP
			case 1:
				
				System.out.println("sum of "+x+" and "+y+" is "+cal.add(x, y));
				break;
			case 2 :

				System.out.println("subtraction of "+x+" and "+y+" is "+ cal.sub(x, y));
				break;			 
			case 3:

				System.out.println("multiplication of "+x+" and "+y+" is "+cal.mul(x, y));
				break;		
			case 4:
				System.out.println("division of "+x+" and "+y+" is "+cal.div(x, y));
				break;	
			case 5:
				System.out.println("THANK YOU!!!");
				System.exit(100);
			default:
				System.out.println("invalid choice");
			}//END OF SWITCH STATEMENT
			System.out.println("---------------");
		}//END OF WHILE LOPP
	}//END OF MAIN METHOD
}//END OF CLASS
