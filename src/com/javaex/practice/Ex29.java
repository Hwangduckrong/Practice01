package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner square = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		double A = square.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double B= square.nextDouble();
		System.out.print("사각형의 넓이는 "+(A*B));
		System.out.println("사각형의 둘레는 "+(A+B)*2);
		
		square.close();
	}

}
