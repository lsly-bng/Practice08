package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Friend[] fArray = new Friend[3];
		System.out.println("친구를 3명 등록해주세요.");

		for (int i = 0; i < fArray.length; i++) {
			String[] input = sc.nextLine().split(" ");
			fArray[i] = new Friend(input[0], input[1], input[2]);
		}

		for (int i = 0; i < fArray.length; i++) {
			fArray[i].showInfo();
		}

		sc.close();
	}
}
