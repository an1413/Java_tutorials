package org.opentutorials.condition;

public class Array_each {

	public static void hi() {
		String[] members = {"안나별", "안하준", "안예은"};
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
		// 멤버의 값을 변수 e에 담음..!!
	}
	public static void main(String[] args) {
		hi();
		hi();
		hi();
		
	}
}
