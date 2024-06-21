package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
	 Scanner circle = new Scanner(System.in);
	 final double PI = 3.14;
	 System.out.println("반지름을 입력하세요: ");
	 double half =circle.nextDouble();
	 double result = PI*half*half;
	 System.out.println("원의 넓이는" + result);
	 
	 circle. close();
	 

	}

}
