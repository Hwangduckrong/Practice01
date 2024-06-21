package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner ai = new Scanner(System.in);
		System.out.print("가로: ");
		double A = ai.nextDouble();
		System.out.print("세로: ");
		double B = ai.nextDouble();
		System.out.print("삼각형의 넓이는 "+(0.5*A*B)+"입니다.");
		ai.close();

	}

}
