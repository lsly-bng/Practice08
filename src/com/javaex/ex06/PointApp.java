package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		/*결과예상 : 
		 * false (p1 == p2) --> 주소가 다름 
		 * false (p2 == p3) --> 주소가 다름
		 * false (p3 == p4) --> 주소가 다름
		 * true (p4 == p1) --> p4 = p1 (주소가 같음)
		 * false (p1.equals(p2)) --> 입력 값은 같지만 주소가 다름
		 * true (p4.equals(p1)) --> 입력 값은 다르지만 주소가 같음

		equals() 메소드는 기본으로 정의되어 있기 때문에, 
		따로 재정의 혹은 오버라이드로 변경하지 않는 이상, 
		equals() 메소드를 불러오는데 문제 없음.
  		 */
		
	}
}


