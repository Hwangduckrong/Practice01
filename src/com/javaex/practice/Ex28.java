package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner change = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		double money = change.nextDouble();
		
		double US= money/1230.95;
		System.out.print("받으실 달러는 "+US);
		

	change.close();
	}

}
