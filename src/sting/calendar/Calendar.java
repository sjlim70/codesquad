package sting.calendar;

import java.util.Scanner;

public class Calendar {

	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {

		return MAX_DAYS[month - 1];
	}

	public void calendarSample() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int InputValue;

		System.out.println("반복 횟수를 입력하세요 ?");

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int repeat = scanner.nextInt();

		for (int i = 0; i < repeat; i++) {
			// String strNum = scanner.next();
			System.out.println("달을 입력하세요 ?");
			InputValue = scanner.nextInt();

			System.out.printf("%d 월은 %d 일까지 있습니다.\n", InputValue, cal.getMaxDaysOfMonth(InputValue));
		}
		System.out.println("Bye~!");
		scanner.close();

	}

}
