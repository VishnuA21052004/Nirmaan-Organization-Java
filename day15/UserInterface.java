package day15;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int firstNum=sc.nextInt();
	    int secondNum=sc.nextInt();
		System.out.println("Addition");
		System.out.println(cal.add(firstNum,secondNum));
		System.out.println("Subtraction");
		System.out.println(cal.sub(firstNum,secondNum));
		System.out.println("Multiplication");
		System.out.println(cal.mul(firstNum,secondNum));
		System.out.println("division");
		System.out.println(cal.div(firstNum,secondNum));
		
		
	}
		
	}

