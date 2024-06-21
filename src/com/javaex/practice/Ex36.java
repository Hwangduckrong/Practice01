package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner ai = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		long km = ai.nextLong();
		long A = 300000;
		long B = 31536000;
		System.out.println("빛이 1년 동안 가는 거리는 "+(km*A*B)+ "km입니다.");



		ai.close();
	}

}
