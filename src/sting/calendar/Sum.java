package sting.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// Input : two input
		// output : two output
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		
		s1 = scanner.next();
		s2 = scanner.next();
		
		System.out.println("s1 : "+ s1 + ", s2 :"+ s2);
		
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
		
		System.out.println("sum : " + a+b);
		System.out.println("sum : " + (a+b));
		System.out.printf("%d + %d  = %d", a, b, a+b);
		scanner.close();
	}

}
