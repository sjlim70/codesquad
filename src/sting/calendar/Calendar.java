package sting.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int InputValue;
		
		Scanner scanner = new Scanner(System.in);
		
		//String strNum = scanner.next();
		
		InputValue = scanner.nextInt();
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
//		if(InputValue == 2)
//		{
//			System.out.println("28");
//		}
//		else if(InputValue == 1 ||InputValue == 3 ||InputValue == 5 ||InputValue == 7 
//				||InputValue == 8 ||InputValue == 10 ||InputValue == 12)
//		{
//			System.out.println("31");
//		}
//		else if(InputValue == 4 ||InputValue == 6 ||InputValue == 9 ||InputValue == 11)
//		{
//			System.out.println("30");
//		}
		System.out.printf("%d 월은 %d 일까지 있습니다.\n", InputValue, maxDays[InputValue -1]);
		scanner.close();

	}

}
