package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner ai = new Scanner(System.in);
		System.out.print("화씨: ");
		double F = ai.nextDouble();
		System.out.println("화씨 "+ F+"의"+" 섭씨온도는 "+((double)5/9*(F-32))+" 입니다.");
				
		ai.close();

	}

}
