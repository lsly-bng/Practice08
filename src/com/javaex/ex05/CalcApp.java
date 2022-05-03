package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		while (true) {

			System.out.print(">>");
			String input = sc.nextLine();

			if (input.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else {
				try {
					String[] data = input.split(" ");

					int a = Integer.parseInt(data[0]);
					int b = Integer.parseInt(data[2]);

					switch (data[1]) {
					case "+":
						add.setValue(a, b);
						System.out.println(add.calculate());
						break;
					case "-":
						sub.setValue(a, b);
						System.out.println(sub.calculate());
						break;
					case "*":
						mul.setValue(a, b);
						System.out.println(mul.calculate());
						break;
					case "/":
						div.setValue(a, b);
						System.out.println(div.calculate());
						break;
					default:
						System.out.println("알 수 없는 연산자입니다.");
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("Error: 숫자와 연산자 사이 공백 필요." + e.getLocalizedMessage());
				} catch (Exception ex) {
					System.out.println("Error: 에러입니다." + ex.getLocalizedMessage());
				}
			}
		}
		sc.close();
	}
}